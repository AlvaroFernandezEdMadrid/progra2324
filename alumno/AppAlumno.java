package alumno;

public class AppAlumno {

	public static void main(String[] args) {
		//Crear 10 alumnos y leer sus datos del teclado
		//Mostrar los nombres de los alumnos que estan suspensos y son repetidores
		//Subir 1 punto a todos

		Alumno alumnos[], alumno;
		
		alumnos=new Alumno[10];
		
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i]=new Alumno();
		}
		
		for (int i = 0; i < alumnos.length; i++) {
			//alumnos[i].leerDatos();
			alumno=new Alumno();
			do {
				alumno.leerNia();
			} while (buscarEnArray(alumnos, alumno)!=-1);
			alumno.leerOtrosDatos();
			alumnos[i]=alumno;
		}
		
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].isSuspenso()&&alumnos[i].isRepetidor()) {
				System.out.println("Repetidores suspensos:");
				System.out.println(alumnos[i].getNombre());
			}
		}
		
		
		//Sumar 1 punto porque profe generoso
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].getNota()<10) {
				alumnos[i].setNota(alumnos[i].getNota()+1);
			}
		}
		
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("Notas finales:");
			alumnos[i].mostrarDatos();
		}
		
	}
	
	public static int buscarEnArray(Alumno arr1[], Alumno alumnoABuscar)
	{
		int pos=-1;
		
		for (int i = 0; i < arr1.length&&pos==-1; i++) {
			if (alumnoABuscar.equals(arr1[i])) {
				pos=i;
			}
		}
		
		return pos;
	}
}
