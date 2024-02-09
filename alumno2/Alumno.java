package alumno2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Alumno {
	private final static int MAXASIGNATURAS=6;
	private String nia;
	private String nombre;
	private LocalDate fNac;
	private Asignatura asignaturas[];
	
	public Alumno(String nia, String nombre, LocalDate fNac, Asignatura[] asignaturas) {
		setNia(nia);
		this.nombre = nombre;
		setfNac(fNac);
		setAsignaturas(asignaturas);
	}

	public Alumno(String nia) {
		setNia(nia);
		this.nombre="";
		setfNac(LocalDate.now().minusYears(18));
		this.asignaturas=new Asignatura[MAXASIGNATURAS];
	}
	
	public Alumno() {
		this("");
	}

	public String getNia() {
		return nia;
	}

	public void setNia(String nia) {
		this.nia = nia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getfNac() {
		LocalDate copiaFecha;
		
		copiaFecha=fNac;
		
		return copiaFecha;
	}

	public void setfNac(LocalDate fNac) {
		if (fNac.plusYears(18).isAfter(LocalDate.now())) {
			fNac=LocalDate.now().minusYears(18);
		}
		this.fNac = fNac;
	}

	public Asignatura[] getAsignaturas() {
		Asignatura[] copia = null;
	
		if (asignaturas != null)
		{
			copia = new Asignatura[MAXASIGNATURAS];
			for (int i = 0; i < asignaturas.length; i++)
				if (asignaturas[i]!= null)
					copia[i] = new Asignatura(asignaturas[i]);
		}
	
	
		return copia;
	}

	public void setAsignatura(String nueva) {
		int donde=-1;
		if (asignaturas!=null) {
			for (int i = 0; i < asignaturas.length; i++) {
				if (!tieneAsignatura(asignaturas[i])) {
					donde=buscarHuecoAsignatura();
					if (donde!=-1) {
						
					}
				}
			}
		}
	}

	public boolean tieneAsignatura(String asig) {
		boolean tiene=false;
		
		for (int i = 0; i < asignaturas.length; i++) {
			if (asignaturas[i].equals(new Asignatura(asig))) {
				tiene=true;
			}
		}
		
		return tiene;
	}
	
	public boolean tieneAsignatura(Asignatura asig) {
		boolean tiene=false;
		
		for (int i = 0; i < asignaturas.length; i++) {
			if (asignaturas[i].equals(asig)) {
				tiene=true;
			}
		}
		
		return tiene;
	}
	
	@Override
	public String toString() {
		return "Alumno [nia=" + nia + ", nombre=" + nombre + ", fNac=" + fNac + ", asignaturas="
				+ Arrays.toString(asignaturas) + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nia);
	}

	public boolean equals(Alumno otro) {
		return this.nombre.equalsIgnoreCase(otro.nombre);
	}
	
	
	
}
