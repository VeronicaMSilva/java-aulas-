package logica.aulas.aula07;

import java.util.Scanner;

public class Aula07Exercicios {

	public static void main(String[] args) {
		
		System.out.println("Atividade 04"); //ultilizando "do/while"

		Scanner tec = new Scanner (System.in);
		double nota1, nota2; 
		do {
			System.out.println("Digite sua primeira nota: ");
			nota1 = tec.nextDouble();
			
		}while (nota1 < 0 || nota1 > 10);
		do {
			System.out.println("Digite sua segunda nota: ");
			nota2 = tec.nextDouble();	
		}while (nota2 < 0 || nota2 > 10);
		double media = (nota1 + nota2) / 2;
		System.out.println("Sua média é: " + media);
		
		
		
		
		
	
		
		
			
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
