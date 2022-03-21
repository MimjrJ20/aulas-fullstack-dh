package Aulas;//COMO TRATAR EXCE��ES

public class Aula11Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = null;//colocando frase null para dar erro
		String novaFrase = null;
		
		// fazer uma estrutura que vai tentar fazer alguma coisa
		// se n�o der certo ele vai tentar outra
		
		//THORW NEW MENSAGEM DE ERRO
		
		//dentro do TRY possui:
		//- c�digo que incluis comandos e invoca��es de m�todos
		// que podem gerear uma situa��o de exce��o
		try//VOU TENTAR
		{
			
			novaFrase = frase.toUpperCase();//transforma todo seu string em mai�scula
		}
		
		
		//diferente do IF e ELSE pois IF e ELSE trata true/false (condi��es)e TRY e CATCH trata erro
		
		//dentro do CATCH
		//bloco de tratamento associado � condi��o de exce��o
		// xException ou a qualquer uma de suas sublclasse, identicada aqui pelo objeto
		//com referencia ex
		catch(NullPointerException e)// captura da poss�vel exce��o - e=inicializar variavel - tratar o erro
		{
			//tratamento da exce��o
			System.out.println("\nA frase inicial est� nula, para solucionar tal problema,"
					+ "foi lhe atribuido um valor *default*");
			frase = "Agora tem algo aqui!";
			novaFrase = frase.toUpperCase();
			
		}
		System.out.println("\nFrase antiga: "+frase);
		System.out.println("\nNova frase: "+novaFrase);

	}

}
