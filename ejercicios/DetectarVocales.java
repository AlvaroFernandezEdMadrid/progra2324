package ejercicios;

import daw.com.Teclado;

public class DetectarVocales {

	public static void main(String[] args) {
		String vocal, vocales[], mensaje;
		boolean loEs;
		
		vocales=new String[5];
		vocales[0]="a";vocales[1]="e";vocales[2]="i";vocales[3]="o";vocales[4]="u";
		mensaje="No es una vocal";
		loEs=false;
		
		
		vocal=Teclado.leerString("Introduce una letra: ");
		
		for (int i = 0; i < vocales.length & !loEs; i++) {
			if (vocal.equalsIgnoreCase(vocales[i])) {
				loEs=true;
				mensaje="Es una vocal";
			}
		}
		
		System.out.println(mensaje);
	}

}
