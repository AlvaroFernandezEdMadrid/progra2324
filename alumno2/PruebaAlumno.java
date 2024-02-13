package alumno2;

public class PruebaAlumno {
	private Alumno alum;
	
	public PruebaAlumno() {
		alum=new Alumno();
	}
	
	public PruebaAlumno(String nia) {
		alum=new Alumno(nia);
	}

	public static void main(String[] args) {
		PruebaAlumno app;
		
		app=new PruebaAlumno("001");
		
		app.operar();
		
	}

	public void operar() {
		alum.leerDatos();
	}
}
