package logica.aulas.aula07;

import java.util.Scanner;

public class WhileRepeticao {

	public static void main(String[] args) {
		
		// Repetições sem while
		/*
		System.out.println("Cambalhota");
		System.out.println("Cambalhota");
		System.out.println("Cambalhota");
		*/
		
		// Repetições com while
		
		int cc1 = 0;
		while (cc1 < 10) {
			cc1++;
			if (cc1 == 3 || cc1 == 5) {
				continue;
			}
			if (cc1 == 7) {
				break;
			}
			System.out.println("Cambalhota " + cc1);
		}
	
		
		//.............Atividade 03.............
		
		Scanner num = new Scanner(System.in);
		System.out.print("Digite um número; ");
		int n = num.nextInt();
		int cont = 1;
			while (cont <= n) {
				System.out.println(cont);
				cont++;
			}
		
			// Repetição com "Do" e "While"
		
		int cc = 0;
		do {
			System.out.println("Cambalhota" + cc);
			cc++;
		} while (cc <3);
		
		
		//Exemplo. Acerte o número (7) para sair
		
		Scanner teclado = new Scanner (System.in);
		int numero;
		do {
			System.out.println("Acerte o número para sair: ");
			numero = teclado.nextInt();
			System.out.println("Número escolhido: " + numero);
			System.out.println("");
		}while (numero !=7);
		
		System.out.println("Saiu do programa, parabéns!");
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
