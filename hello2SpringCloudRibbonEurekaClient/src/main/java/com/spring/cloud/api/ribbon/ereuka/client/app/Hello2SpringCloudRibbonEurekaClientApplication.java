package com.spring.cloud.api.ribbon.ereuka.client.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Hello2SpringCloudRibbonEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Hello2SpringCloudRibbonEurekaClientApplication.class, args);
	}

}

