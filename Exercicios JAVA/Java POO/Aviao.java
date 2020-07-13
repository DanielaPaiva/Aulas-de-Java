package POO;

public class Aviao {
	private String modelo;
	private String empresaAerea;
	private String saida;
	private String destino;
	private boolean combustivel;
	
	public Aviao(String model, String empresa, String sai, String dest, boolean comb)
	{
		modelo=model;
		empresaAerea=empresa;
		saida=sai;
		destino=dest;
		combustivel=comb;
		
	}

	public String getInfo()
	{
		String informacao="Modelo: "+modelo+"\nEmpresa Aerea: "+empresaAerea+"\nSaída de: "+saida+"\nDestino em: "+destino;
		return informacao;
	}

	
	public String getVoar() 
	{	String voa;
		if(combustivel==true)
		{
			voa="O avião pode voar!";
		}
		else
		{
			voa="CUIDADO!!!  NÃO AUTORIZADO PARA VOO";
		}
		return voa;
		
	}
	
}
