package Calculadora;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		//declarar la calculadora normal
		//declarar
		Calculadora miCalculadora;
		CalculadoraCientifica miCalculadoraCientifica;
		//instanciar
		miCalculadora = new Calculadora();
		miCalculadoraCientifica = new CalculadoraCientifica();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe un numero");
		float valor1 = sc.nextFloat();
		System.out.println("Escribe otro numero ");
		float valor2 = sc.nextFloat();
		miCalculadora.setNumeros(valor1, valor2);
		miCalculadoraCientifica.setNumeros(valor1, valor2);
		
		System.out.println("La suma es: " + miCalculadora.getSuma());
		System.out.println("La resta es: " + miCalculadora.getResta());
		System.out.println("La multiplicación es: " + miCalculadora.getProducto());
		System.out.println("La división es: " + miCalculadora.getDivision());
		System.out.println("La potencia es: " + miCalculadoraCientifica.getPotencia());
		System.out.println("La radicación es: " + miCalculadoraCientifica.getRaizCuadrada());
	
	}

}
