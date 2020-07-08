/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
 Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino), 
e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.*/
package calculo;

import java.util.Scanner;

public class RepeticaoEx4 {
	public static void main(String [] args)
	{	Scanner teclado=new Scanner(System.in);
		int idade,opcao, sexo,resp=0,calma=0,mulherNerv=0,homAgressivo=0,nervQuarenta=0,camlaDezoito=0;
		
		
		while(resp<=4) {
			
			System.out.println("Digite sua idade:");
			idade=teclado.nextInt();
			System.out.println("Digite seu sexo:\nFEMININO:Digite 1\nMASCULINO:Digite 2 ");
			sexo=teclado.nextInt();
			System.out.println("Escolha entre as opções:\n 1-Calma\n 2-Nervosa\n 3-Agressiva");
			opcao=teclado.nextInt();
			
			
			if(opcao==1)
			{
				calma++;
			}
			
			if(sexo==1 && opcao==2)
			{
				mulherNerv++;
			}
			
			
			if(sexo==2 && opcao==3)
			{
				homAgressivo++;
			}
			
			
			if(idade>40 && opcao==2)
			{
				nervQuarenta++;
			}
			
			if(opcao==1 && idade<18) 
			{
				camlaDezoito++;
			}
			resp++;
		}
		System.out.println("O número de pessoas calmas:  "+calma);
		System.out.println("O número de mulheres nervosas: "+mulherNerv);
		System.out.println("O número de homens agressivos: "+homAgressivo);
		System.out.println("O número de pessoas nervosas com mais de 40 anos: "+nervQuarenta);
		System.out.println("O número de pessoas calmas com menos de 18 anos: "+camlaDezoito);
		
		 
		
		 
	}

}
