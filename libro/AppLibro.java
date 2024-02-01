package libro;

import Libreria.Libreria;

public class AppLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libros[], mayor;
		int cuantos;
		
		cuantos=Libreria.leerEnteroPositivo("Cuantos libros: ");
		libros=new Libro[cuantos];
		
		for (int i = 0; i < libros.length; i++) {
			Libro temp=new Libro();
			do {
				temp.leerClave();
			} while (temp.getIsbn().isEmpty()||
					buscarLibro(libros, temp)!=-1);
			
			temp.leerOtrosDatos();
			
			libros[i]=temp;
		}
			for (Libro li : libros)
				li.mostrarDatos();
			
			ordenarLibrosPorTitulo(libros);
			
			for (Libro li : libros)
				li.mostrarDatos();
			
			mayor=libros[0];
			
			for (int i = 1; i < libros.length; i++) {
				if (libros[i].getnPaginas()>mayor.getnPaginas()) {
					mayor=libros[i];
				}
			}
			
			mayor.mostrarDatos();
	}

	private static void ordenarLibrosPorTitulo(Libro[] libros) {
		// TODO Auto-generated method stub
		Libro aux;
		
		for (int i = 0; i < libros.length-1; i++) {
			for (int j = i+1; j < libros.length; j++) {
				if (libros[j].getTitulo().
						compareToIgnoreCase(libros[i].
								getTitulo())<0) {
					aux=libros[i];
					libros[i]=libros[j];
					libros[j]=aux;
				}
			}
		}
	}

	private static int buscarLibro(Libro[] libros, Libro temp) {
		int lugar=-1;
		
		if (temp!=null) {
			for (int i = 0;lugar==-1 && i < libros.length; i++) {
				if (temp.equals(libros[i])) {
					lugar=i;
				}
			}
		}
		
		return lugar;
	}

}
