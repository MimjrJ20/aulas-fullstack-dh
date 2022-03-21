package Aulas;

import java.util.Scanner;

public class Aula03Repeticao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1, n2, n3, media, somaMedia=0, mediaGeral; // somaMedia=0 o zero é neutro;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=1;x<=5;x++)//x++ => x = x + 1 --> somar um depois que ele rodar (para somar mais 5 usa x+5);
			//x<=5 => vai repetir 5 vezes
		{
			System.out.println("\nNotas do aluno "+x+" : ");
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			while(n1<0 || n1>10)// limitar que o usuário digite fora do padrão
			//while repete o comando se true
	
			{
				System.out.println("\nVocê digitou um valor fora de 0 a 10. \nEntre com a primeira nota: ");
				n1 = leia.nextFloat();
			}
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			while(n2<0 || n2>10)// limitar que o usuário digite fora do padrão
			{
				System.out.println("\nVocê digitou um valor fora de 0 a 10. \nEntre com a segunda nota: ");
				n2 = leia.nextFloat();
			}
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			while(n3<0 || n3>10)// limitar que o usuário digite fora do padrão
			{
				System.out.println("\nVocê digitou um valor fora de 0 a 10. \nEntre com a terceira nota: ");
				n3 = leia.nextFloat();
			}
			
			media = (n1+n2+n3) / 3;
			
			somaMedia = somaMedia + media;
			//ou fazer => somaMedia += media;
			
			
		}
		
		mediaGeral = somaMedia / 5;
		
		System.out.printf("\nMédia Geral: %2.2f", mediaGeral);
		
			

	}

}
