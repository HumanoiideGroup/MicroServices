package com.spring.cloud.api.ereuka.client.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

import com.github.lalyos.jfiglet.FigletFont;



/***
 * 
 * @author Marc Montan
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrixDashboard
public class HelloSpringCloudEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringCloudEurekaClientApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println(FigletFont.convertOneLine("Eureka Hystrix Client"));
        };
    }

}

