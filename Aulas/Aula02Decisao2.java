package Aulas;

import java.util.Scanner;

public class Aula02Decisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1, n2, resultado=0; //0 para que os cases sejam considerados mesmo que não seja inserido um dos cases informados	
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		n1 = ler.nextFloat();
		System.out.println("\nEntre com o segundo númeor: ");
		n2 = ler.nextFloat();
		
		System.out.println("\n\t\tCalculadora");
		System.out.println("\n 1 - Soma");
		System.out.println("\n 2 - Diferença");
		System.out.println("\n 3 - Multiplicação");
		System.out.println("\n 4 - Divisão");
		System.out.println("\nEntre com sua operação: ");
		
		op = ler.nextInt();
		
		switch(op)
		{
		case 1:
			resultado = n1 + n2;
			break;
		case 2:
			resultado = n1 - n2;
			break;
		case 3:
			resultado = n1 * n2;
			break;
		case 4:
			if(n2==0)
			{
				System.out.println("\nNão é possível fazer a divisão por 0.");
			}
			else
			{
			resultado = n1 / n2;
			}
			break;
		default: //exceção
			System.out.println("\nOpção inválida!!");
		
		}
		
		System.out.println("\nResultado: " + resultado);
		

	}

}
