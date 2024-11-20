package Models;

//Comentario 1: Se genera el constructor vacío y luego el que contiene los otros parámetros como institución y materias.
public class Alumno extends Persona{
	String institucion;
	Asignatura[] materias;
	
	public Alumno() {		
	}

	public Alumno(String institucion, Asignatura[] materias) {
		super();
		this.institucion = institucion;
		this.materias = materias;
	}

	public Alumno(int c, String n, String a) {
		super(c, n, a);
	}

	public Alumno(int c) {
		super(c);
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public Asignatura[] getMaterias() {
		return materias;
	}

	public void setMaterias(Asignatura[] materias) {
		this.materias = materias;
	}
	
}
