package prueba;

import java.util.ArrayList;

import daw.com.Teclado;

public class ListaPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Numero> numeros;
		int num, num2, inter, randIndx;
		
		numeros=new ArrayList<Numero>();
		
		do {
			num=Teclado.leerInt("Introduce un numero(1): ");
		} while (num<1);
		
		do {
			num2=Teclado.leerInt("Introduce un numero(2): ");
		} while (num2<1);
		
		if (num>num2) {
			inter=num;
			num=num2;
			num2=inter;
		}
		
		for (int i = num; i <= num2; i++) {
			if (esPrimo(i)) {
				numeros.add(new Numero(i));
			}
		}
		
		randIndx=getRandomNumber(0,numeros.size());
		
		System.out.println("Numero primo aleatorio en rango: "+numeros.get(randIndx));
		
	}
	
	public static int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}

	public static boolean esPrimo(int num) {
		int nDivisores=1;
		boolean loEs=true;
		
		for (int i = 2; i < (num-1) & loEs; i++) {
			if (num%2==0) {
				nDivisores++;
			}
			if (nDivisores>1) {
				loEs=false;
			}
		}
		return loEs;
	}
}
