package Aulas;


//extends = � uma heran�a --> subclasse da superclasse Pessoa

public class Aula06Empregado extends Aula06Pessoa {

	
	// criar ATRIBUTOS da classe Empregado
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	
	// criar o CONSTRUTOR para passar os par�metros para a subclasse
	// se n�o criar o construtor ele nao compila
	
	public Aula06Empregado(String nome, String endereco, String cpf, int telefone, int idade, 
							int codigoSetor, float salarioBase, float imposto)
	
	{
		
		// o super indica o que vem da superclasse
		// tudo que for da superclasse eu indico entre parenteses
		// se por exemplo n�o quiser usar o endereco, crio dois super, um super COM endere�o e outro SEM endere�o
		
		super(nome, endereco, cpf, telefone, idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	
	// criar os getter e setter (direito/source)

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	
	//ele vai imprimir todas as informa��es do meu empregado
	public void imprimirInfo()
	
	{
		
		//chamar os atributos como get para acessar os m�todos da superclasse
		System.out.println("\nNomde do Empregado: "+getNome()+"\nCPF: "+getCpf()+
							"\nIdade: "+getIdade()+" anos.\nTelefone: "+getTelefone()+
							"\nEndere�o: "+getEndereco()+"\nC�gigo do Setor: "+
							codigoSetor+ "\nSal�rio Base: "+salarioBase+
							"\nValor em porcentagem (sem o %) de imposto a ser retido do sal�rio: "+
							imposto);
	}
	
	// calcular o sal�rio l�quido
	
	public void calcularSalario()
	
	{
		double salarioLiquido = salarioBase - (salarioBase*(imposto/100));
		System.out.println("\nO sal�rio total a ser recebido pelo funcion�rio: "+getNome()+
							" � igual a: "+salarioLiquido);
		
	}
	
	
	
}
