/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.*/
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
			System.out.println("Digite o "+ (x+1)+ "� n�mero: ");
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
		System.out.println("Os n�meros pares digitados foram: "+contpar);
		//System.out.println("Os n�meros �mpares digitados foram: "+nimpar);
		System.out.println("A soma dos n�meros pares digitados: "+somapar);
		System.out.println("A quantidade de n�meros impares digitados: "+impar);
		
		
	}

}
