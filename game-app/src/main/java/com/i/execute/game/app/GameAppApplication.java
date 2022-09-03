package com.i.execute.game.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.i.execute")
@EntityScan("com.i.execute.core")
@EnableJpaRepositories({"com.i.execute.game.core.repositories"})
@PropertySource({
        "classpath:core.properties",
})
public class GameAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameAppApplication.class, args);
    }

}
