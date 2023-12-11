package ejercicios;

import daw.com.Teclado;

public class EjercicioClase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Leer 10 numeros enteros y mostrar el mayor.
 * */
		int num, mayor;
		
		num=Teclado.leerInt("Introduce un numero: ");
		mayor=num;
		
		for (int i = 1; i < 10; i++) {
			num=Teclado.leerInt("Introduce un numero: ");
			if (num>mayor) {
				mayor=num;
			}
		}
		
		System.out.println("El mayor es: "+mayor);
		
	}

}
