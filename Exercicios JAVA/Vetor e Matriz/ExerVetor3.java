/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
package calculo;

import java.util.Scanner;

public class ExerVetor3 {
	public static void main(String [] args) 
	{
		int num, cont=0;
		Scanner teclado=new Scanner(System.in);
		int[][] matriz= new int [3][3];
	 
	 for (int i=0;i<matriz.length;i++)
	 {
		 for (int j=0;j<matriz.length;j++)
		 {	//usuario entra com os números
			 System.out.println("Digite os números da matriz: ");
			 matriz[i][j]=teclado.nextInt();
			 
			 //Contagem dos números maiores que 10
			 if( matriz[i][j]>10)
			 {
				 cont++;
			 }
			 
		 }
	 }
	 for (int i=0;i<matriz.length;i++)
	 {
		 for (int j=0;j<matriz.length;j++)
		 {
			 System.out.print( matriz[i][j]+" ");
			
		 }
	 }
	
	 System.out.printf("\nA matriz possui %d números maiores que 10",cont);
	}
}
