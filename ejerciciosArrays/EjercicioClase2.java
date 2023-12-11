package ejerciciosArrays;

import Libreria.Libreria;
import daw.com.Teclado;

public class EjercicioClase2 {

	public static void main(String[] args) {
		//Leer n nombres y mostrar iniciales en mayus.
		
		int nNombres;
		String nombres[], iniciales="";
		
		nNombres=Libreria.leerEnteroPositivo("Numero de nombres: ");
		
		nombres=new String[nNombres];
		
		for (int i = 0; i < nombres.length; i++) {
			nombres[i]=Teclado.leerString("Nombre ["+i+"] :");
		}
		
		iniciales=sacarIniciales(nombres);
		
		System.out.println("Iniciales: "+iniciales);
		
	}
	
	public static String sacarIniciales(String nombres[]) {
		String iniciales="";
		for(String nom:nombres)
			iniciales+=nom.charAt(0);
		
		iniciales=iniciales.toUpperCase();
		
		return iniciales;
	}

}
