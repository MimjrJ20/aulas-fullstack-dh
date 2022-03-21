package Aulas;//primeira aula

import java.util.Scanner;

public class Aula01OlaMundo {
	
	public static void main(String[] args) {
		// TODO Auto-generate method stub
		
		
		String nome; // estou crinado uma variável do tipo String
		int idade=28, x, y;
		double altura, nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in); // estou criando a entrada de dados, a palavra "leia" pode ser qualquer palavra
		
		System.out.println("Olá mundo!!"); // estou criando a saída de dados, ou seja imprimindo no console
		
		System.out.println("Por favor, prezado usário...\n\tEntre com seu nome: ");
		nome = leia.nextLine(); //estou pegando a entrada do meu usuário, e pegando variável e garatindo que realmente o dado que o usuário está digitando é uma sequencia de string
		System.out.println("Por favor, prezado usário...\n\tEntre com seu altura: ");
		altura = leia.nextFloat(); //estou pegando a entrada do meu usuário, e pegando variável e garatindo que realmente o dado que o usuário está digitando é uma sequencia de float
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3) / 3;
		
		if(media>=7 && media<=10)
		{
			System.out.println("\nAluno aprovado!!");
		}
		else if(media>=5 && media<7) 
		{
			System.out.println("\nAluno de exame!!");
		}
		else if(media>=0 && media<5)
		{
			System.out.println("\nAluno reprovado!!");
		}
		else 
		{
			System.out.println("\nMédia inválida!!!!");
		}
		
		
		System.out.println("\nMeu nome é: "+nome+"eu tenho: "+idade+" ano(s) e a minha altura é: "+altura);
		// outra opção para imprimir System.out.printf("\nMeu nome é: %s eu tenho %d anos e a minha altura é: %2.2f",nome,idade,altura) 
		// na altura limita as casas 2 para esquerda 2 para direita, 
		// onde s=nome, d=anos (número inteiro), f=altura (número decimal)
		
		
		System.out.printf("\nMédia aritmética: %2.2f", media);
		
		nota1 = Math.sqrt(nota2); // raiz quadrada
		
		nota2 = Math.pow(nota3, 3); //elevado a potencia
		
		System.out.println("\nEntre com o valor de X: ");
		x = leia.nextInt();
		
		System.out.println("\nEntre com o valor de Y: ");
		y = leia.nextInt();
		
		x = x % y; // calcula o resto da divisao de dois números inteiros
		
		
		
		
	}


}
