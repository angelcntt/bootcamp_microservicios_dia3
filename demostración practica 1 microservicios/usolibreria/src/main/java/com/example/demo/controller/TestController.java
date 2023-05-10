package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestService;

@RequestMapping("/api/")
@RestController
public class TestController {

	//@Autowired
	TestService testService;
	
	//ser recomienda usar la inyeccion por dependencia en el constructor
	public TestController(TestService testService) {
		this.testService= testService;
	}
	
	
	@GetMapping("saludo/{idioma}")
	public String Saludo(@PathVariable("idioma") String idioma) {
		String saludoidoma=testService.usoSaludo(idioma);
		return saludoidoma;
	}
}
