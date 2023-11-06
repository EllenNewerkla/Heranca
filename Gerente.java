package pessoas;

public class Gerente extends Funcionario {

	public Gerente(String nome, int idade, String genero, int salario, String afazeres) 
	{
		super(nome, idade, genero, salario);

	}
	
	void solicitar_material() 
	{
		System.out.println("Solicitando material...");		
		System.out.println("Material solicitado!");	
	}
	
}
