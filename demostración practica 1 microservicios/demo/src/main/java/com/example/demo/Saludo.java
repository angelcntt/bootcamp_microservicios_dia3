package com.example.demo;

public class Saludo {
 private String idioma;
 
	 public Saludo(String idioma ) {
		 this.idioma=idioma;
	 }
	 
	 
	 public String mensajeSaludo() {
		 String mensaje = "";
		 
		 switch (idioma) {
		 case "Castellano":
		 	mensaje= "Bienvenido";
		 	break;
		 case "Ingles":
			 	mensaje= "Welcome";
			 	break;
		 case "Frances":
			 	mensaje= "Bienvenu";
			 	break;
		 
		 default:
			 mensaje ="Bienvenido";
			 break;
		 }
		 
		 return mensaje;
	 }
}
