/*Faça um programa que leia um vetor de 5 posições para números reais e, depois, um código inteiro.
Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; 
se for 2, mostre o vetor na ordem inversa. Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.*/
package calculo;

import java.util.Scanner;

public class Revisao5 {
	public static void main(String [] args) 
	{	
		int cd;
		double vetor[]=new double[5];
		Scanner teclado= new Scanner(System.in);
		
		for(int x=0;x<5;x++) 
		{
			System.out.println("Digite os valores:");
			vetor[x]=teclado.nextDouble();
		}
		
		System.out.println("Digite o codigo: ");
		cd=teclado.nextInt();
		
		if(cd==0)
		{
			System.out.println("Programa finalizado!!");	
		}
		
		else if(cd==1)
		{
			for(int x=0;x<5;x++) 
			{
				System.out.print("\nOs números digitados foram:   "+vetor[x]);
			}
			
		}
		else if(cd==2)
		{
			for(int x=4;x>=0;x--) 
			{
				System.out.print("Os números digitados na ordem inversa: "+vetor[x]+" \n");
			}
			
		}
		else
		{
			System.out.println("Codigo invalido...");
		}
		
	}
}
