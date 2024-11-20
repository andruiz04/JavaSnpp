package Models;

public class Persona {
	//Comentario 1: Creación de las variables cédula, nombre y apellido
	public int cedula;
	public String nombre;
	public String apellido;
	
	public Persona() {
	}
	//Comentario 2: Inicialización del constructor
	public Persona(int c){
	setCedula(c);
	nombre = new String("Desconocido");
	apellido = new String("desconocido");
	}
	
	public Persona(int c, String n, String a)
	{
	setCedula(c);
	setNombre(n);
	setApellido(a);
	}
	//Comentario 3: Comprobación de que el número de cédula sea mayor a 500000
	public void setCedula(int c) {
	if (c > 500000) cedula = c;
	else c = 0; //
	}
	
	//Comentario 4: Comprobación del nombre
	public void setNombre(String n) {
		if (n.equals("")) //Comentario 6: Para evitar que al escribir enter o espacio se guarde como un espacio en blanco
		{
		System.out.println("Nombre no valido, se asignó Desconocido");
		nombre = new String("Desconocido");
		}
		else nombre = n;
	}
	
	
	public void setApellido (String a) {
		if (a.equals(""))
		{
			System.out.println("Apellido no valido, se asignó desconocido");
			apellido = new String("desconocido");
		}
		else apellido = a;
	}
	
	
	public int getCedula(){ return cedula; }
	
	public String getNombre(){ return nombre; }
	
	public String getApellido(){ return apellido; }
	
	//Comentario 5: Devolución de datos
	@Override
	public String toString() {
		return cedula + "," + nombre + ","	+ apellido;
	}
}
