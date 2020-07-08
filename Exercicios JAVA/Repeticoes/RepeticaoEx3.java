/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
package calculo;

import java.util.Scanner;

public class RepeticaoEx3 {
	public static void main(String [] args)
	{
		Scanner teclado=new Scanner(System.in);
		int idade=0,jovem=0, cinquenta=0;
		
		System.out.println("Para parar digite a idade -99");
		
		while(idade!=-99)
		{
			System.out.println("Digite sua idade: ");
			idade=teclado.nextInt();
			
			if(idade<=21) 
			{
				jovem++;
			}
			else if(idade>50)
			{
				cinquenta++;
			}
		
		}
		System.out.println("Total de pessoas com menos de 21 anos: "+jovem);
		System.out.println("Total de pessoas com mais de 50 anos: "+cinquenta);
		
		
		
		
		
		
	}

}
