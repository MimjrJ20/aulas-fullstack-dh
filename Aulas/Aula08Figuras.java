package Aulas;

public interface Aula08Figuras {
	
	public String nomeInterface = "Figuras";
	abstract public String getNome();
	abstract public void setNome(String nome);
	
	public double getArea();
	public double getPerimetro();
	double getDiagonal();
	//não colocar o método public pois quando não identifca o método o padrão é public
	
	
	

}
