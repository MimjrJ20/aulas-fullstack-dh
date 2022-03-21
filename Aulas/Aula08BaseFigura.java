package Aulas;


//criando minha SUPERCLASSE

public class Aula08BaseFigura {
	
	//protected limitador de acesso
	/*
	MODIFICADOR e nível de visibilidade --> 
	Protected: ele é praticamente igual ao default, 
	com a diferença de que se uma classe (mesmo que esteja fora do pacote) 
	estende da classe com o atributo protected, ela terá acesso a ele. 
	Então o acesso é por pacote e por herança.
	protected permite o acesso via pacote ou herança
	*/
	protected double lado1;
	protected double lado2;
	protected String nome;
	protected String nomeClasse;
	
	Aula08BaseFigura(double lado1, double lado2, String nome)
	{
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.nome = nome;
		
	}
	
	
	public double getArea()
	//tem na INTERFACE
	{
		
		return lado1 * lado2;
		
	}
	
	public double getPerimetro()
	//tem na INTERFACE
	{
		
		return (lado1 + lado2) * 2.0;
		
	}
	
	
	public String getNome()
	//tem na INTERFACE
	{
		
		return nome;
		
	}
	
	
	public void setNome(String nome)
	
	{
		
		this.nome = nome;
	}


	public double getLado1() {
		return lado1;
	}


	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}


	public double getLado2() {
		return lado2;
	}


	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}


	public String getNomeClasse() {
		return nomeClasse;
	}


	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
	
	

}
