package Models;

public class Libro extends Material{
	private String editorial;
	
	public Libro(int codigo, String autor, String titulo, int anio, String estado, String editorial) {
		super(codigo, autor, titulo, anio, estado);
		this.editorial = editorial;
		// TODO Auto-generated constructor stub
		
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	@Override
	public String toString() {
		return "Libro [getEditorial()=" + getEditorial() + ", getCodigo()=" + getCodigo() + ", getAutor()=" + getAutor()
				+ ", getTitulo()=" + getTitulo() + ", getAnio()=" + getAnio() + ", getEstado()=" + getEstado() + "]";
	}
	
}
