package ejerciciosArrays;

public class Doce {

	public static void main(String[] args) {
		int matriz[][];
		String acum="";
		
		matriz=new int[3][5];
		
		matriz[0][0]=11;matriz[0][1]=12;matriz[0][2]=13;matriz[0][3]=14;matriz[0][4]=15;
		matriz[1][0]=21;matriz[1][1]=22;matriz[1][2]=23;matriz[1][3]=24;matriz[1][4]=25;
		matriz[2][0]=31;matriz[2][1]=32;matriz[2][2]=33;matriz[2][3]=34;matriz[2][4]=35;
		
		for (int i = 0; i < matriz.length; i++) {
			acum="";
			for (int j = 0; j < matriz[i].length; j++) {
				acum+="["+matriz[i][j]+"]";
			}
			System.out.println(acum);
		}
	}

}
