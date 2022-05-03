package logica.aulas.aula10;

import java.util.Scanner;

public class Metodos { 
	
	static void saudacao() {
		System.out.println("Seja bem vindo ao programa!!");
		

		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = tec.next();
		
		System.out.print("Digite sua idade: ");
		int idade = tec.nextInt();
		
		if (idade < 18) {
			System.out.println("Olá " + nome + "! Você é menor de idade");
		}else {
			System.out.println("Olá " + nome + "! Você é maior de idade");
		}
		
		
	}

	static void saudacaoComArgs(String nome, int idade) {
		System.out.println(nome);
		System.out.println(idade);
	}
	
	static void somar(int a, int b) {
		int soma = a + b;
		System.out.println(soma);
	}
	public static void main(String[] args) {
		
		System.out.println("Olá!!");
		
		//saudacao();
		
	saudacaoComArgs("Verô", 17);

		
	somar(10, 35);	
	somar(10, 50);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
