package com.example.demo;

public class Conversor {
		public double Grados;
		
		public Conversor(double grados) {
			Grados = grados;
		}

		public double ConvertirCelsiusAFarenheit() {
			return (Grados * 1.8) +32;
		}
		
		public double ConvertirFarenheitACelsius() {
			return (Grados -32) /1.8;
		}
}
