package io.voitovich.testmodsentask.modsentaskconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ModsenTaskConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModsenTaskConfigServerApplication.class, args);
    }

}
