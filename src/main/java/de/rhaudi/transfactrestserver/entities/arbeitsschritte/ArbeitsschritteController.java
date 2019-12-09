package de.rhaudi.transfactrestserver.entities.arbeitsschritte;

import de.rhaudi.transfactrestserver.server.ServerMapping;
import de.rhaudi.transfactrestserver.util.Sorts;
import de.rhaudi.transfactrestserver.util.Specifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ArbeitsschritteController extends ServerMapping {

    @Autowired
    ArbeitsschritteRep arbeitsschritteRep;


    //Get All    
    @GetMapping("/arbeitsschritte")
    public List<ArbeitsschritteEntity> getAllArbeitsschritte(
            @RequestParam(value = "chargen", required = false) Long chargenId,
            @RequestParam(value = "chargenIds", required = false) Long[] chargenIds
    ) {

        //Sort
        Sort sort = Sorts.builder()
                .asc("asPosition")
                .build();


        if (chargenId != null) {
            //GenericSpecification spec = new GenericSpecification(new SearchCriteria("asChId", ":", chargenId));
            Specification<ArbeitsschritteEntity> specification = Specifications.<ArbeitsschritteEntity>and()
                    .eq("asChId", chargenId)
                    .build();


            return arbeitsschritteRep.findAll(specification, sort);
        }
        if (chargenIds != null) {
            //GenericSpecification spec = new GenericSpecification(new SearchCriteria("asChId", ":", chargenIds));

            Specification<ArbeitsschritteEntity> specification = Specifications.<ArbeitsschritteEntity>and()
                    .eq("asChId", chargenIds)
                    .build();
            return arbeitsschritteRep.findAll(specification, sort);
        }


        return arbeitsschritteRep.findAll(sort);
    }

    //Get Single
    @GetMapping("/arbeitsschritte/{id}")
    public ArbeitsschritteEntity getById(@PathVariable(value = "id") Long id) {
        return arbeitsschritteRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
    }

    //Update
    @PutMapping("/arbeitsschritte/{id}")
    public ArbeitsschritteEntity updateNote(@PathVariable(value = "id") Long id,
                                            @Valid @RequestBody ArbeitsschritteEntity arbeitsschritteDetails) {
        ArbeitsschritteEntity arbeitsschritteEntity = arbeitsschritteRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());

        //Objekt ab hier bearbeiten
        arbeitsschritteEntity.setAsInput(arbeitsschritteDetails.getAsInput());
        arbeitsschritteEntity.setAsOutput(arbeitsschritteDetails.getAsOutput());

        arbeitsschritteEntity.setAsPpIdRessource(arbeitsschritteDetails.getAsPpIdRessource());

        arbeitsschritteEntity.setAsBnIdAnmeldung(arbeitsschritteDetails.getAsBnIdAnmeldung());
        arbeitsschritteEntity.setAsBnIdAbmeldung(arbeitsschritteDetails.getAsBnIdAbmeldung());


        arbeitsschritteEntity.setAsDatAnmeldung(arbeitsschritteDetails.getAsDatAnmeldung());
        arbeitsschritteEntity.setAsDatAbmeldung(arbeitsschritteDetails.getAsDatAbmeldung());

        arbeitsschritteEntity.setAsAnzSubs(arbeitsschritteDetails.getAsAnzSubs());


        ArbeitsschritteEntity entity = arbeitsschritteRep.save(arbeitsschritteEntity);
        return entity;
    }

    @PostMapping("/arbeitsschritte")
    public ArbeitsschritteEntity arbeitsschritteEntity(@Valid @RequestBody ArbeitsschritteEntity arbeitsschritteEntity) {
        return arbeitsschritteRep.save(arbeitsschritteEntity);
    }

}
