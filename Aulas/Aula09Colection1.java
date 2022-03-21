package Aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Aula09Colection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//tipo LIST
		List<Integer> minhaLista = new ArrayList<Integer>();
		//criação do List com inteiro. integer = números inteiros
		
		minhaLista.add(2);
		minhaLista.add(5);
		minhaLista.add(7);
		minhaLista.add(8);
		minhaLista.add(9);
		minhaLista.add(1);
		minhaLista.add(3);
		minhaLista.add(4);
		//.add = inserção dos elementos do meu ArrayList --> minhaLista 
		
		
		for(Integer listaElemento:minhaLista) 
		//vou percorrer todos os elementos da minhaLista
		{
			System.out.println(listaElemento);
		}
		
		
		System.out.println("\nRemovendo um elemento da lista...");
		
		System.out.println();//limpando o cache de memória
		
		minhaLista.remove(0);
		//remove = serve para deletar um elemento da minha lista
		
		for(Integer listaElemento:minhaLista) 
			//vou percorrer todos os elementos da minhaLista retirando o item do indice removido
			{
				System.out.println(listaElemento);
			}
		
		int primeiroElemento = minhaLista.get(0);
		
		System.out.println("\nO primeiro elemento da minha lista é: "+primeiroElemento);
		//pegar um elemento da mminha lista através do seu indice
		
		System.out.println();//limpando o cache de memória
		
		for (int i=0;i<minhaLista.size();i++)
		//size vai verificar a quantidade ou o tamanho da minha ArrayList
		{
			System.out.println("\nElemento: "+minhaLista.get(i));
			
		}
		
		
		Collections.sort(minhaLista);
		//sort = ordenar os elementos da minha lista
		
		System.out.println("\nDepois de ordenada a minha lista, temos: ");
		
		System.out.println(minhaLista);
		
		System.out.println();//limpando o cache de memória
		
		
		//tipo SET
		Set<Integer> meuSet  = new HashSet<Integer>();
		
		meuSet.add(6);
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(3);
		meuSet.add(1);
		meuSet.add(5);
		meuSet.add(2);
		
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		//criando o api iterator que serve para manipular os dados
		//api é software
		
		while(iMeuSet.hasNext())
			
		{
			
			System.out.println(iMeuSet.next());
		}
		
		
	}
	
	
	

}
