package alumno2;

public class PruebaEscuela {
	Escuela esc;
	
	public PruebaEscuela() {
		esc=new Escuela();
	}
	
	public PruebaEscuela(String nombre) {
		esc=new Escuela(nombre);
	}
	
	public static void main(String[] args) {
		PruebaEscuela app;
		
		app=new PruebaEscuela();
		
		app.run();
		
	}

	private void run() {
		esc.leerDatos();
		
		esc.mostrarDatos();
	}

}
