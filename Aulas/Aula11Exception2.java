package Aulas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula11Exception2 {
	
	//criar fora do main um método
	//demonstra lançamento de uma exceção quando ocorre uma diviasão por zero
	
	public static int quociente (int numerador, int denominador) throws ArithmeticException //criando método
	//thwors vai verificar se na execução do quociente vai ver se existe a ArithmeticException
	{
		return numerador / denominador;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		boolean continueLoop = true;//determina se mais entradas são necessárias ---> boolean só tem dois estados true e false
		
				
		//do = faça, vai verificar tudo lá dentro 
		do
		{
			try
			{
				System.out.println("\nEntre com o numerador: ");
				int numerador = leia.nextInt();
				
				System.out.println("\nEntre com o denominador: ");
				int denominador = leia.nextInt();
				
				int resultado = quociente(numerador, denominador);
				
				System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
				
				continueLoop = false; 
				
				//fim do try
			}
			//pode ter vários catch dentro do programa
			catch(InputMismatchException input)//vai tratar da seguinte forma
			{
				System.err.printf("\n\nException: %s\n", input);//mensagem de erro que vai imprimir --> err. = vai mostrar a letra em vermelho
				leia.nextLine();
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro!"
						+ "Por favor, tente novamente!");
			}
			catch(ArithmeticException arith)
			{
				System.err.printf("\n\nException: %s\n", arith);
				
				System.out.println("\nZero é um denominador inválido!!!"
						+ "Por favor, tente novamente!");
			}
		}
		while(continueLoop);

	}

}
