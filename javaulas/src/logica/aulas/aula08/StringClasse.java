package logica.aulas.aula08;

public class StringClasse {

	public static void main(String[] args) {
		
		
		String str = "FIAP Paulista TOP";
		/*
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		*/
		
		int tamanhoStr = str.length(); //length é ultilizado para descobrir o tamanho da String/vetor
		System.out.println(tamanhoStr);
		for (int i = 0; i < tamanhoStr; i++) {
			System.out.println(str.charAt(i));
		}
		
		
		
		
	}

}
