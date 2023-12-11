package ejerciciosArrays;

import Libreria.Libreria;

public class VeintiUno {

	public static void main(String[] args) {
		int vector[];

		vector=Libreria.crearArrayInt();
		
		Libreria.leerArray(vector);
		
		for (int i = 0; i < vector.length; i++) {
			if (String.valueOf(vector[i]).substring(String.valueOf(vector[i]).length()-1, String.valueOf(vector[i]).length()).equalsIgnoreCase(String.valueOf(4))) {
				System.out.println("Posicion terminado en 4: "+i);
			}
		}
		
	}

}
