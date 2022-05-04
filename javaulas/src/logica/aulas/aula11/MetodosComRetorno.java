package logica.aulas.aula11;

public class MetodosComRetorno {

	static int somar(int a, int b) {
		//int soma = a + b;
		return a + b;
	}
	
	static String saudacao(String nome) {
		String str = "Olá, " + nome + "! Seja bem vindo!";
		return str;
	}
	
	public static void main(String[] args) {
		
		somar(15, 22);
		System.out.println(somar(15, 22));
		
		int retornoSoma = somar(10,20);
		System.out.println("Retorno soma: "+ retornoSoma);
		double retornoPow = Math.pow(4, 2);
		
		System.out.println(retornoPow);
		
		System.out.println(saudacao("Verônica"));
	}

}
