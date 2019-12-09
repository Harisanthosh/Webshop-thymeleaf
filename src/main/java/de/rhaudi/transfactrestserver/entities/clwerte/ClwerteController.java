package de.rhaudi.transfactrestserver.entities.clwerte;

import de.rhaudi.transfactrestserver.server.ServerMapping;
import de.rhaudi.transfactrestserver.util.Specifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ClwerteController extends ServerMapping {

    @Autowired
    ClwerteRep clwerteRep;

    //Get All
    @GetMapping("/clwerte")
    public List getAllClWerte(
            @RequestParam(value = "ascheckliste", required = false) Long asChecklisteId,
            @RequestParam(value = "arbeitsschritte", required = false) Long arbeitsschritteId
    ) {
        if (asChecklisteId != null) {
//            GenericSpecification filter = new GenericSpecification(new SearchCriteria("cwAlId", ":", asChecklisteId));

            Specification<ClwerteEntity> specification = Specifications.<ClwerteEntity>and()
                    .eq("cwAlId", asChecklisteId)
                    .build();


            return clwerteRep.findAll(specification);
        }
        if (arbeitsschritteId != null) {
//            GenericSpecification filter = new GenericSpecification(new SearchCriteria("cwAsId", ":", arbeitsschritteId));

            Specification<ClwerteEntity> specification = Specifications.<ClwerteEntity>and()
                    .eq("cwAsId", arbeitsschritteId)
                    .build();

            return clwerteRep.findAll(specification);
        }

        return clwerteRep.findAll();
    }


    //Get Single
    @GetMapping("/clwerte/{id}")
    public ClwerteEntity getById(@PathVariable(value = "id") Long id) {
        return clwerteRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
    }

    @PostMapping("/clwerte")
    public ClwerteEntity createClwerteEntity(@Valid @RequestBody ClwerteEntity clwerteEntity) {
        return clwerteRep.save(clwerteEntity);
    }

}
