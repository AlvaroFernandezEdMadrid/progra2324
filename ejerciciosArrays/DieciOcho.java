package ejerciciosArrays;

import daw.com.Teclado;

public class DieciOcho {

	public static void main(String[] args) {
		int nEnteros, vector[], posicionMayor=0;
		
		nEnteros=Libreria.Libreria.leerEnteroPositivo("Numero de numeros a tratar: ");
		
		vector=new int[nEnteros];
		
		for (int i = 0; i < vector.length; i++) {
			vector[i]=Teclado.leerInt("Numero "+i+" :");
			if (i==0) {
				posicionMayor=i;
			}
			else if (vector[i]>vector[posicionMayor]) {
				posicionMayor=i;
			}
		}

		System.out.println("Posicion del mayor: " + posicionMayor);
	}

}
