package de.rhaudi.transfactrestserver.entities.fabaum;

import de.rhaudi.transfactrestserver.server.ServerMapping;
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
public class FabaumController extends ServerMapping {

    @Autowired
    FabaumRep fabaumRep;


    //Get Single
    @GetMapping("/fabaum/{id}")
    public FabaumEntity getById(@PathVariable(value = "id") Long id) {
        return fabaumRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
    }

    @GetMapping("/fabaum")
    public List getFaBaumByArtikelId(
            @RequestParam(value = "artikelIds", required = false) Long[] artikelIds
    ) {
        if (artikelIds != null) {
            Specification<FabaumEntity> specification = Specifications.<FabaumEntity>and()
                    .eq("fbArtId", artikelIds)
                    .build();
            return fabaumRep.findAll(specification);
        }

        return fabaumRep.findAll();
    }

    @PostMapping("/fabaum")
    public FabaumEntity createFabaumEntity(@Valid @RequestBody FabaumEntity fabaumEntity) {
        return fabaumRep.save(fabaumEntity);
    }


}
