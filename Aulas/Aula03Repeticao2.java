package Aulas;

import java.util.Scanner;

public class Aula03Repeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tabuada, x=1, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com qual Tabuada deseja montar: ");
		tabuada = leia.nextInt();
		
		do
		//executa primeiro depois testa a condição
		{
			resultado = x * tabuada;
			System.out.println("\n"+tabuada+" X "+x+" = "+resultado);
			x++;//x++ para incrementar a cada passagem
		}
		
		while(x<=10);
		//testa primeiro depois executa
		
	}

}
