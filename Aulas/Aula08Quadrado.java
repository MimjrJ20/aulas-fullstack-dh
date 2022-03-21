package Aulas;

public class Aula08Quadrado extends Aula08BaseFigura implements Aula08Figuras {
	
	//extendendo da SUPERCLAS Base Figura e implementando da SUPERCLASS Figuras = multipla herança
	
	Aula08Quadrado (double lado, String nome)
	{
		super(lado,lado,nome);
		nomeClasse = "Aula8Quadrado";
		//O super chama o construtor da classe mae, podendo ser mais de um contrutor na classe mae
	}
	
	@Override
	public double getDiagonal()
	{
		
		return Math.sqrt(2)*lado1;
	}

}
