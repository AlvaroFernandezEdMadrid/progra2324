package exaClasObj;

import Libreria.Libreria;
import daw.com.Teclado;

public class AppCarrera {

	Carrera c;
	
	public AppCarrera(){
		c=new Carrera();
	}
	
	public static void main(String[] args) {
		AppCarrera app;
			
		app=new AppCarrera();

		app.inicializar();
		app.menu();
	}

	private void inicializar() {
		inicializarCarrera();
		inicializarPuntos();

	}

	private void inicializarPuntos() {
		int nPuntosC;
		PuntoControl[] puntos;
		
		nPuntosC=Libreria.leerEnteroPositivo("Cuantos puntos: ");
		puntos=new PuntoControl[nPuntosC];
		
		c.setnPuntosControl(nPuntosC);
		c.setPuntosControl(puntos);
		
		for (int i = 0; i < nPuntosC; i++) {
			addPunto();
		}
		
	}

	private void addPunto() {
		PuntoControl punt;
		
		punt=new PuntoControl();
		
		c.addPuntoControl(punt);
	}

	private void inicializarCarrera() {
		String nombreCarrera;
		int maxCorredores;
		Corredor[] corredores;
		
		int valorPremio;
		
		nombreCarrera=Teclado.leerString("Nombre de la carrera: ");
		maxCorredores=Libreria.leerEnteroPositivo("Numero de corredores: ");
		corredores=new Corredor[maxCorredores];
		
		valorPremio=Libreria.leerEnteroPositivo("Valor del premio: ");
		
		c.setNombre(nombreCarrera);
		c.setnCorredores(maxCorredores);
		c.setCorredores(corredores);
		c.setValorPremio(valorPremio);
	}

	private void menu() {
		final int SALIR=6;
		int opc;
		
		do {
			mostrarOpciones();
			opc=Libreria.leerEntreLimites(1, SALIR, "Elije una opcion:");
			evaluarOpcion(opc);
		} while (opc!=SALIR);
	}

	private void mostrarOpciones() {
		System.out.println("1. Inscribir corredor: ");
		System.out.println("2. Anotar tiempo en P.Control");
		System.out.println("3. Anotar tiempo paso meta");
		System.out.println("4. Listar corredores");
		System.out.println("5. Listar por orden de llegada");
		System.out.println("6. Salir");
		
	}

	private void evaluarOpcion(int op) {
		switch (op) {
		case 1:
			addCorredor();
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			listarCorredores();
			break;
		case 5:
			listarOrdenados();
			break;
		case 6:
			salir();
			break;
		}
	}

	private void addCorredor() {
		Corredor cor;
		
		cor=new Corredor();
		
		c.addCorredor(cor);
		
	}

	private void listarCorredores() {
		for (int i = 0; i < c.getCorredores().length; i++) {
			if (c.getCorredores()[i]!=null) {
				c.getCorredores()[i].mostrarDatos();
			}
		}
		
	}
	
	private void listarOrdenados() {
		Corredor[] listaOrdenada;
		Corredor temp;
		
		listaOrdenada=new Corredor[c.getCorredores().length];
		
		for (int i = 0; i < listaOrdenada.length; i++) {
			listaOrdenada[i]=new Corredor(c.getCorredores()[i]);
		}
		
		for (int i = 0; i < listaOrdenada.length; i++) {
			for (int j = i+1; j < listaOrdenada.length; j++) {
				if (listaOrdenada[i].getSegundos()>listaOrdenada[j].getSegundos()) {
					temp=listaOrdenada[i];
					listaOrdenada[i]=c.getCorredores()[j];
					listaOrdenada[j]=temp;
				}
			}
		}
		
		for(Corredor cr:listaOrdenada) {
			cr.mostrarDatos();
		}
				
	}
	
	private void salir() {
		System.out.println("Fin");
	}
}
