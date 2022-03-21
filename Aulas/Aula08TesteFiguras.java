package Aulas;

public class Aula08TesteFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aula08Quadrado fig1 = new Aula08Quadrado (10,"QuadradoDH1");
		Aula08Retangulo fig2 = new Aula08Retangulo (3,4,"RetanguloDH1");
		
		//imprimir quadrado
		System.out.println(fig1.getNome()+" : "+fig1.getDiagonal());
		
		
		//imprimir retangulo
		System.out.println(fig2.getNome()+" : "+fig2.getDiagonal());

	}

}
