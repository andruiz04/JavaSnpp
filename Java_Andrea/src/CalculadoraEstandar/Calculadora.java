package CalculadoraEstandar;

public class Calculadora {
	//atributos
	float num1, num2;
	double resultado;
	
	//constructor
	public Calculadora() {
		this.num1 = 0;
		this.num2 = 0;
		this.resultado = 0;
	}
	//métodos
	public void setNumeros(float x, float y) {
		this.num1 = x;
		this.num2 = y;
	}
	
	public double getSuma() {
		this.resultado = this.num1 + this.num2;
		return this.resultado;
	}
}
