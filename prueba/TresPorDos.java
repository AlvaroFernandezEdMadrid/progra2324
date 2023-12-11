package prueba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TresPorDos {
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int acumoferta, cantidad;
		boolean continuar;
		int entraoferta;
		String nomprod, prodenoferta, sigo;
		double precioud, total, totaldescuento;
		// Leer nombre de producto que este en 3x2, leer productos indefinidamente, 
		// de cada producto pedir nombre, cantidad y precio/ud.
		// Mostrar total y total descontado.
		continuar = true;
		acumoferta = 0;
		totaldescuento = 0;
		entraoferta = 0;
		total = 0;
		do {
			System.out.println("Producto en oferta: ");
			prodenoferta = bufEntrada.readLine();
		} while (prodenoferta.equals(""));
		while (continuar) {
			System.out.println("Nombre producto:");
			nomprod = bufEntrada.readLine();
			System.out.println("Cantidad:");
			cantidad = Integer.parseInt(bufEntrada.readLine());
			System.out.println("Precio unidad:");
			precioud = Double.parseDouble(bufEntrada.readLine());
			if (nomprod.equals(prodenoferta)) {
				while (cantidad>2) {
					acumoferta = acumoferta+1;
					entraoferta = entraoferta+2;
					cantidad = cantidad-3;
				}
				total = total+(entraoferta*precioud);
				totaldescuento = totaldescuento+(acumoferta*precioud);
			}
			total = total+(cantidad*precioud);
			System.out.println("Sigo? S/N:");
			sigo = bufEntrada.readLine();
			if (sigo.equals("n") || sigo.equals("N")) {
				continuar = false;
			}
		}
		System.out.println("Total: "+total+" euros.");
		System.out.println("Total descontado: "+totaldescuento+" euros.");
	}
}
