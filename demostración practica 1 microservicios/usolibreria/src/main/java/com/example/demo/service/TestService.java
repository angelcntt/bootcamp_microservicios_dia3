package com.example.demo.service;
import org.springframework.stereotype.Service;

//cuidado con las rutas
import com.example.demo.Saludo;

@Service
public class TestService {
		
		public TestService() {}
	
		public String usoSaludo(String idioma) {
			Saludo  claseSaludo = new Saludo(idioma);
			
			return claseSaludo.mensajeSaludo();
		}
}
