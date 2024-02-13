package alumno2;

public class AppAlumno {
	private Alumno alum;
	
	public AppAlumno() {
		alum=new Alumno();
	}
	
	public AppAlumno(String nia) {
		alum=new Alumno(nia);
	}

	public static void main(String[] args) {
		AppAlumno app;
		
		app=new AppAlumno("001");
		
		app.operar();
		
	}

	public void operar() {
		alum.leerDatos();
	}
}
