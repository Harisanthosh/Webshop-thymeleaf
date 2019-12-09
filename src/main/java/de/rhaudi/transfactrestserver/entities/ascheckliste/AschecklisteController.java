package de.rhaudi.transfactrestserver.entities.ascheckliste;

import de.rhaudi.transfactrestserver.server.ServerMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AschecklisteController extends ServerMapping {

    @Autowired
    AschecklisteRep aschecklisteRep;

    //Get All
    @GetMapping("/ascheckliste")
    public List<AschecklisteEntity> getAllAscheckliste() {
        return aschecklisteRep.findAll();
    }

    //Get Single
    @GetMapping("/ascheckliste/{id}")
    public AschecklisteEntity getById(@PathVariable(value = "id") Long id) {
        return aschecklisteRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
    }

}
