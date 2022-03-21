package Aulas;

public class Aula06Pessoa {
	
	// criar ATRIBUTOS para classe 'Pessoa' ---> SUPERCLASSE:
	
	private String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;
	
	// criar o CONSTRTUTOR que tem o mesmo nome da classe (método especial para inicializar os atributos dos objetos)
	
	public Aula06Pessoa(String nome, String endereco, String cpf, int telefone, int idade)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}
	
	// criar os getter e setter (direito/source)

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public void validarCpf()
	{
		if(getCpf().length() !=11)
			// length conta a quantidade de caracteres
			// != igual 'diferente de"
		{
			System.out.println("\n----CPF INVÁLIDO");
		}
		
		else
		{
			System.out.println("\n----CPF VÁLIDO");
		}
		
	}
}
