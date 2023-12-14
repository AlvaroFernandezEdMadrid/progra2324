package masEjerciciosArrays;

import daw.com.Pantalla;
import daw.com.Teclado;

public class Dos {

	public static void main(String[] args) {
		int matrizA[][], matrizB[][];
		
		matrizA=new int[2][4];
		matrizB=new int[4][2];
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				matrizA[i][j]=Teclado.leerInt("Numero: ");
			}
		}
		
		System.out.println("Matriz A:");
		
		for (int i = 0; i < matrizA.length; i++) {
			
			for (int j = 0; j < matrizA[i].length; j++) {
				Pantalla.escribirString("["+matrizA[i][j]+"]");
			}
			System.out.println("\n");
		}
		
		matrizB=trasponer(matrizA);
		
		System.out.println("Matriz traspuesta:");
		
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				Pantalla.escribirString("["+matrizB[i][j]+"]");
			}
			System.out.println("\n");
		}
		
	}

	private static int[][] trasponer(int[][] matrizA) {
		int traspuesta[][];
		
		traspuesta=new int[4][2];
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				traspuesta[j][i]=matrizA[i][j];
			}
		}
		
		return traspuesta;
	}

}
