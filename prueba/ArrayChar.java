package prueba;

import daw.com.Teclado;

public class ArrayChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char unString[];
		int longitud;
		
		do {
			longitud=Teclado.leerInt("Longitud de la palabra: ");
		} while (longitud==0);
		
		unString=new char[longitud];
		
		for (int i = 0; i < unString.length; i++) {
			unString[i]=Teclado.leerString().charAt(0);
		}
		
		for (int i = 0; i < unString.length; i++) {
			System.out.println(unString[i]);
		}
		
	}

}
