package ejerciciosArrays;

import Libreria.Libreria;

public class Trece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float matriz[][];
		int dimension;
		String acum="";
		
		dimension=Libreria.leerEnteroPositivo("Dimension: ");
		
		matriz=new float[dimension][dimension];
		
		for (int i = 0; i < matriz.length; i++) {
			acum="";
			for (int j = 0; j < matriz.length; j++) {
				if (i==j) {
					acum+="["+1.0+"]";
				}
				else
					acum+="["+0.0+"]";
			}
			System.out.println(acum);
		}
		
	}

}
