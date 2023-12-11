package masEjerciciosT3;

import daw.com.Teclado;

public class Siete {

	public static void main(String[] args) {
		int nReyes, numRey=1, indiceArr=0;
		String nombresReyes, acum="", trozo="", arrayReyes[], nuevoRey;
		
		nReyes=Libreria.Libreria.leerEnteroPositivo("Numero de reyes:");
		
		arrayReyes=new String[nReyes];
		
		nombresReyes=Teclado.leerString("Introduce los nombres de todos los reyes separados por espacio: ");
		
		for (int i = 0; i < nombresReyes.length(); i++) {
			trozo=nombresReyes.substring(i, i+1);
			if (!nombresReyes.substring(nombresReyes.length()-1,nombresReyes.length()).equalsIgnoreCase(" ")) {
				nombresReyes+=" ";
			}
			if (!trozo.equalsIgnoreCase(" ")) {
				acum+=trozo;	
			}
			else {
				arrayReyes[indiceArr]=acum;
				acum="";
				indiceArr++;
			}
		}
		
		nuevoRey=Teclado.leerString("Nombre del nuevo Rey: ");
		
		for (int i = 0; i < arrayReyes.length; i++) {
			if (arrayReyes[i].equalsIgnoreCase(nuevoRey)) {
				numRey++;
			}
		}
		
		System.out.println("El nuevo rey se llamara: "+nuevoRey.substring(0,1).toUpperCase()+nuevoRey.substring(1)+" "+numRey);
		
	}

}
