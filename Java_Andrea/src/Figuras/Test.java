package Figuras;

public class Test {
	public static void main(String[] args) {
		Rectangulo r;
		
		Triangulo t;
		
		Cuadrado c = new Cuadrado(10);
		
			
		r = new Rectangulo(10,5);
		
		t = new Triangulo(10,12); 
		
		System.out.println("El área del rectángulo es " + r.getArea());
		System.out.println("El área del cuadrado es " + c.getArea());
		System.out.println("El área del triángulo es " + t.getArea());
	}

}
