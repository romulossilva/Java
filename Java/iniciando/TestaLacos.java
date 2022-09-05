package iniciando;

public class TestaLacos {
	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.print("Tabela do " + multiplicador + " : ");
			for (int contador = 0; contador <= 10; contador++) {
				
				System.out.print(multiplicador * contador);//ira imprimir a multiplicação
				System.out.print("  ");//cria um espaco entre os numeros
				
			}
			System.out.println();
		}
	}
}
