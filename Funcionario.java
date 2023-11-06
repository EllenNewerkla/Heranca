package pessoas;

public class Funcionario {

		public String nome;
		public int idade;
		public String genero;
		public int salario;
		
		public Funcionario(String nome, int idade, String genero, int salario) {
			this.nome=nome;
			this.idade=idade;
			this.genero=genero;
			this.salario=salario;
		}
		
		void bater_ponto() 
		{
			System.out.println("Acabou de bater o ponto!");
		}	
}
