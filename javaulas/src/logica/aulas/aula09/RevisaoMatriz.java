package logica.aulas.aula09;

public class RevisaoMatriz {

	public static void main(String[] args) {
	
		int [][] matriz = new int [2][7];
		System.out.println(matriz[0][5]);
		System.out.println(matriz.length); // mostrando as linhas
		System.out.println(matriz[0].length); //mostrando as colunas
		
		matriz [1][4] = 5;
		System.out.println(matriz[1][4]);
		
		matriz[1][2]= 6; // atribuindo valor 
		matriz[0][3]= 13;
		
		System.out.println("");
	//	int linha = 0;
		
	//	for (int i = 0; i< matriz[0].length; i++) {
	//		System.out.printf("Linha: %d -- Coluna: %d -- Valor: %d \n", linha, i, matriz[0][i]);
	//	}
		
		System.out.println("");
		
	//	linha = 1;
	//	for (int i = 0; i< matriz[0].length; i++) {
	//		System.out.printf("Linha: %d -- Coluna: %d -- Valor: %d \n", linha, i, matriz[0][i]);
	//	}
		
	for(int linha =0; linha < matriz.length; linha++) {
		for (int i = 0; i< matriz[0].length; i++) {
			System.out.printf("Linha: %d -- Coluna: %d -- Valor: %d \n", linha, i, matriz[0][i]);
		}
		System.out.println("");
	}
		
		
		
		
		
	}

}
