package alumnoConNotas;

import Libreria.Libreria;

public class AppAlumnoConNotas2 {

	/*Leer un conjunto de n alumnos (n se pide por el teclado). 
	Mostrar por pantalla la media de las notas de cada alumno, junto con su nombre.
	Mostrar la media de todo el grupo (la media de las medias).
	Subir un punto en todas las notas a los alumnos que tenga su nota media por debajo de la media del grupo.
	Mostrar todos los alumnos.*/
	
	public static void main(String[] args) {
		int nAlumnos;
		float medias[], mediaGrupal=0;
		AlumnoConNotas alumnos[];
		
		nAlumnos=Libreria.leerEnteroPositivo("Cuantos alumnos: ");
		alumnos=new AlumnoConNotas[nAlumnos];
		medias=new float[alumnos.length];
		
		//Construir cada alumno del array
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i]=new AlumnoConNotas();
			alumnos[i].leerDatos();
		}
		
		//Guardar la media de cada alumno en un array
		for (int i = 0; i < alumnos.length; i++) {
			medias[i]=alumnos[i].getNotaMedia();
		}
		
		//Mostrar media de cada alumno con su nombre
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i].getNombre()+medias[i]);
		}
		
		//Calcular media de medias
		for (int i = 0; i < medias.length; i++) {
			mediaGrupal+=medias[i];
		}
		
		mediaGrupal/=medias.length;
		
		//Mostrar media grupal
		
		System.out.println("La media grupal es: "+mediaGrupal);
		
		//Subir un punto a los que tengan media inferior a la grupal
		
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].getNotaMedia()<mediaGrupal) {
				//Recorrer notas del alumno y sumar
				for (int j = 0; j < alumnos[i].getNNotas(); j++) {
					alumnos[i].setNota(alumnos[i].getNota(j)+1, j);
				}
			}
		}
		
		//Mostrar datos de los alumnos
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i].mostrarDatos();
		}
		
		
	}

}
