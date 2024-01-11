package alumno;

import Libreria.Libreria;
import daw.com.Teclado;

public class Alumno {
	private static final int NOTAMINIMA=1;
	private static final int NOTAMAXIMA=10;
	
	private String nia;
	private String nombre;
	private int nota;
	private boolean repetidor;
	
	
	public Alumno(String nia, String nombre, int nota, boolean repetidor) {
		this.setNia(nia);
		this.setNombre(nombre);
		this.setNota(nota);
		this.repetidor = repetidor;
	}

	public Alumno() {
		this("");
	}

	public Alumno(String nia) {
		this(nia, "", NOTAMINIMA, false);
	}
	
	public Alumno(Alumno og) {
		this(og.nia,og.nombre,og.nota,og.repetidor);
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

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		if (nota<NOTAMINIMA) {
			nota=1;
		}
		else if (nota>NOTAMAXIMA) {
			nota=NOTAMAXIMA;
		}
		this.nota = nota;
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

	public void leerOtrosDatos() {
		// TODO Auto-generated method stub
		nombre=Teclado.leerString("Nombre: ");
		nota=Libreria.leerEntreLimites(NOTAMINIMA, NOTAMAXIMA, "Nota:");
		repetidor=Teclado.leerString("Es repetidor? (S/N)").equalsIgnoreCase("s");
	}

	public void leerNia() {
		// TODO Auto-generated method stub
		nia=Teclado.leerString("Nia: ");
	}
	
	public void mostrarDatos() {
		System.out.println("NIA: "+nia);
		System.out.println("Nombre: "+nombre);
		System.out.println("Nota: "+nota);
		System.out.println(repetidor?"Es repetidor":"No repite");	
	}
	
	public boolean isSuspenso() {
		return nota>5;
	}
	
	public boolean equals(Alumno alu) {
		return this.nia.equalsIgnoreCase(alu.nia);
	}
	
}
