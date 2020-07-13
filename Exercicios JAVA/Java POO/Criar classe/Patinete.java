package POO;

public class Patinete {
	private String cor;
	private String marca;
	private String tamanho;
	private boolean situacao;
	
	public Patinete(String color, String marc, String tam, boolean sit)
	{
		cor=color;
		marca=marc;
		tamanho=tam;
		situacao=sit;;
	}
	
	public String getDadosDoProduto()
	{
		String pati="Cor: "+cor+"\nMarca: "+marca+"\nModelo:"+tamanho;
		return pati;
	}
	public String getVender()
	{ String qualidade;
		if(situacao==true)
		{
			qualidade="Patinete pronto para venda!";
		}
		else
		{
			qualidade="Não autorizado para venda!";
		}
		return qualidade;
	}
	
}
