package alumnoConNotas;

import daw.com.Pantalla;

public class AppAlumnoConNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlumnoConNotas alumno;
		
		alumno = new AlumnoConNotas();
		
		alumno.leerDatos();
		
		alumno.mostrarDatos();
		
		Pantalla.escribirFloat("nota media", alumno.getNotaMedia());
		
		for (int i = 0; i < alumno.getNNotas(); i++)
			alumno.setNota(alumno.getNota(i) + 1, i);
		
		alumno.mostrarDatos();
		
		
	
		
	}

}