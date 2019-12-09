package de.rhaudi.transfactrestserver.entities.artikelfreigabeobjekte;

import de.rhaudi.transfactrestserver.server.ServerMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArtikelfreigabeobjekteController extends ServerMapping {

    @Autowired
    ArtikelfreigabeobjekteRep artikelfreigabeobjekteRep;

    //Get All
    @GetMapping("/artikelfreigabeobjekte")
    public List<ArtikelfreigabeobjekteEntity> getAllArtikelfreigabeobjekte() {
        return artikelfreigabeobjekteRep.findAll();
    }

    //Get Single
    @GetMapping("/artikelfreigabeobjekte/{id}")
    public ArtikelfreigabeobjekteEntity getById(@PathVariable(value = "id") Long id) {
        return artikelfreigabeobjekteRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
    }
    /*
    //Update
    @PutMapping("/artikelfreigabeobjekte/{id}")
    public ArtikelfreigabeobjekteEntity updateNote(@PathVariable(value = "id") Long id,
                                            @Valid @RequestBody ArtikelfreigabeobjekteEntity artikelfreigabeobjekteDetails) {

        ArtikelfreigabeobjekteEntity artikelfreigabeobjekteEntity = artikelfreigabeobjekteRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());

        //Objekt ab hier bearbeiten
        //artikelfreigabeobjekteEntity.setAsAnweisung(artikelfreigabeobjekteDetails.getAsAnweisung());
        //Ende

        ArtikelfreigabeobjekteEntity entity = artikelfreigabeobjekteRep.save(artikelfreigabeobjekteEntity);
        return entity;
    }
    */
    /*
    // Delete
    @DeleteMapping("/artikelfreigabeobjekte/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long id) {
        ArtikelfreigabeobjekteEntity artikelfreigabeobjekteEntity = artikelfreigabeobjekteRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
        artikelfreigabeobjekteRep.delete(artikelfreigabeobjekteEntity);
        return ResponseEntity.ok().build();
    }
    */

}
