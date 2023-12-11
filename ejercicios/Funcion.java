package ejercicios;

public class Funcion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumar10Primeros());
		
		System.out.println(sumarIntervalo(1, 10));
	}
	
	public static int sumar10Primeros(){
		int acum=0;
		
		for (int i = 0; i < 10; i++) {
			acum+=i;
		}
		
		return acum;
	}
	
	public static int sumarIntervalo(int min, int max) {
		int acum=0;
		
		if (min>max) {
			int inter=min;
			min=max;
			max=inter;
		}
		
		for (int i = min; i < max; i++) {
			acum+=i;
		}
		
		return acum;
	}

}
