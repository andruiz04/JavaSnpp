package Views;

import Models.Alumno;
import Models.Asignatura;

public class TestAlumno {
	public static void main(String[] args) {
		Alumno prueba;
		
		Asignatura[] materias = new Asignatura[5];
		materias[0] = new Asignatura(1001, "Bioquímica");
		materias[1] = new Asignatura(1002, "Histología");
		materias[2] = new Asignatura(1003, "Anatomía");
		materias[3] = new Asignatura(1004, "Primeros Auxilios");
		materias[4] = new Asignatura(1005, "Medicina de la Comunidad");
		
		prueba = new Alumno("SNPP", materias);
		
		prueba.setCedula(7589462);
		prueba.setNombre("Kira");
		prueba.setApellido("Yukimura");
		
		System.out.println(prueba.toString());
		
		for (Asignatura materias1: materias) {
			System.out.println("Código: " + materias1.getCodigo() + ", Materia: " + materias1.getNombre());
		}
	}
}
