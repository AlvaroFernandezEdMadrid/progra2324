package masEjerciciosArrays;

public class Cinco {

	public static void main(String[] args) {
		int stock[], opcion=0;
		float precio[];
		String nombreProd[];
		
		
		stock=new int[10];
		precio=new float[10];
		nombreProd=new String[10];
		
		do {
			mostrarOpciones();
			evaluarOpcion();
		} while (opcion!=5);
		
	}

	private static void evaluarOpcion() {
		// TODO Auto-generated method stub
		
	}

	private static void mostrarOpciones() {
		System.out.println("Dar de alta un producto nuevo");
		System.out.println("Buscar un producto por su nombre");
		System.out.println("Modificar el stock y precio de un producto");
		System.out.println("Dar de baja un producto");
		System.out.println("Salir");
	}

}
