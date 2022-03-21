package Aulas;

import java.util.Scanner;

public class Aula04ArrayVetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float [] media = new float [5];//array de médias de cada aluno
		//Podemos criar array de nomes --> String[] nomeDoAluno = new String[n];
		float n1,n2,n3,somaMedia=0,mediaGeral;
		int x, ap=0, ex=0, rep=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<5;x++)//menor que 5, pois o cinco indica a posição do array
		{
			System.out.println("\nNotas do aluno: " + (x+1));
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			while(n1<0 || n1>10)
			{
				System.out.println("\nIntervalo de notas errado... \nEntre com a primeira nota: ");
				n1 = leia.nextFloat();
			}
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			while(n2<0 || n2>10)
			{
				System.out.println("\nIntervalo de notas errado... \nEntre com a segunda nota: ");
				n2 = leia.nextFloat();
			}
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			while(n3<0 || n3>10)
			{
				System.out.println("\nIntervalo de notas errado... \nEntre com a terceira nota: ");
				n3 = leia.nextFloat();
			}
			
			media[x] = (n1+n2+n3)/3;//popular o vetor = jogar valores para cada posição no vetor
			
			if(media[x]>7 && media[x]<=10)
			{
				System.out.println("\nAluno Aprovado!!");
				ap++;// contar aprovados
			
			}
			else if (media[x]>=5 && media[x]<7)
			{
				System.out.println("\nAluno de Exame!!!");
				ex++; // contar de exame
			
			}
			else
			{
				System.out.println("\nAluno Reprovado!!!!");
				rep++;
			}
			
			System.out.println("\n\tMédia: " + media[x] + "\n\n");
			
			somaMedia += media[x];
			//+= somar o resultado da media geral --> somaMedia = somaMedia + media
			
		}
		
		mediaGeral = somaMedia / x;
		//neste momento o x vale 5
		
		System.out.println("\nMédia Geral: " + mediaGeral);
		System.out.println("\nTotal de alunos Aprovados: " + ap);
		System.out.println("\nTotal de alunos de Exames: " + ex);
		System.out.println("\nTotal de alunos Reprovados: " + rep);

	}

}
