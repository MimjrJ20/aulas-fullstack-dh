package Aulas;

public class Aula05TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// testar a Aula 5 Automovel
		
		// instanciando um objeto da classe Automovel
		
		Aula05Automovel auto = new Aula05Automovel ("Rejane Santos","Celta","RSA2J34", 2015);
		
		/* dar para instanciar sem valores com parentes vazio
		 * Aula5Automovel auto = new Aula5Automovel ();
		 */

		
		auto.imprimirInfo();
		
		System.out.println("\n**************************************************************");
		
		System.out.println("\n***Transferência de Proprietário***");
		
		auto.setNomeProprietario("Emily Pellini");
		
		System.out.println("\n**************************************************************");
		
		auto.imprimirInfo();
		
		
		
		

	}

}
