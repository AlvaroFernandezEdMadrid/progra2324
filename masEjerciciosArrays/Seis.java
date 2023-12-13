package masEjerciciosArrays;

import java.util.Iterator;

import javax.print.attribute.standard.Media;

import Libreria.Libreria;
import daw.com.Teclado;

public class Seis {

	public static void main(String[] args) {
		int nAlumnos, nNotas, opcion, notas[][];
		String nomAlumno[];
		
		nAlumnos=Libreria.leerEnteroPositivo("Cuantos alumnos: ");
		nomAlumno=new String[nAlumnos];
		notas=new int[nAlumnos][];
		
		for (int i = 0; i < nomAlumno.length; i++) {
			nomAlumno[i]=Teclado.leerString("Nombre del alumno "+i+":");
			nNotas=Libreria.leerEnteroPositivo("Cuantas notas:");
			notas[i]=new int[nNotas];
			for (int j = 0; j < notas[i].length; j++) {
				notas[i][j]=Libreria.leerEntreLimites(1, 10, "Nota:");
			}
		}
		
		do {
			mostrarOpciones();
			opcion=Libreria.leerEntreLimites(1, 7, "Eleccion: ");
			evaluarOpcion(opcion, nomAlumno, notas);
		} while (opcion!=7);
		
	}

	private static void mostrarOpciones() {
		System.out.println("Elige una opcion:");
		System.out.println("1. Buscar un alumno y mostrar sus datos");
		System.out.println("2. Modificar una nota de un alumno");
		System.out.println("3. Mostrar la media de todas las notas de todos los alumnos");
		System.out.println("4. Mostrar la media y el nombre de los alumnos que tengan alguna nota menor que 5");
		System.out.println("5. Mostrar nombre del alumno que mejor nota media ha sacado");
		System.out.println("6. Listar los alumnos ordendos alfabéticamente");
		System.out.println("7. Salir");
	}

	private static void evaluarOpcion(int opcion, String[] nomAlumno, int[][] notas) {
		switch (opcion) {
		case 1:
			buscarYMostrarAlumno(nomAlumno, notas);
			break;
		case 2:
			modNotaAlumno(nomAlumno, notas);
			break;
		case 3:
			mostrarMedia(notas);
			break;
		case 4:
			mostrarMediaMen5(nomAlumno, notas);
			break;
		case 5:
			mostrarMejor(nomAlumno, notas);
			break;
		case 6:
			listarAlumnos(nomAlumno, notas);
			break;
		}
	}

	private static void buscarYMostrarAlumno(String[] nomAlumno, int[][] notas) {
		// TODO Auto-generated method stub
		String alumnoABuscar;
		int posAlumno=-1;
		
		alumnoABuscar=Teclado.leerString("Nombre del alumno a buscar: ");
		
		posAlumno=buscarAlumno(alumnoABuscar, nomAlumno);
		
		if (posAlumno!=-1) {
			mostrarAlumno(posAlumno, nomAlumno, notas);
		}
		else
			System.out.println("Alumno no encontrado");
		
	}

	private static void modNotaAlumno(String[] nomAlumno, int[][] notas) {
		String alumnoABuscar;
		int posAlumno=-1;
		int posNotaAModificar=-1;
		
		do {
			alumnoABuscar=Teclado.leerString("Nombre del alumno a modificar: ");
			posAlumno=buscarAlumno(alumnoABuscar, nomAlumno);
		} while (posAlumno==-1);
		
		posNotaAModificar=Libreria.leerEntreLimites(0, notas[posAlumno].length-1, "Que nota?");
		
		notas[posAlumno][posNotaAModificar]=Libreria.leerEntreLimites(1, 10, "Nueva nota: ");
	}

	private static void mostrarMedia(int[][] notas) {
		float media=0;
		
		media=calcularMedia(notas);
		
		System.out.println("Media: "+media);
	}

	private static void mostrarMediaMen5(String[] nomAlumno, int[][] notas) {
		
	}

	private static void mostrarMejor(String[] nomAlumno, int[][] notas) {
		String nomMejor="";
		int posMejor;
		
		posMejor=0;
		
		for (int i = 0; i < notas.length; i++) {
			
		}
		
	}

	private static void listarAlumnos(String[] nomAlumno, int[][] notas) {
		
	}

	private static void mostrarAlumno(int posAlumno, String[] nomAlumno, int[][] notas) {
		System.out.println("El alumno "+nomAlumno[posAlumno]+" tiene las siguientes notas: ");
		for (int i = 0; i < notas[posAlumno].length; i++) {
			System.out.println(notas[posAlumno][i]);
		}
	}

	private static int buscarAlumno(String nombreABuscar, String[] nomAlumno) {
		int pos=-1;
		
		for (int i = 0; i < nomAlumno.length; i++) {
			if (nomAlumno[i].equalsIgnoreCase(nombreABuscar)) {
				pos=i;
			}
		}
		
		return pos;
	}
	
	private static float calcularMedia(int[][] notas) {
		float acum=0;
		int totalNotas=0;
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas.length-1; j++) {
				acum+=notas[i][j];
				totalNotas++;
			}
		}
		
		acum/=totalNotas;
		
		return acum;
	}
}
