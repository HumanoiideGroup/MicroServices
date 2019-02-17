package com.spring.cloud.api.ribbon.ereuka.client.app.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
/*****
 * 
 * @author Marc Montan
 *
 */
@RestController
public class IntegrationController {
 
	private Logger logger = Logger.getLogger(getClass());
	
    @Autowired
    Environment environment;
 
    @GetMapping("/")
    public String health() {
    	 return "Montan test hello ribbon eureka client";
    }
 
    @GetMapping("/backend")
    public String backend() {
        logger.info("::::: CONTROLLER DE TEST / DEBUT :::::");
    	String _response_ = "KO";
    	try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
        logger.info("::::: CONTROLLER DE TEST / FIN :::::");
 
        return _response_;
    }
}