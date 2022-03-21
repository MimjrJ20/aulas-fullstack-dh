package Aulas;

import java.util.ArrayList;
import java.util.Scanner;

public class Aula10Colection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int op;
		Scanner ler = new Scanner (System.in);
		
		//outra forma de criar Array List de String (array list � ilimitado)
		ArrayList<String> estoque = new ArrayList();
		
		//montando um menu para intera��o com o sistema
		do
		{
			System.out.println("\n---------------------------------------------------");
			System.out.println("\n(1) Deseja adicionar produtos no estoque?");
			System.out.println("\n(2) Deseja reomver produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar produtos do estoque?");
			System.out.println("\n(4) Deseja vizualiar todos os produtos do estoque?");
			System.out.println("\n(0) Deseja sair do programa?");
			System.out.println("\n---------------------------------------------------");
			System.out.println("\n Digite uma op��o: ");
			op = ler.nextInt();
			
			switch(op)
			{
			case 1:
				
				ler.nextLine();//limpar o cache
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = ler.nextLine();//variaveis locais --> boas pr�ticas -- lendo a String que o usuario digitou
				//produto.toUpperCase(); ---> padronizar para a escrita do produto digitado para maiusculo
				estoque.add(produto);//adicionar o produto que o usu�rio digitou e colocando na lista estoque
				
				System.out.println(estoque);//mostrar como o estoque est� atualmente
				
			break; //finalizar o case 1
			
			case 2:
				ler.nextLine();//limpar o cache
				System.out.println("\nDigite o produto para remover do estoque: ");
				String remover = ler.nextLine();//variaveis locais --> boas pr�ticas
				//antes de remover verificar se tem em estoque
				if(estoque.contains(remover))//chamo meu estoque e verifico se tem algo na lista
				{
					estoque.add(remover);
					System.out.println("\nO produto "+remover+" foi removido do estoque.");
				}
				else //se n�o tiver no esoque
				{
					System.out.println("\nProduto n�o existe!");
				}
				
				System.out.println(estoque);//mostrar como o estoque est� atualmente
				
			break;//finalizar o case 2	
			
			case 3:
				ler.nextLine();//limpas o cache
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verificar = ler.nextLine();
				System.out.println("\nDigite o produto que entrar� no lugar de "+verificar+" : ");
				String novo = ler.nextLine();
				
				if(estoque.contains(verificar))
				{
					estoque.remove(verificar);//removendo o que ele quer tirar do estoque
					estoque.add(novo);//adicionado o que ele quer colocar no lugar do que ele removeu
				}
				else
				{
					System.out.println("\nProduto n�o exsite!!!");
				}
				
				System.out.println(estoque);//mostrar como o estoque est� atualmente
			break;
			
			case 4:
				ler.nextLine();//limpas o cache
				System.out.println("\nOs produtos do estoque s�o: ");
				System.out.println(estoque);
			break;	
			
			default:
				if(op==0)
				{
					System.out.println("\nTchau, muito obrigado por utilizar o nosso sistema!!");
				}
				else
				{
				System.out.println("\nOp��o inv�lida!!!");
				}
			}
		
		}
		while (op != 0);

	}

}
