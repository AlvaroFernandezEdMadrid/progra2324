package prueba;

import daw.com.Teclado;

public class Factorial {

	public static void main(String[] args) {
		double num, resul;
		
		num=Teclado.leerFloat();
		
		resul=factorial(num);
		
		System.out.println(resul);
	}
	
	
	public static double factorial(double num) {
		double res;
		
		if (num==1)
			res=1;
			else
				res=num*factorial(num-1);
				
		return res;
	}

}



