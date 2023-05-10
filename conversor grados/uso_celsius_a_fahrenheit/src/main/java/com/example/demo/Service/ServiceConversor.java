package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Conversor;


@Service
public class ServiceConversor {
		public ServiceConversor() {}
		
		public Double conversorCelFa(Double grados) {
				Conversor conver = new Conversor(grados);
				return conver.ConvertirCelsiusAFarenheit();
		}
		
		public Double conversorFaCel(Double grados) {
			Conversor conver = new Conversor(grados);
			return conver.ConvertirFarenheitACelsius();
	}
}
