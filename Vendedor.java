package pessoas;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, int idade, String genero, int salario, String afazeres) 
	{
		super(nome, idade, genero, salario);

	}
	
	void fechar_caixa() 
	{
		System.out.println("Fechou o caixa!");			
	}
	
	void realizar_venda() 
	{
		System.out.println("Realizando uma venda...");
		System.out.println("Venda realizada!");	
	}
}
