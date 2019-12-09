package de.rhaudi.transfactrestserver.entities.vwcheckliste;

import de.rhaudi.transfactrestserver.server.ServerController;
import de.rhaudi.transfactrestserver.util.Specifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import javax.validation.Valid;
import java.io.*;

@RestController
@RequestMapping("/api")
public class VwChecklisteController extends ServerController {

    @Autowired
    VwChecklisteRep vwchecklisteRep;

    //Get All
    @GetMapping("/vwcheckliste")
    public List<VwChecklisteEntity> getAllVwcheckliste(
            @RequestParam(value = "arbeitsschritte", required = false) Long arbeitsschritteId,
            @RequestParam(value = "arbeitsschritteIds", required = false) Long[] arbeitsschritteIds
    ) {

        if (arbeitsschritteId != null) {
            Specification<VwChecklisteEntity> specification = Specifications.<VwChecklisteEntity>and()
                    .eq("asId", arbeitsschritteId)
                    .build();
            return vwchecklisteRep.findAll(specification);
        }
        if (arbeitsschritteIds != null) {
            Specification<VwChecklisteEntity> specification = Specifications.<VwChecklisteEntity>and()
                    .eq("asId", arbeitsschritteIds)
                    .build();
            return vwchecklisteRep.findAll(specification);
        }


        return vwchecklisteRep.findAll();
    }

    //Get Single
    @GetMapping("/vwcheckliste/{id}")
    public VwChecklisteEntity getById(@PathVariable(value = "id") Long id) {
        return vwchecklisteRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
    }

    @PostMapping("/vwcheckliste")
    public VwChecklisteEntity createVwChecklisteEntity(@Valid @RequestBody VwChecklisteEntity vwChecklisteEntity) {
        return vwchecklisteRep.save(vwChecklisteEntity);
    }

}
