package Aulas;

public class Aula06TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// criar o main pois é o teste
		
		Aula06Empregado emp = new Aula06Empregado("Edu", "Rua da Marola, nº 386", "9", 
												999999999, 28, 999, 50000, 7);
		emp.imprimirInfo();
		emp.calcularSalario();
		
		//tentar formatar o salário
		//fazer o do empregado
		//criar o do fornecedor (classe herdar da Pessoa)
		//criar o do cliente (classe herdar da Pessoa)
		
		Aula06Operario op = new Aula06Operario("Luis", "Rua da Bobos, nº 0", "1", 
											111111111, 25, 1000, 50);
		op.imprimirInfo();
		op.calcularProducao();

	}

}
