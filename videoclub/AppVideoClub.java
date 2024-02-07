package videoclub;

import Libreria.Libreria;
import daw.com.Teclado;

public class AppVideoClub {
	private static final int SALIR = 9;
	
	private VideoClub videoClub;
	
	public AppVideoClub() {
		videoClub=new VideoClub();
	}
	
	public AppVideoClub(String nombre) {
		videoClub=new VideoClub(nombre);
	}
	
	public static void main(String[] args) {
		int opc;
		String nombre;
		AppVideoClub app;
		
		nombre=Teclado.leerString("Nombre del VideoClub");
		app=new AppVideoClub(nombre);
		
		do {
			app.mostrarOpciones();
			opc=Libreria.leerEntreLimites(1, SALIR, "Elije una opcion: ");
			app.evaluarOpcion(opc);
		} while (opc!=SALIR);
		
	}

	private void evaluarOpcion(int opc) {
		switch (opc) {
		case 1:
			listarNoAlq();
			break;
		case 2:
			anadirProd();
			break;
		case 3:
			mostrarFichaProd();
			break;
		case 4:
			listarCli();
			break;
		case 5:
			anadirCli();
			break;
		case 6:
			mostrarFichaCli();
			break;
		case 7:
			alquilar();
			break;
		case 8:
			devolver();
			break;
		case 9:
			salir();
			break;
		
		}
	}

	private void listarNoAlq() {
		if (hayProductos()) {
			for (int i = 0; i < videoClub.getProductos().length; i++) {
				if (!videoClub.getProductos()[i].isAlquilado()) {
					videoClub.getProductos()[i].mostrarDatos();
				}
			}
		}else {
			System.out.println("No hay productos");
		}
	}

	private void anadirProd() {
		videoClub.addProducto();
	}

	private void mostrarFichaProd() {
		String nomProd;
		int indice;
		
		nomProd=Teclado.leerString("Nombre del producto: ");
		
		indice=videoClub.buscarProducto(nomProd);
		
		if (videoClub.buscarProducto(nomProd)!=-1) {
			System.out.println(videoClub.getProductos()[indice]);
		}else {
			System.out.println("No hay productos");
		}
	
	}

	private void listarCli() {
		for (int i = 0; i < videoClub.getClientes().length; i++) {
			if (videoClub.getClientes()[i]!=null) {
				videoClub.getClientes()[i].mostrarDatos();
			}
		}
	}

	private void anadirCli() {
		videoClub.addCliente();	
	}

	private void mostrarFichaCli() {
		String idCliente;
		int indice;
		
		idCliente=Teclado.leerString("Introduce el id del cliente a buscar: ");
			
		indice=videoClub.buscarCliente(idCliente);
			
		if (indice!=-1) {
			videoClub.getClientes()[indice].mostrarDatos();
		}else {
			System.out.println("No existen clientes");
		}
	}

	private void alquilar() {
		if (hayClientes()&&hayProductos()) {
			videoClub.alquilar();
		}else {
			System.out.println("No hay Clientes o Productos");
		}
		
	}

	private void devolver() {
		if (hayAlquileres()) {
			videoClub.devolver();
		}else {
			System.out.println("No hay alquileres");
		}
	}

	private void salir() {
		System.out.println("\nFin");
	}

	private void mostrarOpciones() {
		System.out.println("\n1. Listar productos sin alquilar");
		System.out.println("\n2. Añadir producto");
		System.out.println("\n3. Mostrar ficha producto");
		System.out.println("\n4. Listar clientes");
		System.out.println("\n5. Añadir cliente");
		System.out.println("\n6. Mostrar ficha cliente");
		System.out.println("\n7. Alquilar producto");
		System.out.println("\n8. Devolver un producto");
		System.out.println("\n9. Salir");
	}

	private boolean hayProductos() {
		boolean hay=false;
		
		for (int i = 0; i < videoClub.getProductos().length&&!hay; i++) {
			if (videoClub.getProductos()[i]!=null) {
				hay=true;
			}
		}
		return hay;
	}

	private boolean hayClientes() {
		boolean hay=false;
		
		for (int i = 0; i < videoClub.getClientes().length&&!hay; i++) {
			if (videoClub.getClientes()[i]!=null) {
				hay=true;
			}
		}
		return hay;
	}

	private boolean hayAlquileres() {
		boolean hay=false;
		
		for (int i = 0; i < videoClub.getProductos().length&&!hay; i++) {
			if (videoClub.getProductos()[i]!=null) {
				if (videoClub.getProductos()[i].isAlquilado()) {
					hay=true;
				}
			} 
		}
		
		return hay;
	}
}
