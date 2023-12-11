package ejerciciosArrays;

public class EjercicioClase1 {

	public static void main(String[] args) {
/*
 * Leer 100 numeros enteros positivos,
 * calcular la media, mostrar cuanto se desvia
 * cada numero de la media.
 * */
		
		int array1[], desviacion=0;
		int media=0;
		
		array1=new int[10];
		
		for (int i = 0; i < array1.length; i++) {
			array1[i]=Libreria.Libreria.leerEnteroPositivo("Introduce un numero: ");
			media+=array1[i];
		}
		
		media/=array1.length;
		
		System.out.println("La media es: "+media);
		
		for (int desv:array1) {
			desviacion=(int) (media-array1[desv]);
			System.out.println(array1[desv]+" Desviacion: "+desviacion);
		}
	}

}
