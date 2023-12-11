package ejercicios;

import daw.com.Teclado;

public class EjercicioClase5 {

	public static void main(String[] args) {
		//Leer entero positivo mayor que 1 y mostrar por pantalla si es primo.
		int num, num2, inter;
		
		
		do {
			num=Teclado.leerInt("Introduce un numero(1): ");
		} while (num<1);
		
		do {
			num2=Teclado.leerInt("Introduce un numero(2): ");
		} while (num2<1);
		
		if (num>num2) {
			inter=num;
			num=num2;
			num2=inter;
		}
		
		for (int i = num; i <= num2; i++) {
			if (esPrimo(i)) {
				System.out.println(i);
			}
		}
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
