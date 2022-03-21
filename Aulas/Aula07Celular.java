package Aulas;


//criando uma subclasse
public class Aula07Celular extends Aula07Telefone {
	
	public Aula07Celular()
	
	{
		super("Telefone Celular");
	}
	
	// para falar que � uma classe � polimorfica vamos criar uma refer�ncia
	// colocar @Override
	// import�ncia de manter o mesmo nome e mesmo parametro
	
	@Override
	public void toca(int codigoToque)
	{
		switch(codigoToque)
		{
		case 1:
			System.out.println("\nShalamar...shalamar");
			break;
		case 2:
			System.out.println("\nTananinana...tananinana");
			break;
		default:
			System.out.println("\nTa...tanana...tanana");
		}
	}
	
	public void disca(String numero)
	{
		System.out.println("\nO n�mero: "+numero+" � um celular.");
	}
}
