package Aulas;

public class Aula07Fixo extends Aula07Telefone{
	
	public Aula07Fixo()
	{
		//frase para string tipo
		super("Telefone Fixo");
	}
	
	@Override
	public void toca(int numToques)
	{
		for(int i=0;i<numToques;i++)
			
		{
			
			System.out.println("\nTririlimmmtrililimmm");
		}
	}
	
	@Override
	public void disca(String numero)
	{
		System.out.println("\nDiscando: "+numero);
	}

}
