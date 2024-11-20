package Calculadora;

public class CalculadoraCientifica extends Calculadora {
	//atributos
	String historial;
	
	//constructor
	public CalculadoraCientifica() {
		super(); //llamar al constructor de Calculadora
		this.historial = "Inicio: ";	
	}
	public void setNumeros(int n1, int n2) {
		this.num1 = n1;
		this.num2 = n2;
	}
	
	//metodos
	public double getPotencia() {
		float base = super.num1;
		float exponente = super.num2;
		super.resultado = Math.pow(base, exponente);
		this.historial = " " + base + "E" + exponente + " = " + super.resultado;
		return super.resultado;
	}
	
	public double getRaizCuadrada() {
		if (this.num1 >= 0) {
			this.resultado = Math.sqrt(this.num1);
		}else {
			System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
			this.resultado = 0;
		}
			
		return this.resultado;
	}
}
