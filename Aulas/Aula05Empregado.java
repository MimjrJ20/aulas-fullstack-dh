	package Aulas;

import java.text.NumberFormat;

public class Aula05Empregado {

	//cria��o dos atributos
	
	private String nome;
	private double salario;
	
	
	// criar meu construtor com o mesmo nome da classe
	
	public Aula05Empregado(String n,double s)
	{
	//m�todo set � modificador
		
		this.setNome(n);
		this.setSalario(s);
	}
	// editor direito source generate setter and getter para n�o confudir com o parametro


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual)
	{
		salario *= 1 + percentual / 100;
		// salario = salario * 1 + percentual / 100
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		// vari�vel chamado nf
		// get Currency Instance vai pegar a moeda do seu pa�s
		// d� para alterar a moeda "locale"
		nf.setMinimumFractionDigits(2);
		// m�todo "set minimum fraction digits" fala quantas casas eu quero depois da v�rgula
		String formatoMoeda = nf.format(salario);
	    // m�todo "format" para formatar o sal�rio em monet�rio
		
		return formatoMoeda;
	}
	
	public void imprimir()
	{
		System.out.println(nome+"\t\t"+ "Sal�rio: "+ this.formatarMoeda());
		//m�todo da pr�pria classe
	}
}
