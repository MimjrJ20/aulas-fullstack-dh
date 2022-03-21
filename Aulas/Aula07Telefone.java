package Aulas;


//criado a SUPERCLASSE ABSTRATA
public abstract class Aula07Telefone {
	
	private String tipo;
	
	
	abstract public void disca(String numero);
	abstract public void toca(int numToques);
	
	public Aula07Telefone(String tipo)
	
	{
		this.tipo = tipo;
	}
	
	// criar os getter e setter (direito/source)
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void chamado(int chamaeu)
	
	{
		
	}
	
	
	

}
