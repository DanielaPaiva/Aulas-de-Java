package POO;

public class Funcionario {
	
	private String nome;
	private String cargo;
	private String setor;
	
	public Funcionario (String name, String carg, String set)
	{
		nome=name;
		cargo=carg;
		setor=set;
	}
	public String getTrabalhador()
	{
		String dados="\nNome do funcionário: "+nome+"\nCargo: "+cargo+"\nSetor: "+setor;
		return dados;
	}
	
	
}
