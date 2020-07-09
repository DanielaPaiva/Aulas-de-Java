/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/
package calculo;

import java.util.Scanner;

public class ExerVetor2 {
	public static void main(String [] args) 
	{
		Scanner teclado=new Scanner(System.in);
		int num,somapar=0, contpar=0, impar=0 ;
		int n[]=new int[5];
		for(int x=0;x<=n.length;x++)
		{
			System.out.println("Digite o "+ (x+1)+ "° número: ");
			num=teclado.nextInt();
				if(num%2==0) 
				{
					somapar+=num;
					contpar++;
					
				}
				else 
				{
					 int nimpar[]=new int[num];
					impar++;
					
				}
				
		}
		System.out.println("Os números pares digitados foram: "+contpar);
		//System.out.println("Os números ímpares digitados foram: "+nimpar);
		System.out.println("A soma dos números pares digitados: "+somapar);
		System.out.println("A quantidade de números impares digitados: "+impar);
		
		
	}

}
