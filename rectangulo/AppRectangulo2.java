package rectangulo;

import Libreria.Libreria;

public class AppRectangulo2 {

	public static void main(String[] args) {
		//Buscar el rectangulo mas bajo.
		//Mostrar los concentricos con el mas bajo.
		//Mover los concentricos al origen de coordenadas.
		//Mostrar todos.
		
		int cuantos, dimensionConcentricos=0;
		Rectangulo conjunto[], bajo, concentricos[];
		
		cuantos=Libreria.leerEnteroPositivo("Cuantos rectangulos: ");
		
		conjunto=new Rectangulo[cuantos];
		
		//Construir y leer rectangulos
		for (int i = 0; i < conjunto.length; i++) {
			conjunto[i]=new Rectangulo();
			conjunto[i].leerDatos();
		}
		
		//Definir como el mas bajo el primero del conjunto.
		bajo=new Rectangulo(conjunto[0]);
		
		//Encontrar el más bajo del conjunto.
		for (int i = 0; i < conjunto.length; i++) {
			if (conjunto[i].getCentro().getY()<bajo.getCentro().getY()) {
				bajo=new Rectangulo(conjunto[i]);
			}
		}
		
		//Definir tamanio del array de concentricos con el mas bajo
		for (int i = 0; i < conjunto.length; i++) {
			if (esConcentrico(bajo, conjunto[i])) {
				dimensionConcentricos++;
			}
		}
		
		//Dar dimension al array de concentricos
		concentricos=new Rectangulo[dimensionConcentricos];
		
		//Encontrar y meter en el array los concentricos-
		for (int i = 0; i < conjunto.length; i++) {
			int indice=0;
			if (esConcentrico(bajo, conjunto[i])) {
				concentricos[indice]=conjunto[i];
				indice++;
			}
		}
		
		//Mover los concentricos al origen
		for (int i = 0; i < conjunto.length; i++) {
			conjunto[i].getCentro().setX(0);
			conjunto[i].getCentro().setY(0);
		}
		
		//Mostrar
		for (int i = 0; i < conjunto.length; i++) {
			System.out.println(conjunto[i].getCentro());;
		}
	}

	private static boolean esConcentrico(Rectangulo bajo, Rectangulo rectangulo) {	
		return rectangulo.getCentro().equals(bajo.getCentro());
	}

	

}
