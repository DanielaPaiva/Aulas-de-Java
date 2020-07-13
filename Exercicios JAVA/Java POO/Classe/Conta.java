package POO;

public class Conta {
	 private String banco;
	 private int agencia;
	 private int conta;
	 private int digito;
	 private boolean consulta;
	 
	 public Conta(String bank,int ag,int cont,int dig, boolean cons)
	 {
		 banco=bank;
		 agencia=ag;
		 conta=cont;
		 digito=dig;
		 consulta=cons;
	 }
	 public String getDados()
	 {
		String info="Banco: "+banco+"\nAgencia: "+agencia+"\nConta: "+conta+"\nDigito: "+digito;
		return info;
	 }
	 public String getConsultar()
	 { String valor;
	 if(consulta==true)
	 {
		 valor="Saldo na conta: R$ 1200.00";
	 }else 
	 {
		 valor=" ";
	 }
		 return valor;
	 }
}
