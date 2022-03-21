package Aulas;

public class Aula07TesteTelefone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aula07Celular celular = new Aula07Celular();
		Aula07Fixo fixo = new Aula07Fixo();
		Aula07Publico publico = new Aula07Publico();
		
		Aula07Telefone telefone = null;
		
		//fórmula para pegar número randomico
		int n = (int) (Math.random()*3.0);
		
		System.out.println("\nO número escolhido foi: "+n);
		
		switch(n)
		
		{
		case 0: telefone = celular;break;
		case 1: telefone = fixo;break;
		case 2: telefone = publico;break;
		default: System.out.println("\nErro Inesperado!!!");
		
		
		}
		
		if(telefone!=null)
		{
			telefone.disca("42324544");
			telefone.toca(4);
		}
		

	}

}
