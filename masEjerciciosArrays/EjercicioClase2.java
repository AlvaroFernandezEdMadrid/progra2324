package masEjerciciosArrays;

import Libreria.Libreria;
import daw.com.Pantalla;
import daw.com.Teclado;

public class EjercicioClase2 {
	public static void main(String[] args) {
		//rellenar matriz, sumar columnas y filas en otro array, comprobar si son iguales.
		int filas, columnas, matriz[][], sumaRows[], sumaCols[], contador=0;
		String cosa="";
		
		columnas=Libreria.leerEnteroPositivo("Columnas: ");
		filas=Libreria.leerEnteroPositivo("Filas: ");
		
		matriz=new int[filas][columnas];
		sumaCols=new int[columnas];
		sumaRows=new int[filas];
		
		//Rellenar
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=Teclado.leerInt("Numero ["+i+"]["+j+"]:");
			}
		}
		
		//Mostrar matriz
		for (int i = 0; i < matriz.length; i++) {
			cosa="";
			for (int j = 0; j < matriz[i].length; j++) {
				cosa+="["+matriz[i][j]+"]";
			}
			System.out.println("\n"+cosa);
		}
		
		System.out.println("Separador");
		
		//Sumar filas
		
		for (int j = 0; j < matriz.length; j++) {
			sumaRows[j]=0;
			for (int k = 0; k < matriz[j].length; k++) {
				sumaRows[j]+=matriz[j][k];
			}
		
		}
		
		
		
		//mostrar
		for (int i = 0; i < sumaRows.length; i++) {
			Pantalla.escribirString("\n ["+sumaRows[i]+"]");
		}
		
		System.out.println("\nSeparador");
		//Sumar columnas
		
		for (int i = 0; i < matriz[0].length; i++) {
			sumaCols[i]=0;
			for (int j = 0; j < matriz.length; j++) {
				sumaCols[i]=matriz[j][i];
			}
		}
		
		//mostrar
		for (int i = 0; i < sumaCols.length; i++) {
			Pantalla.escribirString("\n ["+sumaCols[i]+"]");
		}
		
	}
	
}
