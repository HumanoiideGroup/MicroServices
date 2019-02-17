package com.spring.cloud.api.ereuka.server.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.github.lalyos.jfiglet.FigletFont;

//import de.codecentric.boot.admin.config.EnableAdminServer;


/***
 * 
 * @author Marc  Montan
 *
 */
@SpringBootApplication
@EnableEurekaServer
//@EnableAdminServer
public class HelloSpringCloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringCloudEurekaServerApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println(FigletFont.convertOneLine("Spring cloud Eureka Server"));
        };
    }

}

