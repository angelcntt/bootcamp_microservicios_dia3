package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
@RequestMapping("api")
public class TestController {
	
	private Counter counter;
	
	public TestController(MeterRegistry registry) {
		this.counter=Counter
				.builder("invocaciones.hola")
				.register(registry);
	}
	
	
	@GetMapping("hola")
	String hola() {
		counter.increment();
		System.out.println(counter.count());
		return "hola mundo";
	}
}
