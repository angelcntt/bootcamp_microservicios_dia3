package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Conversor;
import com.example.demo.Service.ServiceConversor;

@RequestMapping("/conversor/")
@RestController
public class ControllerConversor {
		
	ServiceConversor serviceConvesor;

	public ControllerConversor(ServiceConversor serviceConvesor) {
		this.serviceConvesor = serviceConvesor;
	}
	
	@GetMapping("/celsiusAfahrenheit/{grados}")
	public double celFah(@PathVariable("grados") double grados) {
		Conversor conversor = new Conversor(grados);
		return conversor.ConvertirCelsiusAFarenheit();
	}
	
	@GetMapping("/fahrenheitAcelsius/{grados}")
	public double fahCel(@PathVariable("grados") double grados) {
		Conversor conversor = new Conversor(grados);
		return conversor.ConvertirFarenheitACelsius();
	}
}
