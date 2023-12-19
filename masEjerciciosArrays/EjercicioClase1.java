package masEjerciciosArrays;

import Libreria.Libreria;
import daw.com.Teclado;

//Guardar temperaturas de un conjunto de n dias, pedir maxima y minima, calcular y 
//mostrar los dias en los que ha hecho la temperatura minima.
//Leer una temperatura por teclado y decir que dias ha hecho esa temperatura.
public class EjercicioClase1 {

	public static void main(String[] args) {
		int nDias, tempMin, dia[][], tempABuscar=0; 
		
		nDias=Libreria.leerEnteroPositivo("Numero de dias a tratar: ");
		
		dia=new int[nDias][2];
		
		//Rellenar temperaturas minimas y maximas.
		for (int i = 0; i < dia.length; i++) {
			dia[i][0]=Teclado.leerInt("Temperatura minima dia "+i+":");
			do {
				dia[i][1]=Teclado.leerInt("Temperatura maxima dia "+i+":");
			} while (dia[i][0]>=dia[i][1]);
		}
		
		tempMin=dia[0][0];
		
		//Encontrar el dia mas frio.
		for (int i = 0; i < dia.length; i++) {
			for (int j = 0; j < dia[i].length; j++) {
				if (dia[i][j]<tempMin) {
					tempMin=dia[i][j];
				}
			}
		}
		
		//Mostrar los dias que hizo la temp. minima.
		for (int i = 0; i < dia.length; i++) {
			for (int j = 0; j < dia[i].length; j++) {
				if (dia[i][j]==tempMin) {
					System.out.println("El dia "+i+" hizo la temperatura minima.");
				}
			}
		}
		
		//Buscar el dia que hizo una temperatura.
		tempABuscar=Libreria.leerEnteroPositivo("Temperatura a buscar: ");
		
		for (int i = 0; i < dia.length; i++) {
			for (int j = 0; j < dia[i].length; j++) {
				if (dia[i][j]==tempABuscar) {
					System.out.println("El dia "+i+" hizo la temperatura de "+tempABuscar+" grados.");
				}
			}
		}
		
	}

}
