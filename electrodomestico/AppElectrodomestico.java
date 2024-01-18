package electrodomestico;

import Libreria.Libreria;
import daw.com.Pantalla;


public class AppElectrodomestico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cuantos;
		Electrodomestico[] electrodomesticos;
		Electrodomestico masCaro;
		float total = 0;
		
		cuantos = Libreria.leerEnteroPositivo("cuantos?");
		electrodomesticos = new Electrodomestico[cuantos];
		leerElectrodomesticos (electrodomesticos);
		
		total = 0;
		for (Electrodomestico e : electrodomesticos)
		{
			total += e.getPrecioFinal();
		}
		
		Pantalla.escribirString("\nValor total " + total);
		
		// Mostrar el electrodomÃ©stico mÃ¡s caro
		masCaro = electrodomesticos[0];
		for (int i = 1 ; i < electrodomesticos.length; i++)
			if (electrodomesticos[i].getPrecioFinal() > 
								masCaro.getPrecioFinal())
				masCaro = electrodomesticos[i];

		masCaro.mostrarDatos();
		
		// una de mercadona
		for (int i = 0; i < electrodomesticos.length; i++)
		{

			electrodomesticos[i] = 
				new Electrodomestico(
						electrodomesticos[i].getPrecioBase(),
						electrodomesticos[i].getPeso(),
						electrodomesticos[i].getColor(),
						electrodomesticos[i].getConsumo()
						);
		}
		
		for (Electrodomestico e: electrodomesticos)
			Pantalla.escribirString("\n" + e);
		

	}

	private static void leerElectrodomesticos(Electrodomestico[] electrodomesticos) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < electrodomesticos.length; i++)
		{
			electrodomesticos[i] = new Electrodomestico();
			electrodomesticos[i].leerDatos();
		}
		
	}

}