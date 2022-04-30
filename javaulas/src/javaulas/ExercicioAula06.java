package javaulas;

import java.util.Scanner;

public class ExercicioAula06 {
	public static void main(String[] args) {
		/*
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
		*/
		/*
		System.out.println("...........exercicio 03............");	
		Scanner dig = new Scanner(System.in);
		System.out.println("Digite sua primeira nota: ");
		double nota1 = dig.nextDouble();
		System.out.println("Digite sua segunda nota: ");
		double nota2 = dig.nextDouble();
		System.out.println("Digite sua terceira nota: ");
		double nota3 = dig.nextDouble();
		System.out.println("Digite sua quarta nota: ");
		double nota4 = dig.nextDouble();
		double media = ((nota1 + nota2 + nota3 + nota4) /4);
			if (media >= 7 ) {
				System.out.println("Sua média foi: " + media + ". Você foi aprovado, parabéns!");
			} else if (media >= 5) {
				System.out.println("Sua média foi: " + media + ". Você está de recuperação.");
			}else if (media <= 4){
				System.out.println("Sua média foi: " + media + ". Você foi reprovado.");
			}
		*/
		/*
		System.out.println("...........exercicio 04............");
		Scanner valores = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int valorA  = valores.nextInt();
		System.out.println("Digite um número: ");
		int valorB = valores.nextInt();
		if (valorA%valorB == 0) {
			System.out.println("São múltiplos");
		}else {
			System.out.println("Não são múltiplos");
		}
		*/
		/*
		System.out.println("...........exercicio 05............");
		Scanner op = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int pN = op.nextInt();
		System.out.println("Digite outro número: ");
		int pS = op.nextInt();
			Scanner oM = new Scanner(System.in);
		System.out.println("Digite o operador matemático: ");
		String oP = oM.nextLine(); 
		switch (oP) {
			case "+":
				System.out.println(pN+pS);
				break;
			case "-":
				System.out.println(pN-pS);
				break;
			case "*":
				System.out.println(pN*pS);
				break;
			case "/":
				System.out.println(pN/pS);
		}
		*/
		
		System.out.println("...........exercicio 06............");
		Scanner tectec = new Scanner(System.in);
		System.out.println("Digite o ano que você nasceu: ");
		int ano = tectec.nextInt();
		int idade = (2022 - ano);
		if ((idade >= 16 && idade < 18)||(idade >=70)){
			System.out.println("Sua idade é: " + idade + " Logo, seu voto é opcional");
		} else if (idade >= 18 && idade <70){
			System.out.println("Sua idade é: " + idade + " Logo, seu voto é obrigatorio");
		} else {
			System.out.println("Sua idade é: " + idade + " Logo, você não pode votar");
		}
		
		//System.out.println("...........exercicio 06............");
		
		
		
		
		
		
		
		
		
		
	
	
	
	}

}
