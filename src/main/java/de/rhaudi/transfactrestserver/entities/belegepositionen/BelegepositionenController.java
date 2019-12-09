package de.rhaudi.transfactrestserver.entities.belegepositionen;

import de.rhaudi.transfactrestserver.server.ServerController;
import de.rhaudi.transfactrestserver.server.ServerMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BelegepositionenController extends ServerMapping {

    @Autowired
    BelegepositionenRep belegpositionenRep;

    //Get All
    @GetMapping("/belegepositionen")
    public List<BelegepositionenEntity> getAllBelegepositionen() {
        return belegpositionenRep.findAll();
    }

    //Get Single
    @GetMapping("/belegepositionen/{id}")
    public BelegepositionenEntity getById(@PathVariable(value = "id") Long id) {
        return belegpositionenRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
    }

    //Update
    @PutMapping("/belegepositionen/{id}")
    public BelegepositionenEntity updateBelegepositionen(@PathVariable(value = "id") Long id,
                                            @Valid @RequestBody BelegepositionenEntity belegpositionenDetails) {

        BelegepositionenEntity belegpositionenEntity = belegpositionenRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());

        //Objekt ab hier bearbeiten
        belegpositionenEntity.setPosLieferterminIst(belegpositionenDetails.getPosLieferterminIst());
        //Ende

        BelegepositionenEntity entity = belegpositionenRep.save(belegpositionenEntity);
        return entity;
    }



}
