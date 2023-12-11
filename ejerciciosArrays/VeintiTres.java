package ejerciciosArrays;

import daw.com.Teclado;

public class VeintiTres {

	public static void main(String[] args) {
		int vector[]=new int[10];
		int media=0;
		boolean loEsta=false;
		
		for (int i = 0; i < vector.length; i++) 
			vector[i]=Teclado.leerInt("Introduce un numero ["+i+"]:");
		
		for (int valor:vector) 
			media+=valor;
		
		media/=vector.length;
		
		for (int i = 0; i < vector.length&&!loEsta; i++) {
			if (vector[i]==media) 
				loEsta=true;
		}
		
		System.out.println(loEsta?"ESTA en el vector":"NO ESTA en el vector");
		
	}

}
