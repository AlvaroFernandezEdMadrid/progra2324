package ejercicios;

import daw.com.Teclado;

public class EjercicioClase7 {

	public static void main(String[] args) {
		/*
		 * Hacer programa que lea del teclado 3 numeros
		 * y diga cuantos son primos.
		 * Para ello hacer una funcion llamada esPrimo
		 * que reciba un numero y devuelva si es primo.
		 * */
		
		int num, nPrimos=0;
		
		
		for (int i = 0; i < 3; i++) {
			num=Teclado.leerInt("Introduce un numero");
			if (esPrimo(num)) {
				nPrimos++;
			}
		}
		
		System.out.println(nPrimos>0?"Has introducido "+nPrimos+" numeros primos.":"No hay primos.");
	}
	
	public static boolean esPrimo(int num) {
		int nDivisores=1;
		boolean loEs=true;
		
		for (int i = 2; i < (num-1) & loEs; i++) {
			if (num%2==0) {
				nDivisores++;
			}
			if (nDivisores>1) {
				loEs=false;
			}
		}
		return loEs;
	}

}
