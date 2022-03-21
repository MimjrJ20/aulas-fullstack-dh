package Aulas;


//extends = � uma heran�a --> subclasse da superclasse Pessoa

public class Aula06Operario extends Aula06Pessoa {
	
	// criar ATRIBUTOS da classe Empregado
	private double valorProducao;
	private double comissao;
	
		// criar o CONSTRUTOR para passar os par�metros para a subclasse
		// se n�o criar o construtor ele nao compila
		
		public Aula06Operario(String nome, String endereco, String cpf, int telefone, int idade, 
								double valorProducao, double comissao)
		{
			
			// o super indica o que vem da superclasse
			// tudo que for da superclasse eu indico entre parenteses
			
			super(nome, endereco, cpf, telefone, idade);
			this.valorProducao = valorProducao;
			this.comissao = comissao;
			
		}
		
		// criar os getter e setter (direito/source)

		public double getValorProducao() {
			return valorProducao;
		}

		public void setValorProducao(double valorProducao) {
			this.valorProducao = valorProducao;
		}

		public double getComissao() {
			return comissao;
		}

		public void setComissao(double comissao) {
			this.comissao = comissao;
		}
		
		//ele vai imprimir todas as informa��es do meu oper�rio
		//n�o tem problema usar o mesmo m�todo usado no empregado
		public void imprimirInfo()
		
		{
			
			//chamar os atributos como get para acessar os m�todos da superclasse
			System.out.println("\n\nNomde do Oper�rio: "+getNome()+"\nCPF: "+getCpf()+
								"\nIdade: "+getIdade()+" anos.\nTelefone: "+getTelefone()+
								"\nEndere�o: "+getEndereco()+
								"\nValor monet�rio dos artigos produzidos: "+valorProducao+
								"\nValor em porcentagem (sem o %) da comiss�o deste artigo: "+
								comissao);
		}
		
		// calcular o sal�rio l�quido
		
		public void calcularProducao()
		
		{
			double valorTotal = valorProducao + (valorProducao *(comissao/100));
			System.out.println("\nO valor total a ser recebido pelo oper�rio: "+getNome()+
								" ser� de: "+valorTotal);
			
		}
		
	
	

}
