package Aulas;

public class Aula05TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// chamar array vetor do tipo empregado
		
		Aula05Empregado[] lista = new Aula05Empregado[3];
		
		lista[0] = new Aula05Empregado("Ana Kélvia",10000);
		lista[1] = new Aula05Empregado("Lucas Theberge",11000);
		lista[2] = new Aula05Empregado("Leticia Toffoli",30000);
		
		for(Aula05Empregado roda:lista)
		/* for it a partir da classe "Aula5Empregado" eu vou criar uma variável "roda"
		 * dois pontos significa qual objeto vai pegar
		 */
		{
			roda.imprimir();
		}
		
		System.out.println("\n***********************************************\n");
		
		for(Aula05Empregado roda:lista)
		{
			roda.aumentarSalario(10);
			roda.imprimir();
		}

	}

}
