package de.rhaudi.transfactrestserver.entities.chargen;

import de.rhaudi.transfactrestserver.entities.arbeitsschritte.ArbeitsschritteEntity;
import de.rhaudi.transfactrestserver.entities.arbeitsschritte.ArbeitsschritteRep;
import de.rhaudi.transfactrestserver.entities.artikel.ArtikelEntity;
import de.rhaudi.transfactrestserver.entities.artikel.ArtikelRep;
import de.rhaudi.transfactrestserver.entities.fabaum.FabaumEntity;
import de.rhaudi.transfactrestserver.entities.fabaum.FabaumRep;
import de.rhaudi.transfactrestserver.server.ServerMapping;
import de.rhaudi.transfactrestserver.util.Specifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ChargenController extends ServerMapping {

    @Autowired
    ChargenRep chargenRep;
    @Autowired
    FabaumRep fabaumRep;
    @Autowired
    ArtikelRep artikelRep;
    @Autowired
    ArbeitsschritteRep arbeitsschritteRep;

    //Get All
    @GetMapping("/chargen")
    public List getAllChargen(
            @RequestParam(value = "artikel", required = false) Long artikelId,
            @RequestParam(value = "losstatus", required = false) Long losstatus,
            @RequestParam(value = "properties", required = false) Long properties,
            @RequestParam(value = "chargenIds", required = false) Long[] chargenIds
    ) {

        if (artikelId != null && losstatus == null && chargenIds == null) {
            List<ChargenEntity> filteredChargen = getChargenEntitiesByArtikelId(artikelId);

            return filteredChargen;
        }

        if (losstatus != null && artikelId == null && properties == null) {
            Specification<ChargenEntity> specification = Specifications.<ChargenEntity>and()
                    .eq("chPpIdLosstatus", losstatus)
                    .build();

            return chargenRep.findAll(specification);
        }

        if (losstatus != null && artikelId != null && chargenIds == null) {
            List<ChargenEntity> filteredChargen = getChargenEntitiesByArtikelId(artikelId);
            Iterator itr = filteredChargen.iterator();
            while (itr.hasNext()) {
                long losstate = ((ChargenEntity) itr.next()).getChPpIdLosstatus();
                if (losstate != losstatus) {
                    itr.remove();
                }
            }
            return filteredChargen;
        }

        if (properties != null) {
            return getListByPropertiesAndLosstatus(losstatus, properties);
        }

        if (chargenIds != null) {

            Specification<ChargenEntity> specification = Specifications.<ChargenEntity>and()
                    .eq("chId", chargenIds)
                    .build();

            List<ChargenEntity> chargenEntities = chargenRep.findAll(specification);

            return chargenEntities;

        }


        return chargenRep.findAll();
    }

    private List getListByPropertiesAndLosstatus(
            @RequestParam(value = "losstatus", required = false) Long losstatus,
            @RequestParam(value = "properties", required = false) Long properties) {
        Specification<ArbeitsschritteEntity> specification = Specifications.<ArbeitsschritteEntity>and()
                .eq("asPpIdAstyp", properties)
                .build();
        List<ArbeitsschritteEntity> arbeitsschritteEntities = arbeitsschritteRep.findAll(specification);

        List<Long> chargeIds = new ArrayList<>();

        for (ArbeitsschritteEntity arbeitsschritteEntity : arbeitsschritteEntities) {
            if (!chargeIds.contains(arbeitsschritteEntity.getAsChId())) {
                chargeIds.add(arbeitsschritteEntity.getAsChId());
            }
        }

        Long[] chargeIdsArray = chargeIds.toArray(new Long[0]);

        Specification<ChargenEntity> specificationCharge = null;
        if (losstatus != null) {
            specificationCharge = Specifications.<ChargenEntity>and()
                    .eq("chId", chargeIdsArray)
                    .eq("chPpIdLosstatus", losstatus)
                    .build();
            System.out.println("losstatus");
        } else {
            specificationCharge = Specifications.<ChargenEntity>and()
                    .eq("chId", chargeIdsArray)
                    .build();
        }
        return chargenRep.findAll(specificationCharge);
    }

    private List<ChargenEntity> getChargenEntitiesByArtikelId(@RequestParam(value = "artikel", required = false) Long artikelId) {
        Specification<FabaumEntity> specification = Specifications.<FabaumEntity>and()
                .eq("fbArtId", artikelId)
                .build();

        List<FabaumEntity> fabaumArtikelList = fabaumRep.findAll(specification);
        List<ChargenEntity> chargenList = chargenRep.findAll();
        List<ChargenEntity> filteredList = new ArrayList<>();
        for (FabaumEntity fabaumEntity : fabaumArtikelList) {
            long fabaumId = fabaumEntity.getFbId();
            for (Iterator<ChargenEntity> iter = chargenList.iterator(); iter.hasNext(); ) {
                ChargenEntity chargen = iter.next();
                if (fabaumId == chargen.getChFbId()) {
                    filteredList.add(chargen);
                    break;
                }
            }
        }
        return filteredList;
    }

    //Get Single
    @GetMapping("/chargen/{id}")
    public ChargenEntity getById(@PathVariable(value = "id") Long id) {
        return chargenRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
    }

    @GetMapping("/chargen/{id}/fabaum")
    public FabaumEntity getPropertiesByChargeId(@PathVariable(value = "id") Long id) {
        ChargenEntity chargenEntity = chargenRep.findById(id).get();
        return fabaumRep.findById(chargenEntity.getChFbId())
                .orElseThrow(() -> new ResourceNotFoundException());
    }

    @GetMapping("/chargen/{id}/fabaum/artikel")
    public List getArtikelByFabaum(@PathVariable(value = "id") Long id) {
        ChargenEntity chargenEntity = chargenRep.findById(id).get();
        long chargeToFabaumId = chargenEntity.getChFbId();

        FabaumEntity fabaumEntity = fabaumRep.findById(chargeToFabaumId).get();

        long fabaumToArtikelId = fabaumEntity.getFbArtId();
        //Filter
        //GenericSpecification spec = new GenericSpecification(new SearchCriteria("artId", ":", fabaumToArtikelId));

        Specification<ArtikelEntity> specification = Specifications.<ArtikelEntity>and()
                .eq("artId", fabaumToArtikelId)
                .build();

        return artikelRep.findAll(specification);
    }


    //Update
    @PutMapping("/chargen/{id}")
    public ChargenEntity updatChargenEntity(@PathVariable(value = "id") Long id,
                                    @Valid @RequestBody ChargenEntity chargenDetails) {
        ChargenEntity chargenEntity = chargenRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());

        //Update
        chargenEntity.setChPpIdLosstatus(chargenDetails.getChPpIdLosstatus());

        //Update Ende

        ChargenEntity entity = chargenRep.save(chargenEntity);
        return entity;
    }

    @PostMapping("/chargen")
    public ChargenEntity chargenEntity(@Valid @RequestBody ChargenEntity chargenEntity) {
        return chargenRep.save(chargenEntity);
    }

}
