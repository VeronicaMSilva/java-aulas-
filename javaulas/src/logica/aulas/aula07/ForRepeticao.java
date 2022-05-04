package logica.aulas.aula07;

import java.util.Scanner;

public class ForRepeticao {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		for (int cc=0; cc < 3; cc++) {
			System.out.println("Cambalhota " + cc); 
		}
		
		System.out.println("Atividade 05");
		System.out.println("Digite a quantidade de cambalhotas desejadas: ");
		int camb = tec.nextInt();
			for (int i=0; i < camb; i++) {
				System.out.println("Cambalhota " + i);
			}
	
			
		//For encadeado 
		for (int i = 0; i <= 3; i++){
			
			for (int j = 0; j <= 2; j+=2) {
				System.out.printf("%d, %d \n", i,j);
			}
		}

	}

}
