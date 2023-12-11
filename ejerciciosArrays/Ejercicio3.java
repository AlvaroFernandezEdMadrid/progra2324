package ejerciciosArrays;

import Libreria.Libreria;
import daw.com.Teclado;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*Leer n alumnos, leer la nota de cada uno, 
		 * determinar quien tiene la nota mas alta y mas baja. 
		 * Calcular media. 
		 * Listar alumnos que superan la media.
		 * Calcular porcentaje aprobados.
		 */
		int nAlumnos, posicionMas, posicionMenos, aprobados=0, media=0, notas[];
		String nombres[];
		
		nAlumnos=Libreria.leerEnteroPositivo("Cuantos alumnos: ");
		
		notas=new int[nAlumnos];
		nombres=new String[nAlumnos];
		
		for (int i = 0; i < nombres.length; i++) {
			nombres[i]=Teclado.leerString("Nombre ["+i+"]: ");
			notas[i]=Libreria.leerEntreLimites(1, 10, "Nota ["+i+"]: ");
		}
		
		posicionMas=notas[0];
		posicionMenos=notas[0];
		
		for (int i = 1; i < notas.length; i++) {
			if (notas[i]>notas[posicionMas]) {
				posicionMas=i;
			}
			if (notas[i]<notas[posicionMenos]) {
				posicionMenos=i;
			}
			media+=notas[i];
		}
		
		media/=notas.length;
		
		System.out.println("La media es: "+media);
		
		for (int i = 0; i< notas.length; i++) {
			if (notas[i]>media) {
				System.out.println("El alumno "+nombres[i]+" esta por encima de la media.");
			}
			if (notas[i]>=5) {
				aprobados++;
			}
		}
		
		System.out.println("Ha aprobado un %" + ((aprobados*notas.length)/100));
		
		
		
		
	}

}
