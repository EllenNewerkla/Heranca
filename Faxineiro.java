package pessoas;

public class Faxineiro extends Funcionario 
{
	
	public Faxineiro(String nome, int idade, String genero, int salario) 
	{
		super(nome, idade, genero, salario);
	}
	
	void tarefa() 
	{
		System.out.println("Limpando o chão");
	}
}
