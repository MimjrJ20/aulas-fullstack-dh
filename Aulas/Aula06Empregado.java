package Aulas;


//extends = é uma herança --> subclasse da superclasse Pessoa

public class Aula06Empregado extends Aula06Pessoa {

	
	// criar ATRIBUTOS da classe Empregado
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	
	// criar o CONSTRUTOR para passar os parâmetros para a subclasse
	// se não criar o construtor ele nao compila
	
	public Aula06Empregado(String nome, String endereco, String cpf, int telefone, int idade, 
							int codigoSetor, float salarioBase, float imposto)
	
	{
		
		// o super indica o que vem da superclasse
		// tudo que for da superclasse eu indico entre parenteses
		// se por exemplo não quiser usar o endereco, crio dois super, um super COM endereço e outro SEM endereço
		
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
	
	
	//ele vai imprimir todas as informações do meu empregado
	public void imprimirInfo()
	
	{
		
		//chamar os atributos como get para acessar os métodos da superclasse
		System.out.println("\nNomde do Empregado: "+getNome()+"\nCPF: "+getCpf()+
							"\nIdade: "+getIdade()+" anos.\nTelefone: "+getTelefone()+
							"\nEndereço: "+getEndereco()+"\nCógigo do Setor: "+
							codigoSetor+ "\nSalário Base: "+salarioBase+
							"\nValor em porcentagem (sem o %) de imposto a ser retido do salário: "+
							imposto);
	}
	
	// calcular o salário líquido
	
	public void calcularSalario()
	
	{
		double salarioLiquido = salarioBase - (salarioBase*(imposto/100));
		System.out.println("\nO salário total a ser recebido pelo funcionário: "+getNome()+
							" é igual a: "+salarioLiquido);
		
	}
	
	
	
}
