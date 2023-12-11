package ejerciciosPropuestosT3;

import daw.com.Teclado;

public class Cinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dd, mm, yyyy, tarot=0;
		
		yyyy=Teclado.leerInt("Introduce el anio: ");
		mm=Libreria.Libreria.leerEntreLimites(1,12,"Introduce el mes: ");
		dd=leerDia(mm,yyyy);
		
		tarot=sumarDigitos(yyyy+mm+dd);
		
		while (String.valueOf(tarot).length()>1) {
			tarot=sumarDigitos(tarot);
		}
		
		System.out.println("Tu numero del tarot es: "+tarot);
		
	}

	private static int leerDia(int mm, int yyyy) {
		// TODO Auto-generated method stub
		int dd;
		switch (mm) {
		case 2:
			if (Libreria.Libreria.esBisiesto(yyyy)) {
				dd=Libreria.Libreria.leerEntreLimites(1,29,"Introduce el dia: ");
			}
			else
				dd=Libreria.Libreria.leerEntreLimites(1,28,"Introduce el dia: ");
			break;
		case 1,3,5,7,8,10,12:
			dd=Libreria.Libreria.leerEntreLimites(1,31,"Introduce el dia: ");
			break;
		default:
			dd=Libreria.Libreria.leerEntreLimites(1,30,"Introduce el dia: ");
			break;
		}
		
		return dd;
	}

	private static int sumarDigitos(int tarot) {
		String todo;
		int suma=0, num;
		
		todo=String.valueOf(tarot);
		
		for (int i = 0; i < todo.length(); i++) {
			num=Integer.parseInt(todo.substring(i,i+1));
			suma+=num;
		}
		
		return suma;
	}

}
