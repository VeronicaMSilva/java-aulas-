package logica.aulas.aula11;

import java.util.Scanner;

public class Exercicios {
	//Exercicio 01 
	static double calculaArea(double l, double c) {
		double somaD = l * c;
		return somaD;
	}
	
	//Exercicio 02 
	static String votacao(int idade) {
		if ((idade >= 16 && idade < 18)||(idade >70)){
			return "opcional";
		} else if (idade >= 18 && idade <=70){
			return "obrigatorio";	
		} else {
			return "Proibido";
		}
		   	
	}

	public static void main(String[] args) {
		
		System.out.println(calculaArea(15, 5));
		
		System.out.println(votacao(70));
		
		
		
		
		
		
		
		
	}

}
