package Aulas;

public interface Aula08Figuras {
	
	public String nomeInterface = "Figuras";
	abstract public String getNome();
	abstract public void setNome(String nome);
	
	public double getArea();
	public double getPerimetro();
	double getDiagonal();
	//n�o colocar o m�todo public pois quando n�o identifca o m�todo o padr�o � public
	
	
	

}
