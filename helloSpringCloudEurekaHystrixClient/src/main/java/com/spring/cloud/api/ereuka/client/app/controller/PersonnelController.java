package com.spring.cloud.api.ereuka.client.app.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
 
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/***
 * @param id
 * @author Marc Montan TOA
 * @return
 */
@RestController
public class PersonnelController {
     
    private Logger logger = Logger.getLogger(getClass().getName());
    
	@Autowired
    RestTemplate restTemplate;
  
    @RequestMapping(value = "/try-ribbon/{id}", method = RequestMethod.GET)
    //@HystrixCommand(fallbackMethod = "fallbackMethod")
    public String tryRibbon(@PathVariable int id){
    	logger.info(":::::: TRY RIBBON ::::::");
    	String response = "OK TRY";    	
    	try {
            response = restTemplate.getForEntity("http://hello-ribbon-eureka-client",String.class).getBody();
            logger.info("Response Body " + response);
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        return response;
    }
     
    public String  fallbackMethod(int id){
         
        return ":::: Fallback response:: Aucun personnel retourne :::::";
    }
  
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
