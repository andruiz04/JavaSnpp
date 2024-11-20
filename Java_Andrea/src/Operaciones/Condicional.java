package Operaciones;

import java.util.Scanner;

public class Condicional {
	public static void main(String [] args) {
		//variables
		int edad;
		String nombre;
		//objeto Scanner ()
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		nombre = sc.nextLine();
		System.out.println("Ingrese su edad: ");
		edad = sc.nextInt();
		
		if(edad >= 18 && edad <=90) {
			System.out.println("* " + nombre + " eres mayor de edad");			
		}else if(edad < 18 && edad > 0) {
			System.out.println("* " + nombre + " eres menor de edad");
		}else {
			System.out.println("Los datos ingresados son erróneos");
		}
	}
}
