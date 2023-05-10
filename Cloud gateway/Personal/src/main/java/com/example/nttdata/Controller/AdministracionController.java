package com.example.nttdata.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("administracion")
public class AdministracionController {
	@GetMapping("obtener")
	public String personal() {
		return "personal administracion";
	}
}
