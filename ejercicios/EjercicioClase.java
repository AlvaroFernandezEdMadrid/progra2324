package ejercicios;

import daw.com.Teclado;

public class EjercicioClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Leer coordenadas de un punto (x,y) de tal manera que no pueda ser el punto 0,0
*/
		int pX, pY;
		
		do {
			pX=Teclado.leerInt("Introduce la coordenada X: ");
			pY=Teclado.leerInt("Introduce la coordenada Y: ");
		} while (pX==0 && pY==0);
		
		System.out.println("Punto X: "+pX+"\nPunto Y: " +pY);
		
	}

}
