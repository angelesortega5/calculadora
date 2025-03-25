package com.maol.demo.calculadora.service;

public class Calculadora {

	public int suma(int parametroNumero1, int parametroNumero2) {
		return parametroNumero1 + parametroNumero2;
	}

	public int resta(int parametroNumero1, int parametroNumero2) {
		return parametroNumero1 - parametroNumero2;
	}

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		int parametroNumero1 = 2;
		int parametroNumero2 = 3;

		System.out.println(calculadora.suma(parametroNumero1, parametroNumero2));
		System.out.println(calculadora.suma(3, 3));

		System.out.println(calculadora.resta(2, 2));
		System.out.println(calculadora.resta(parametroNumero1, parametroNumero2));
	}

}
