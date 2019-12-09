package de.rhaudi.transfactrestserver.entities.artikel;

import de.rhaudi.transfactrestserver.entities.arbeitsschritte.ArbeitsschritteEntity;
import de.rhaudi.transfactrestserver.entities.arbeitsschritte.ArbeitsschritteRep;
import de.rhaudi.transfactrestserver.entities.chargen.ChargenEntity;
import de.rhaudi.transfactrestserver.entities.chargen.ChargenRep;
import de.rhaudi.transfactrestserver.entities.fabaum.FabaumEntity;
import de.rhaudi.transfactrestserver.entities.fabaum.FabaumRep;
import de.rhaudi.transfactrestserver.server.ServerMapping;
import de.rhaudi.transfactrestserver.util.Specifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Sort;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.lang.Exception;
import java.lang.Integer;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ArtikelController extends ServerMapping {

    @Autowired
    ArtikelRep artikelRep;
    @Autowired
    ArbeitsschritteRep arbeitsschritteRep;
    @Autowired
    ChargenRep chargenRep;
    @Autowired
    FabaumRep fabaumRep;

    // Get All
    @GetMapping("/artikel")
    public List<ArtikelEntity> getAllArtikel(@RequestParam(value = "chargenIds", required = false) Long[] chargenIds) {

        if (chargenIds != null) {
            Specification<ChargenEntity> specification = Specifications.<ChargenEntity>and().eq("chId", chargenIds)
                    .build();

            List<ChargenEntity> chargenEntities = chargenRep.findAll(specification);

            List<Long> longsFabaumIds = new ArrayList<>();

            for (ChargenEntity chargenEntity : chargenEntities) {
                longsFabaumIds.add(chargenEntity.getChFbId());
            }

            Specification<FabaumEntity> specificationFabaum = Specifications.<FabaumEntity>and()
                    .eq("fbId", longsFabaumIds.toArray(new Long[0])).build();

            List<FabaumEntity> fabaumEntities = fabaumRep.findAll(specificationFabaum);

            List<Long> artikelIds = new ArrayList<>();

            for (FabaumEntity fabaumEntity : fabaumEntities) {
                artikelIds.add(fabaumEntity.getFbArtId());
            }

            Specification<ArtikelEntity> specificationArtikel = Specifications.<ArtikelEntity>and()
                    .eq("artId", artikelIds.toArray(new Long[0])).build();

            return artikelRep.findAll(specificationArtikel);

        }

        return artikelRep.findAll();
    }

    @GetMapping("/artikel/lastIDorder")
    public int getLastIDorder() {
        try {

            File file = new File("mon-fichier.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st = br.readLine();
            System.out.println(st);
            PrintWriter writer = new PrintWriter("mon-fichier.txt", "UTF-8");
            writer.println(Integer.parseInt(st) + 1);
            writer.close();

            return Integer.parseInt(st);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return -1;
    }

    // Get Single
    @GetMapping("/artikel/{id}")
    public ArtikelEntity getById(@PathVariable(value = "id") Long id) {
        return artikelRep.findById(id).orElseThrow(() -> new ResourceNotFoundException());
    }

    @GetMapping(value = "/artikel/{id}/arbeitsschritte")
    public List getArbeitsschritteByArtikelId(@PathVariable(value = "id") Long id) {
        ArtikelEntity artikelEntity = artikelRep.getOne(id);
        // Filter
        Specification<ArbeitsschritteEntity> specification = Specifications.<ArbeitsschritteEntity>and()
                .eq("asArtId", artikelEntity.getArtId()).build();
        return arbeitsschritteRep.findAll(specification);
    }

    @PostMapping("/artikel")
    public ArtikelEntity createArtikelEntity(@Valid @RequestBody ArtikelEntity artikelEntity) {
        return artikelRep.save(artikelEntity);
    }

}
