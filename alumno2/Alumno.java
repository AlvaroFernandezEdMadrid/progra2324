package alumno2;

import java.time.LocalDate;

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
		return new Asignatura(Asignatura);
	}

	public void setAsignaturas(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	
	
}
