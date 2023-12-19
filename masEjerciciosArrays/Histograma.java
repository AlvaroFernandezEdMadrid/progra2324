package masEjerciciosArrays;

import Libreria.Libreria;

public class Histograma {

	public static void main(String[] args) {
		int nTiradas, tirada, numero[], posMayor;
		
		nTiradas=Libreria.leerEnteroPositivo("Numero de tiradas: ");
		
		numero=new int[11];
		
		for (int i = 0; i < nTiradas; i++) {
			tirada=Libreria.generarAleatorio(2, 12)-2;
			
			numero[tirada]++;
		}
		
		posMayor=numero[0];
		
		for (int i = 0; i < numero.length; i++) {
			if (numero[i]>numero[posMayor]) {
				posMayor=i;
			}
		}
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("El numero "+(i+2)+" ha salido "+numero[i]+" veces.");
		}
		
		System.out.println("El valor que mas se repite es: "+(posMayor+2)+" y se repite "+numero[posMayor]+" veces.");
		
	}

}
