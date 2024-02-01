package baraja;

import daw.com.Pantalla;

public class Baraja {
	// Las cartas que COMPONEN la baraja
	private Carta carta[];

	// Contador del numero de cartas que han salido 
	private int contador;

	public Baraja ()
	{
		contador = 0; // No se ha repartido ninguna carta
		carta = new Carta[40];
		int indice=0; //Indice del array

		// Crear las cartas de la baraja
		for (int j = 0; j < Carta.PALO.length; j++)
		{
			// Cartas del 1 al 11
			for (int i = 1; i < 10; i++)
			{ 
				carta[indice]= new Carta (i,Carta.PALO[j]);
				indice++;
			}
			// Carta 12
			carta[indice] = new Carta(12, Carta.PALO[j]);
			indice++;
		}
	}
	public Baraja (Baraja original)
	{
		this.contador = original.contador;


		// Copia dura
		this.carta = new Carta[original.carta.length];

		for (int i = 0; i < original.carta.length; i++)
			this.carta[i] = new Carta (original.carta[i]);

	}

	public void barajar ()
	{
		int aleatorio;
		Carta aux;

		// poner contador al principio
		contador = 0;

		// intercambiar las cartas de forma aleatoria
		for (int i = 0; i < carta.length; i++)
		{
			aleatorio = (int)(Math.random()*40);
			aux = carta[i];
			carta[i] = carta[aleatorio];
			carta[aleatorio] = aux;
		}
	}

	public int cartasDisponibles ()
	{
		return carta.length - contador;
	}

	public Carta siguienteCarta ()
	{
		Carta c = null;
		if (cartasDisponibles () > 0)
		{
			c = new Carta(carta[contador]);
			contador++;
		}

		return c;
	}

	public Carta[] darCartas (int cuantas)
	{
		Carta aDevolver[] = null;

		if (cuantas <= cartasDisponibles())
		{
			aDevolver = new Carta[cuantas];
			for (int i = 0; i < cuantas; i++)
				aDevolver[i] = siguienteCarta();
		}

		return aDevolver;
	}

	public void cartasMonton ()
	{
		if (contador > 0)
			for (int i = 0; i < contador; i++)
				carta[i].mostrarDatos();
		else
			Pantalla.escribirString("\nNo han salido cartas");
	}

	public void mostrarBaraja ()
	{

		if (contador < carta.length)
			for (int i = contador; i < carta.length; i++)
				carta[i].mostrarDatos();

		else
			Pantalla.escribirString("\nhan salido todas las cartas");
	}	

}