package logica.aulas.aula08;

import java.util.Random;

public class RandomClasse {

	public static void main(String[] args) {
		
		Random rand = new Random(); // instanciando obj do tipo random
		
		double num = rand.nextDouble();
		System.out.println(num);
		
		boolean teste = rand.nextBoolean();
		System.out.println(teste);
		
		//sorteando intervalo
		
		System.out.println(rand.nextInt());
		
		

	}

}
