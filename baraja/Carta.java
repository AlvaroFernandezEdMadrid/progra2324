package baraja;

import daw.com.Pantalla;

public class Carta {
	public static final String PALO[]= {"Oros", "Copas","Espadas", "Bastos"};
	
	private String palo;
	private int numero;
	
	public Carta (int numero, String palo)
	{
		setNumero (numero);
		setPalo (palo);
	}
	
	public Carta ()
	{
		this (0,""); // 1 de Oros
	}
	
	public Carta (Carta original)
	{
		this (original.numero, original.palo);
	}

	public int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		if (numero < 1)
			numero = 1;
		else if (numero > 12)
			numero = 12;
		
		if (numero > 7 && numero < 10)
			numero +=2;
		
		this.numero = numero;
	}
	
	public String getPalo() {
		return palo;
	}

	private void setPalo(String palo) {
		boolean enc = false;
		
		for (int i = 0; i < PALO.length && !enc;i++ )
			if (palo.equalsIgnoreCase(PALO[i]))
				enc = true;
		
		if (!enc)
			palo = PALO[0]; // Oros
		
		this.palo = palo;
	}
	

	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo + "]";
	}
	
	public boolean equals(Carta otro) {
		
		return otro != null &&
				this.numero == otro.numero &&
				this.palo.equals(otro.palo);
	}
	
	public void mostrarDatos ()
	{
		Pantalla.escribirString("\n" +this);
	}
}