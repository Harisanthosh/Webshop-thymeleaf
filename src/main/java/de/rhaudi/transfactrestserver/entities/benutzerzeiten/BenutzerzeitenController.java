package de.rhaudi.transfactrestserver.entities.benutzerzeiten;

import de.rhaudi.transfactrestserver.server.ServerMapping;
import de.rhaudi.transfactrestserver.util.Specifications;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BenutzerzeitenController extends ServerMapping {

    @Autowired
    BenutzerzeitenRep benutzerzeitenRep;

    //Get All
    @GetMapping("/benutzerzeiten")
    public List<BenutzerzeitenEntity> getAllBenutzerzeiten(
            @RequestParam(value = "asId", required = false) Long[] asId
    ) {

        if (asId != null) {
            Specification<BenutzerzeitenEntity> specification = Specifications.<BenutzerzeitenEntity>and()
                    .eq("bzAsId", asId)
                    .build();

            return benutzerzeitenRep.findAll(specification);
        }

        return benutzerzeitenRep.findAll();
    }


    //Get Single
    @GetMapping("/benutzerzeiten/{id}")
    public BenutzerzeitenEntity getById(@PathVariable(value = "id") Long id) {
        return benutzerzeitenRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
    }

    @PostMapping("/benutzerzeiten")
    public BenutzerzeitenEntity createBenutzerzeitenEntity(@Valid @RequestBody BenutzerzeitenEntity benutzerzeitenEntity) {
        return benutzerzeitenRep.save(benutzerzeitenEntity);
    }


    //Update
    @PutMapping("/benutzerzeiten/{id}")
    public BenutzerzeitenEntity updateBenutzerzeitenEntity(@PathVariable(value = "id") Long id,
                                                           @Valid @RequestBody BenutzerzeitenEntity benutzerzeitenDetails) {

        BenutzerzeitenEntity benutzerzeitenEntity = benutzerzeitenRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());


        BenutzerzeitenEntity entity = benutzerzeitenRep.save(benutzerzeitenEntity);
        return entity;
    }


}
