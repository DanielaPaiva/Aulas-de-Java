package POO;

public class Produto {
	private String tipo;
	private  int codigo;
	private double preço;
	private String marca;

	public Produto(String tip, int cd, double price,String marc)
	{
		tipo=tip;
		codigo=cd;
		preço=price;
		marca=marc;
	}

	public String getInfo()
	{
		String informacao="Tipo do Produto: "+tipo+"\nCódigo: "+codigo+"\nPreço do Produto: "+preço+"\nMarca do Produto: "+marca;
		return informacao;
	}

	public String getLiberar() 
	{
		String uso="Produto liberado com SUCESSO.";
		return uso;
	}
	
}
