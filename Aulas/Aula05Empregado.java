	package Aulas;

import java.text.NumberFormat;

public class Aula05Empregado {

	//criação dos atributos
	
	private String nome;
	private double salario;
	
	
	// criar meu construtor com o mesmo nome da classe
	
	public Aula05Empregado(String n,double s)
	{
	//método set é modificador
		
		this.setNome(n);
		this.setSalario(s);
	}
	// editor direito source generate setter and getter para não confudir com o parametro


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
		// variável chamado nf
		// get Currency Instance vai pegar a moeda do seu país
		// dá para alterar a moeda "locale"
		nf.setMinimumFractionDigits(2);
		// método "set minimum fraction digits" fala quantas casas eu quero depois da vírgula
		String formatoMoeda = nf.format(salario);
	    // método "format" para formatar o salário em monetário
		
		return formatoMoeda;
	}
	
	public void imprimir()
	{
		System.out.println(nome+"\t\t"+ "Salário: "+ this.formatarMoeda());
		//método da própria classe
	}
}
