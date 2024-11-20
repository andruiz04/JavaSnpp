package Figuras;

public class Triangulo extends Figura {
	private float base, altura;
	
	//constructor
	public Triangulo(float b, float h) {
		this.base = b;
		this.altura = h;
	}
	public double getArea() {
		return this.base * this.altura / 2;
	}

}
