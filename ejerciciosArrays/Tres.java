package ejerciciosArrays;

public class Tres {

	public static void main(String[] args) {
		int matrizA[][], matrizB[][];
		String acum="";
		int interm;
		
		matrizA=new int[3][3];
		
		matrizA[0][0]=311;matrizA[0][1]=412;matrizA[0][2]=13;
		matrizA[1][0]=21;matrizA[1][1]=220;matrizA[1][2]=253;
		matrizA[2][0]=331;matrizA[2][1]=352;matrizA[2][2]=733;
		
		matrizB=new int[3][3];
		
		matrizB[0][0]=111;matrizB[0][1]=182;matrizB[0][2]=139;
		matrizB[1][0]=231;matrizB[1][1]=6220;matrizB[1][2]=203;
		matrizB[2][0]=431;matrizB[2][1]=32;matrizB[2][2]=433;
		
		int posicionMayor[] = {0,0};
		int posicionMenor[] = {0,0};
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				if (matrizA[i][j]>matrizA[posicionMayor[0]][posicionMayor[1]]) {
					posicionMayor[0]=i;
					posicionMayor[1]=j;
				}
			}
		}
		
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				if (matrizB[i][j]<matrizB[posicionMenor[0]][posicionMenor[1]]) {
					posicionMenor[0]=i;
					posicionMenor[1]=j;
				}
			}
		}
		
		System.out.println("Matriz A:");
		for (int i = 0; i < matrizA.length; i++) {
			acum="";
			for (int j = 0; j < matrizA[i].length; j++) {
				acum+="["+matrizA[i][j]+"]";
			}
			System.out.println(acum);
		}
		
		System.out.println("El numero mayor de matrizA es: "+matrizA[posicionMayor[0]][posicionMayor[1]]);
		
		System.out.println("Matriz B:");
		for (int i = 0; i < matrizB.length; i++) {
			acum="";
			for (int j = 0; j < matrizB[i].length; j++) {
				acum+="["+matrizB[i][j]+"]";
			}
			System.out.println(acum);
		}
		
		System.out.println("El numero menor de matrizB es: "+matrizB[posicionMenor[0]][posicionMenor[1]]);
		
		interm=matrizA[posicionMayor[0]][posicionMayor[1]];
		matrizA[posicionMayor[0]][posicionMayor[1]]=matrizB[posicionMenor[0]][posicionMenor[1]];
		matrizB[posicionMenor[0]][posicionMenor[1]]=interm;
		
		//mostrar
		
		System.out.println("Matriz A (con max. intercambiado con min. de B):");
		for (int i = 0; i < matrizA.length; i++) {
			acum="";
			for (int j = 0; j < matrizA[i].length; j++) {
				acum+="["+matrizA[i][j]+"]";
			}
			System.out.println(acum);
		}
		
		System.out.println("Matriz B (con min. intercambiado con max. de A):");
		for (int i = 0; i < matrizB.length; i++) {
			acum="";
			for (int j = 0; j < matrizB[i].length; j++) {
				acum+="["+matrizB[i][j]+"]";
			}
			System.out.println(acum);
		}
		
	}

}
