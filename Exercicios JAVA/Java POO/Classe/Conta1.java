package POO;

public class Conta1 {
	public static void main(String [] args) 
	{
		Conta co1=new Conta("Bradesco",010,04563,8, true);
		System.out.println(co1.getDados());
		System.out.println(co1.getConsultar());
	}

}
