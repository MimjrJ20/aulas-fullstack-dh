package Aulas;

public class Aula08Retangulo extends Aula08BaseFigura implements Aula08Figuras {
//criado uma multipla heran�a
	
	Aula08Retangulo (double lado1, double lado2, String nome)
	
	{
		
		super(lado1,lado2,nome);
		nomeClasse = "Aula8Retangulo";
		
	}
	
	@Override
	//se n�o cgamar o Override ele vai criar outro m�todo, impactando na perfomance
	public double getDiagonal()
	{
		
		return Math.sqrt(Math.pow(lado2, 2)+ Math.pow(lado2, 2));
	}

}
