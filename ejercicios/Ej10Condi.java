package ejercicios;

import daw.com.Pantalla;
import daw.com.Teclado;

public class Ej10Condi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anios;
		float sueldoFinal=0;
		final int SUELDOBASE=40000;
		
		do {
			anios= Teclado.leerInt("Cuantos anios llevas en la empresa?\n");
		} while (anios<=0);
		
		if (anios>=10)
			sueldoFinal = (SUELDOBASE * 1.10f);
		else if (anios<10 && anios>5)
			sueldoFinal = (SUELDOBASE * 1.07f);
		else if (anios<=5 && anios>3)
			sueldoFinal = (SUELDOBASE * 1.05f);
		else if (anios<=3)
			sueldoFinal = (SUELDOBASE * 1.03f);
		
		Pantalla.escribirString("Tu sueldo tras la subida es:" + sueldoFinal);
		
	}

}
