package com.example.configservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

		 @Value("${reto-config-service.reto}")
		 private String myProduct;
	    
	    @GetMapping(path="/getProductName")
	    public String myProduct() {
	   	 return this.myProduct;
	    }

}
