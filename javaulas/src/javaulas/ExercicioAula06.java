package javaulas;

import java.util.Scanner;

public class ExercicioAula06 {
	public static void main(String[] args) {
		
		System.out.println("...........exercicio 01............");
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		if (num%2 == 0) {
		System.out.println("Seu número é par!");		
		} else {
			System.out.println("Seu número é impar!");
		}
	
		System.out.println("...........exercicio 02............");	
		System.out.println("digite um numero: ");
		int num2 = entrada.nextInt();
		System.out.println("digite outro numero: ");
		int num3 = entrada.nextInt();
		if (num2 > num3) {	
			System.out.println(num2);
		} else if (num3 > num2) {
			System.out.println(num3);
		} else  {
			System.out.println("os números são iguais.");
		}
		System.out.println("...........exercicio 03............");	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
