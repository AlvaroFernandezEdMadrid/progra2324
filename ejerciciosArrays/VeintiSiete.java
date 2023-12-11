package ejerciciosArrays;

import java.util.Iterator;

import Libreria.Libreria;
import daw.com.Teclado;

public class VeintiSiete {

	public static void main(String[] args) {
		String dni[];
		boolean sexo[], trabaja[];
		float sueldo[];
		
		int nEstudiantes, porcHombres, hombresTrabajadores, mujeresTrabajadoras;
		
		
		nEstudiantes=Libreria.leerEntreLimites(1, 50, "Cuantos estudiantes: ");
		
		dni=new String[nEstudiantes];
		sexo=new boolean[nEstudiantes];
		trabaja=new boolean[nEstudiantes];
		sueldo=new float[nEstudiantes];
		
		//Leer datos
		for (int i = 0; i < dni.length; i++) {
			dni[i]=leerDNI();
			sexo[i]=leerSexo();
			trabaja[i]=leerTrabaja();
			if (trabaja[i]) {
				sueldo[i]=leerFloatPositivo("Sueldo: ");
			}
			else {
				sueldo[i]=0;
			}
				
		}
		
		porcHombres=calcularPorcHombres(sexo);
		hombresTrabajadores=calcularPorcHomTrabajadores(sexo, trabaja);
		mujeresTrabajadoras=calcularPorcMujTrabajadoras(sexo, trabaja, porcHombres);
		
		System.out.println("Porcentaje de hombres: "+porcHombres+"%");
		System.out.println("Porcentaje de mujeres: "+(100-porcHombres)+"%");
		System.out.println("Hombres trabajadores: "+hombresTrabajadores+"%");
		mostrarPromHomSueldo(sexo, trabaja, sueldo);
		System.out.println("Mujeres trabajadoras: "+mujeresTrabajadoras+"%");
		
		
		//mostrarPorcMujSueldo(sexo, trabaja,sueldo);
	}


	private static int calcularPorcMujTrabajadoras(boolean[] sexo, boolean[] trabaja, int porcHombres) {
		int trabajadores=0;
		int mujeres=(sexo.length-porcHombres);
		
		for (int i = 0; i < trabaja.length; i++) {
			if (sexo[i]==false&&trabaja[i]==false) {
				trabajadores++;
			}
		}
		
		return (trabajadores*100)/mujeres;
	}


	private static int calcularPorcHomTrabajadores(boolean[] sexo, boolean[] trabaja) {
		// TODO Auto-generated method stub
		int trabajadores=0;
		int hombres=0;
		
		for (int i = 0; i < sexo.length; i++) {
			if (sexo[i]==true) {
				hombres++;
			}
		}
		
		for (int i = 0; i < trabaja.length; i++) {
			if (sexo[i]==true&&trabaja[i]==true) {
				trabajadores++;
			}
		}
		
		return (trabajadores*100)/hombres;
	}


	private static void mostrarPromHomSueldo(boolean[] sexo, boolean[] trabaja, float[] sueldo) {
		// TODO Auto-generated method stub
		float promedioSueldo=0;
		
		int hombres=0;
		
		for (int i = 0; i < sexo.length; i++) {
			if (sexo[i]==true) {
				hombres++;
			}
		}
		
		for (int i = 0; i < sueldo.length; i++) {
			if (sexo[i]==true&&trabaja[i]==true&&sueldo[i]!=0) {
				promedioSueldo+=sueldo[i];
			}
		}
		
		
		
		System.out.println("Promedio sueldo hombres: "+promedioSueldo);
	}


	private static int calcularPorcHombres(boolean sexo[]) {
		int hombres=0;
		for (int i = 0; i < sexo.length; i++) {
			if (sexo[i]==true) {
				hombres++;
			}
		}
		return ((hombres*100)/sexo.length);
	}

	private static float leerFloatPositivo(String mensaje) {
		float num;
		do {
			num=Teclado.leerFloat(mensaje);
		} while (num<0);
		return num;
	}

	private static boolean leerTrabaja() {
		boolean cotiza=false;
		String respuesta;
		
		do {
			respuesta=Teclado.leerString("Trabaja?:");
			if (respuesta.equalsIgnoreCase("s")) {
				cotiza=true;
			}
			else if (respuesta.equalsIgnoreCase("n")) {
				cotiza=false;
			}
		} while (!respuesta.equalsIgnoreCase("s")&&!respuesta.equalsIgnoreCase("n"));
		
		return cotiza;
	}

	private static boolean leerSexo() {
		boolean sexo=false;
		String respuesta;
		
		//true==masculino -- false==femenino
		
		do {
			respuesta=Teclado.leerString("Masculino(m) o Femenino(f)?");
			if (respuesta.equalsIgnoreCase("m")) {
				sexo=true;
			}
			else if (respuesta.equalsIgnoreCase("f")) {
				sexo=false;
			}
		} while (!respuesta.equalsIgnoreCase("f")&&!respuesta.equalsIgnoreCase("m"));
		
		return sexo;
	}

	private static String leerDNI() {
        String dni;
        
        do {
        	dni=Teclado.leerString("Introduce tu dni: ");
        	
		} while (!comprobarDNI(dni));
        
        
        return dni;
	}

	private static boolean comprobarDNI(String dni) {
		String caracteres[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int resto = Integer.valueOf(dni.substring(0, dni.length()-1));
        boolean valido=false;
        
        resto%=23;
        valido=dni.substring(dni.length()-1, dni.length()).equalsIgnoreCase(caracteres[resto]);
        
        return valido;
	}

}
