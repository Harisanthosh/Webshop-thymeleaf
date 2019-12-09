package de.rhaudi.transfactrestserver.entities.properties;

import de.rhaudi.transfactrestserver.server.ServerMapping;
import de.rhaudi.transfactrestserver.util.Specifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PropertiesController extends ServerMapping {

    @Autowired
    PropertiesRep propertiesRep;

    //Get All
    @GetMapping("/properties")
    public List<PropertiesEntity> getAllProperties(
            @RequestParam(value = "ppIds", required = false) Long[] ppIds
    ) {

        if (ppIds != null) {
            Specification<PropertiesEntity> specification = Specifications.<PropertiesEntity>and()
                    .eq("ppId", ppIds)
                    .build();
            return propertiesRep.findAll(specification);
        }

        return propertiesRep.findAll();
    }

    //Get Single
    @GetMapping("/properties/{id}")
    public PropertiesEntity getById(@PathVariable(value = "id") Long id) {
        return propertiesRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
    }

}
