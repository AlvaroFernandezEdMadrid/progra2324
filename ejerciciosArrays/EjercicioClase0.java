package ejerciciosArrays;

import Libreria.Libreria;
import daw.com.Teclado;

public class EjercicioClase0 {

	public static void main(String[] args) {
		//Pedir cuantos nombre, leer nombre, decir que posicion ocupa el mas largo | Decir cuantas veces esta el mas largo.
		int cuantosNombres, posMasLargo, repeMasLargo=1;
		String nombres[];
		
		cuantosNombres=Libreria.leerEnteroPositivo("Cuantos nombres: ");
		
		nombres=new String[cuantosNombres];
		
		for (int i = 0; i < nombres.length; i++) {
			nombres[i]=Teclado.leerString("Nombre ["+i+"]:");
		}
		
		posMasLargo=0;
		
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i].length()>nombres[posMasLargo].length()) {
				posMasLargo=i;
			}
		}
		
		for (int i = (posMasLargo+1); i < nombres.length; i++) {
			if (nombres[i].equalsIgnoreCase(nombres[posMasLargo]))
				repeMasLargo++;
		}
			
		
		System.out.println("El nombre mas largo es "+ nombres[posMasLargo]+ 
				", ocupa la posicion "+posMasLargo+" y aparece "+repeMasLargo+" vece(s).");
		
	}

}
