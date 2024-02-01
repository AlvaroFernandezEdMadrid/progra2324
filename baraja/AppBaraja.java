package baraja;

import Libreria.Libreria;
import daw.com.Pantalla;
import daw.com.Teclado;

public class AppBaraja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baraja baraja;
		Carta cartas[];
		int n;
		
		baraja = new Baraja ();
		
		baraja.barajar();
		
		do
		{
		n = Libreria.leerEnteroPositivo("Cuantas quieres ?");
		
		cartas = baraja.darCartas(n);
		if (cartas == null)
			Pantalla.escribirString("\nNo hay tantas cartas para dar" );
		else
			for (Carta c : cartas)
				c.mostrarDatos();
		}while(Teclado.leerString("Mas?").equalsIgnoreCase("s"));
		
		/*
		if (cartas == null)
			Pantalla.escribirString("\nNo hay tantas cartas para dar" );
		else
			for (Carta c : cartas)
				c.mostrarDatos();
		*/
		Pantalla.escribirString("\nQuedan " + baraja.cartasDisponibles());
		
		baraja.mostrarBaraja();
		
	}

}