package com.example.nttdata.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("obtener")
	public String factura() {
		return "factura";
	}
}
