package com.example.demo.estados;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="estados")
public class Estados {
	private List<String> listaEstados= new ArrayList<>();
	
	//crear tres tipos de operaciones -> ver estados almacenados , escribir estado y borrar estado
	
	
	@ReadOperation
	public List<String> listEstados(){
		return listaEstados;
	}
	
	
	@WriteOperation
	public void saveEstado(@Selector String estadoNuevo) {
		listaEstados.add(estadoNuevo);
	}	
	
	@DeleteOperation
	public void deleteEstado(@Selector String estadoNuevo) {
		listaEstados.remove(estadoNuevo);
	}	
}
