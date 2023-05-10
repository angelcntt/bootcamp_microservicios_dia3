package com.example.nttdata.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PersonalControllador {
		@GetMapping("obtener")
		public String personal() {
			return "personal";
		}
}
