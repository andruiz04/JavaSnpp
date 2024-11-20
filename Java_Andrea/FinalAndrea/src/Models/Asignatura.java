package Models;

public class Asignatura {
	//Comentario 1:
	public int codigo;
	public String nombre;
	
	public Asignatura() {
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Asignatura(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

}
