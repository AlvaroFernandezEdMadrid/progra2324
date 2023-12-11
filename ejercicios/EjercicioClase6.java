package ejercicios;

import daw.com.Teclado;

public class EjercicioClase6 {

	public static void main(String[] args) {
		String frase;
		final String CONSONANTES;
		int nConsonantes;
		
		CONSONANTES="bcdfghjklmnpqrstvwxyz";
		nConsonantes=0;
		
		frase=Teclado.leerString("Dame una frase: ");
		frase= frase.toLowerCase();
		
		for (int i = 0; i < frase.length(); i++) {
			if (CONSONANTES.contains(frase.substring(i,i+1))) {
				nConsonantes++;
			}
		}
		
		System.out.println(nConsonantes);

	}

}
