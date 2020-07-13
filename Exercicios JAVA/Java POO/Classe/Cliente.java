package POO;

public class Cliente {
	private String nome;
	private String localidade;
	private String produto;
	private boolean pagamento;

	public Cliente(String name, String local,String prod, boolean pg)
	{
		nome=name;
		localidade=local;
		produto=prod;
		pagamento=pg;
		
	}
	

	public String getConsumidor()
	{
		String dados="Nome: "+nome+"\nLocalidade: "+localidade+"\nProduto: "+produto+"\nPagamento: "+pagamento;
		return dados;
	}
	

	public String Comprar()
	{
		String compra;
		if(pagamento==true)
		{
		compra="Pagamento OK!";
		}
		else
		{
		compra="Não houve pagamento ainda!";
		}
		return compra;
	}
	
	
	
}
