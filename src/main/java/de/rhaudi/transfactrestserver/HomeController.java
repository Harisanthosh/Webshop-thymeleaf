package de.rhaudi.transfactrestserver;

import org.hibernate.stat.Statistics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Value("${messages.home:default-value}")
    private String message = "Hello World";

    @RequestMapping("/")
    public String welcome(Model model) {
        log.info("Spring Boot Thymeleaf Configuration Example");
        model.addAttribute("message", message);

        return "home";
    }
        @RequestMapping("/command")
    public String command(Model model) {
        log.info("Spring Boot Thymeleaf Configuration Example");
        model.addAttribute("message", message);

        return "command";
    }

            @RequestMapping("/command/{id}")
    public String commandItems(Model model, @PathVariable(value = "id") long id) {
        log.info("Spring Boot Thymeleaf Configuration Example");
        model.addAttribute("message", message);

        return "command";
    }
}