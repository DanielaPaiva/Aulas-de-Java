package POO;

public class Paciente {
	private String nome;
	private int idade;
	private String exame;
	
	public Paciente(String name, int id, String ex)
	{
		nome=name;
		idade=id;
		exame=ex;
	}
	public String getInf()
	{
		String dados="Nome do Paciente: "+nome+"\nIdade do Paciente: "+idade;
		return dados;
	}
	 public String getExaminar()
	 {String exa;
		 if(exame=="Sangue")
		 {
			 exa="DIAS DISPONIVEIS PARA EXAME\nSegunda-feira   Quarta-feira  Sexta-feira";
		 }
		 else if(exame=="Ortopedico") 
		 {
			 exa="DIAS DISPONIVEIS PARA EXAME\nTerça-feira  Quinta-feira  Sexta-feira";
		 }
		 else
		 {
			 exa="Demais exames: TODOS OS DIAS";
		 }
		 return exa;
	 }
}
