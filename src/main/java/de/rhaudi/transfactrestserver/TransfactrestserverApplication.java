package de.rhaudi.transfactrestserver;

import de.rhaudi.transfactrestserver.ssh.Launch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAutoConfiguration
public class TransfactrestserverApplication {

    public static void main(String[] args) {
        if (!Launch.SSHConnectPps03()) return;
        SpringApplication.run(TransfactrestserverApplication.class, args);

    }
}
