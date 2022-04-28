package logica.aulas.aula09;

public class Vetores {

	public static void main(String[] args) {
		
			/*Sintaxe: <tipo>[] <nome> = new <tipo>[<tamanho>];
			Exemplo: String[] diasSemana = {seg ", "ter", "qua", "qui","sex","sab","dom"};
		  	int[] numeros = {10, 22, 13, 64, 35, 3, 87, 0, 48}; */
		/*
		String[] listaFrutas = new String[5];
		String[] listaFrutas = {"Kiwi", "Jambo","Jabuticaba","Pitanga","Embu"};
		System.out.println(listaFrutas[0]);
		
		listaFrutas[0] = "Kiwi";
		listaFrutas[1] = "Jambo";
		listaFrutas[2] = "Jabuticaba";
		listaFrutas[3] = "Pitanga";
		listaFrutas[4] = "Embu";
		
		int qtdFrutas = listaFrutas.length;
		for (int i=0; i < qtdFrutas; i++) {
			System.out.println(listaFrutas[i]);
		}
		*/
		//for indexado
		int[] numeros = {0, 5, 11, 4};
		for (int i=0; i<numeros.length; i++) {
			//System.out.println("Pos: "+ i+ "--Valor: "+numeros[i]);
			System.out.printf("Pos: %d -- Valor: %d \n", i, numeros[i]);
		}
		System.out.println("");
		
		//for each
		// percorre a lista e acessa os valores das posições
		
		for (int numero: numeros) {
			System.out.println("Valor: "+numero);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
