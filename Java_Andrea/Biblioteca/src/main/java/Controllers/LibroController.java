package Controllers;

import Models.Libro;

public class LibroController {
	public LibroController() {}
	public void guardarLibro(int codigo, String autor, String titulo, int anio, String estado, String editorial) {
		Libro l = new Libro(codigo, autor, titulo, anio, estado, editorial);
	}
}
