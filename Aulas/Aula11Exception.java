package Aulas;//COMO TRATAR EXCEÇÕES

public class Aula11Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = null;//colocando frase null para dar erro
		String novaFrase = null;
		
		// fazer uma estrutura que vai tentar fazer alguma coisa
		// se não der certo ele vai tentar outra
		
		//THORW NEW MENSAGEM DE ERRO
		
		//dentro do TRY possui:
		//- código que incluis comandos e invocações de métodos
		// que podem gerear uma situação de exceção
		try//VOU TENTAR
		{
			
			novaFrase = frase.toUpperCase();//transforma todo seu string em maiúscula
		}
		
		
		//diferente do IF e ELSE pois IF e ELSE trata true/false (condições)e TRY e CATCH trata erro
		
		//dentro do CATCH
		//bloco de tratamento associado à condição de exceção
		// xException ou a qualquer uma de suas sublclasse, identicada aqui pelo objeto
		//com referencia ex
		catch(NullPointerException e)// captura da possível exceção - e=inicializar variavel - tratar o erro
		{
			//tratamento da exceção
			System.out.println("\nA frase inicial está nula, para solucionar tal problema,"
					+ "foi lhe atribuido um valor *default*");
			frase = "Agora tem algo aqui!";
			novaFrase = frase.toUpperCase();
			
		}
		System.out.println("\nFrase antiga: "+frase);
		System.out.println("\nNova frase: "+novaFrase);

	}

}
