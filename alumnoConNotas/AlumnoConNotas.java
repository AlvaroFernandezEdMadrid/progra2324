package alumnoConNotas;

import Libreria.Libreria;
import daw.com.Pantalla;
import daw.com.Teclado;

public class AlumnoConNotas {
	private static final int NOTAMINIMA=1;
	private static final int NOTAMAXIMA=10;
	private static final int NNOTAS=6;
	
	private String nia;
	private String nombre;
	private int notas[];
	private boolean repetidor;
	
	
	public AlumnoConNotas(String nia, String nombre, int notas[], boolean repetidor) {
		this.setNia(nia);
		this.setNombre(nombre);
		this.setNotas(notas);
		this.repetidor = repetidor;
	}

	public AlumnoConNotas() {
		this("");
	}

	public AlumnoConNotas(String nia) {
		this(nia, "", new int [NNOTAS], false);
	}
	
	public AlumnoConNotas(AlumnoConNotas og) {
		this(og.nia,og.nombre,og.notas,og.repetidor);
	}

	public String getNia() {
		return nia;
	}

	public void setNia(String nia) {
		if (nia==null) {
			nia="";
		}
		this.nia = nia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre==null) {
			nombre="";
		}
		this.nombre = nombre;
	}
	
	public int getNota(int cual) {
		
		if (cual<0) {
			cual=0;
		} else if (cual>notas.length-1) {
			cual=notas.length;
		}
		
		return notas[cual];
	}
	
	public int getNNotas() {
		return notas.length;
	}

	public void setNota(int nota, int cual) {
		if (cual<0) {
			cual=0;
		} else if (cual>notas.length-1) {
			cual=notas.length;
		}
		
		if (nota<NOTAMINIMA) {
			nota=NOTAMINIMA;
		} else if (nota>NOTAMAXIMA) {
			nota=NOTAMAXIMA;
		}
		
		notas[cual]=nota;
	}
	
	private void setNotas(int notas[]) {
		if (notas==null) {
			notas=new int[NNOTAS];
		}
		
		for (int i = 0; i < notas.length; i++) {
			if (notas[i]<NOTAMINIMA) {
				notas[i]=NOTAMINIMA;
			} else if (notas[i]>NOTAMAXIMA) {
				notas[i]=NOTAMAXIMA;
			}
		}
		
		//Hacer copia
		if (this.notas==null) {
			this.notas=new int[NNOTAS];
		}
		
		for (int i = 0; i < this.notas.length; i++) {
			this.notas[i]=notas[i];
		}
		
		
	}

	public boolean isRepetidor() {
		return repetidor;
	}

	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}
	
	public void leerDatos() {
		leerNia();
		leerOtrosDatos();
	}

	public void leerNia ()
	{
		nia = Teclado.leerString("\nnia ");
	}
	
	public void leerOtrosDatos ()
	{	
		nombre = Teclado.leerString("nombre ");
		for (int i = 0; i < notas.length; i++) {
			notas[i] = Libreria.leerEntreLimites(NOTAMINIMA, NOTAMAXIMA, "nota ");
		}
		
		repetidor = Teclado.leerString("Es repetidor?(S/N)").
				equalsIgnoreCase("s");
	}
	
	public void mostrarDatos ()
	{
		Pantalla.escribirString("\nNIA " + nia);
		Pantalla.escribirString("\nnombre " + nombre);
		
		Pantalla.escribirString("\nnotas ");
		for (int i = 0; i < notas.length; i++)
			Pantalla.escribirString("\t" + notas[i]);
		if (repetidor)
			Pantalla.escribirString("\nEs repetidor");
		else
			Pantalla.escribirString("\nNo es repetidor");
		
		//Pantalla.escribirString("\n" + (repetiror?"Es repetidor":"No es repetidor"));
	}
	
	public boolean estaSuspenso ()
	{
		return getNotaMedia() < 5;
	}
	
	public float getNotaMedia ()
	{
		float media = 0;
		
		for (int i = 0; i < notas.length; i++)
			media += notas[i];
		
		media /= notas.length;
		
		return media;
	}
	
	public boolean equals(AlumnoConNotas alu) {
		return this.nia.equalsIgnoreCase(alu.nia);
	}
	
}
