package alumno;

public class AppAlumno {

	public static void main(String[] args) {
		// Crear 10 alumnos y leer sus datos del teclado
		//Mostrar los nombres de los alumnos que estan suspensos y son repetidores;

		Alumno alumnos[];
		
		alumnos=new Alumno[10];
		
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i]=new Alumno();
			alumnos[i].leerDatos();
		}
		
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].getNota()<5&&alumnos[i].isRepetidor()) {
				System.out.println(alumnos[i].getNombre());
			}
		}
		
		
	}

}
