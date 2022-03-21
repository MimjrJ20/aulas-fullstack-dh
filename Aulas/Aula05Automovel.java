package Aulas;

public class Aula05Automovel {
	
		// declaração dos atributos da classe Automóvel
	
		// atributos = caracteristicas
		
		private String nomeProprietario; // private = modificador para garantir a segurança 
		private String modelo; 
		private String placa;
		private int ano;
		
		// criação do método especial do construtor
		
		public Aula05Automovel (String nomeProprietario,String modelo,String placa,int ano) //public = modificador
		{
			this.nomeProprietario = nomeProprietario;
			this.modelo = modelo;
			this.placa = placa;
			this.ano = ano;
	
		}
		
		// criação de métodos da classe
		// editor direito source generate getter and setter 

		public String getNomeProprietario() {
			return nomeProprietario;
		}

		public void setNomeProprietario(String nomeProprietario) {
			this.nomeProprietario = nomeProprietario;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}
		
		public void imprimirInfo()
		{
			System.out.println(nomeProprietario+ " possui um(a) "+modelo+
					" com placa: "+placa+ " e ano: "+ano);
		}
		

		
		
		

}
