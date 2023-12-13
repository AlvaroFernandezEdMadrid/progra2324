package masEjerciciosArrays;

import daw.com.Teclado;

public class EjercicioClase0 {

	public static void main(String[] args) {
		//Leer una frase por teclado y mostrar cuantas y cuales palabras DIFERENTES tiene.
		String frase, palabras[], noRepes[];
		int nNoRepes=0;
		
		frase=Teclado.leerString("Frase: ");
		
		palabras=frase.split(" ");
		
		noRepes=new String[palabras.length];
		
		for (int i = 0; i < palabras.length; i++) {
			for (int j = 0; j < noRepes.length; j++) {
				if (!palabras[i].equalsIgnoreCase(noRepes[j])) {
					noRepes[nNoRepes]=palabras[i];
				}
			}
			nNoRepes++;
		}
		
		for (int i = 0; i < noRepes.length&&noRepes[i]!=null; i++) {
			System.out.println("Palabras distintas: "+noRepes[i]);
		}
		
	}

}
