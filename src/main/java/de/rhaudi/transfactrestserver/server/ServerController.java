package de.rhaudi.transfactrestserver.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ServerController {
    //Get All
    @GetMapping("/stats")
    public Map<String, Integer> getAllProperties() {
        return ServerMapping.getStatistics();
    }

}
