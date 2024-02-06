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
		// TODO Auto-generated method stub
		if (videoClub.getProductos()!=null) {
			for (int i = 0; i < videoClub.getProductos().length; i++) {
				if (videoClub.getProductos()[i]!=null&&(!videoClub.getProductos()[i].isAlquilado())) {
					System.out.println(videoClub.getProductos()[i]);
				}
			}
		}else {
			System.out.println("Ninguno alquilado");
		}
	}

	private void anadirProd() {
		// TODO Auto-generated method stub
		ProductoVC prod;
		
		prod=new ProductoVC();
		
		if (!videoClub.existeProducto(prod)&&videoClub.contarProductosLibres()>0) {
			videoClub.addProducto();
		}
	}

	private void mostrarFichaProd() {
		// TODO Auto-generated method stub
		
	}

	private void listarCli() {
		// TODO Auto-generated method stub
		
	}

	private void anadirCli() {
		// TODO Auto-generated method stub
		
	}

	private void mostrarFichaCli() {
		// TODO Auto-generated method stub
		
	}

	private void alquilar() {
		// TODO Auto-generated method stub
		
	}

	private void devolver() {
		// TODO Auto-generated method stub
		
	}

	private void salir() {
		// TODO Auto-generated method stub
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

}
