package ejercicios;

import daw.com.Teclado;

public class EjercicioClase3 {
	public static void main(String[] args) {
		/*
		 * Leer de forma indefinida un conjunto de 
		 * numeros enteros hasta que el usuario 
		 * introduce 0.
		 * A continuacion mostrar la cantidad de 
		 * numeros negativos y la media de todos los numeros.  
		*/
		
		int num, cantidadNumeros, cantidadNegativos;
		float media;
		
		media=0;
		cantidadNegativos=0;
		cantidadNumeros=0;
		
		do {
			num=Teclado.leerInt("Introduce un numero: ");
			if (num<0) {
				cantidadNegativos++;
			}
			if (num!=0) {
				cantidadNumeros++;
				media+=num;
			}
		} while (num!=0);
		
		media/=cantidadNumeros;
		
		if (cantidadNegativos>1) {
			System.out.println("Hay "+cantidadNegativos+" numeros negativos;");
		}
		
		System.out.println("Media: "+media);
		
	}

}
