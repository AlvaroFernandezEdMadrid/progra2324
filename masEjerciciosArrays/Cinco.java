package masEjerciciosArrays;

import Libreria.Libreria;
import daw.com.Pantalla;
import daw.com.Teclado;


public class Cinco {
	final static String VACIO ="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int CUANTOS=3, SALIR=5;
		
		String nombre[];
		int cantidad[],opcion;
		float pvp[];
		
		// Crear arrays
		nombre = new String[CUANTOS];
		cantidad = new int[CUANTOS];
		pvp = new float[CUANTOS];
		
		inicializarTienda (nombre,cantidad,pvp);
		
		do
		{
			mostrarOpciones ();
			opcion = Libreria.leerEntreLimites(1, SALIR, "\nElija una opciÃ³n");
			evaluarOpcion (opcion, nombre, cantidad,pvp);
		}while (opcion != SALIR);
		
	}

	private static void inicializarTienda(String[] nombre, int[] cantidad, float[] pvp) {
		// TODO Auto-generated method stub
		for (int i = 0; i < nombre.length; i++)
		{
			nombre[i] = VACIO;
			pvp[i] = 0;
			cantidad[i] = 0;
		}
	}

	private static void evaluarOpcion(int opcion, String[] nombre, int[] cantidad, float[] pvp) {
		// TODO Auto-generated method stub
		switch (opcion)
		{
			case 1:
				darAlta (nombre, cantidad, pvp);
				break;
			case 2:
				buscarProducto (nombre, cantidad, pvp);
				break;
			case 3:
				editarProducto (nombre, cantidad, pvp);
				break;
			case 4:
				eliminar (nombre, cantidad, pvp);
				break;
			case 5:
				listar (nombre, cantidad, pvp);
				Pantalla.escribirString("\nFIN");
				break;
		}
		
	}

	private static void eliminar(String[] nombre, int[] cantidad, float[] pvp) {
		// TODO Auto-generated method stub
		String producto;
		int pos;
		
		// leer el nombre del producto a buscar
		producto = Teclado.leerString("nombre producto");
		// comprobar si existe el producto
		pos = buscarPorNombre (producto, nombre);
		
		if (pos != -1)
		{
			nombre[pos] = VACIO;
			cantidad[pos] = 0;
			pvp[pos] = 0;
		}
		else
			Pantalla.escribirString("\nEl producto no existe");
		
		
	}

	private static void listar(String[] nombres, int[] cantidad, float[] pvp) {
		// TODO Auto-generated method stub
		String tempNombre;
		int tempCantidad;
		float tempPvp;
		
		for (int i = 0; i < nombres.length - 1; i++)
			for (int j = i+1; j < nombres.length; j++)
				if (nombres[i].compareTo(nombres[j])> 0)
				{
					tempNombre = nombres[i];
					nombres[i] = nombres[j];
					nombres[j] = tempNombre;
					
					tempCantidad = cantidad[i];
					cantidad[i] = cantidad[j];
					cantidad[j] = tempCantidad;
					
					tempPvp = pvp[i];
					pvp[i] = pvp[j];
					pvp[j] = tempPvp;
				}
		for (int i = 0; i < nombres.length; i++)
			mostrarProducto(nombres[i], cantidad[i], pvp[i]);
		
	}

	private static void editarProducto(String[] nombre, int[] cantidad, float[] pvp) {
		// TODO Auto-generated method stub
		String producto;
		int pos;
		
		// leer el nombre del producto a buscar
		producto = Teclado.leerString("nombre producto");
		// comprobar si existe el producto
		pos = buscarPorNombre (producto, nombre);
		
		// si existe, mostrar producto y pedir nuevos datos
		if (pos != -1)
		{
			mostrarProducto (nombre[pos], cantidad[pos], pvp[pos]);
			cantidad[pos] = Teclado.leerInt("nueva cantidad");
			pvp[pos] = Teclado.leerFloat("nuevo precio");
		}
		else
			Pantalla.escribirString("\nEl producto no existe");
		
		
	}

	private static void buscarProducto(String[] nombre, int[] cantidad, float[] pvp) {
		// TODO Auto-generated method stub
		String producto;
		int pos;
		
		// leer el nombre del producto a buscar
		producto = Teclado.leerString("nombre producto");
		// comprobar si existe el producto
		pos = buscarPorNombre (producto, nombre);
		
		// si existe, mostrar producto
		if (pos != -1)
			mostrarProducto (nombre[pos], cantidad[pos], pvp[pos]);
		else
			Pantalla.escribirString("\nEl producto no existe");
		
	}

	private static void mostrarProducto(String nombre, int cantidad, float precio) {
		// TODO Auto-generated method stub
		if (!nombre.equals(VACIO))
		{
			Pantalla.escribirString("\nnombre " + nombre);
			Pantalla.escribirString("\tcantidad " + cantidad );
			Pantalla.escribirString("\tpvp " + precio);
		}
		
	}

	private static void darAlta(String[] nombre, int[] cantidad, float[] pvp) {
		// TODO Auto-generated method stub
		String producto;
		int pos;
		
		pos = buscarPorNombre (VACIO,nombre);
		// Si hay hueco libre insertar en el primer hueco libre
		if (pos != -1)
		{
			// leer el nombre del producto a insertar
			producto = Teclado.leerString("nombre producto");
			
			// comprobar si existe el producto 
			if (buscarPorNombre (producto, nombre) == -1)
			{
				nombre[pos]= producto;
				do
				{
					pvp[pos] = Teclado.leerFloat("pvp");
				} while (pvp[pos] <= 0);
				cantidad[pos] = Libreria.leerEnteroPositivo("cantidad");
			}
			else
				Pantalla.escribirString("\nProducto ya existe");
		}
		else
			Pantalla.escribirString("\nNo se admiten mÃ¡s productos");
		

	}

	private static int buscarPorNombre(String producto, String[] nombre) {
		// TODO Auto-generated method stub
		int pos = -1;
		
		for (int i = 0; i < nombre.length && pos == -1; i++)
			if (producto.equalsIgnoreCase(nombre[i]))
				pos = i;
		return pos;
	}

	private static void mostrarOpciones() {
		// TODO Auto-generated method stub
		Pantalla.escribirString("\n1.Dar de alta un producto nuevo.");
		Pantalla.escribirString("\n2.Buscar un producto por su nombre.");
		Pantalla.escribirString("\n3.Modificar el stock y precio de un producto dado.");
		Pantalla.escribirString("\n4.Eliminar un producto");
		Pantalla.escribirString("\n5.Salir");
		
	}

}