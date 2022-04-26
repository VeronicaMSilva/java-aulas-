package javaulas;

public class JavaExercicios {

	public static void main(String[] args) {
		
		/*
		float num1 = 4.0f;
		float num2 = 5.5f;
		
		float media = (num1 + num2) /2;
		System.out.println(media);
		*/

		int numero = 5;
		int valor = 5 + numero++; // pos incremento 
		System.out.println(valor);
		System.out.println(numero);
		
		numero++;
		System.out.println(numero);
		
		System.out.println("");
		
		int valor2 = 5 + --numero;
		System.out.println(valor2);
		System.out.println(numero);
		
		System.out.println("");
		
		int valor3 = 3+ numero--;
		System.out.println(valor3);
		System.out.println(numero);
		System.out.println(numero+valor2++);
		System.out.println(valor2);
		
		
		
		
		
		
		
	}

}
