/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.*/
package calculo;

import java.util.Scanner;

public class ExerVetor4 {
	public static void main(String [] args)
	{
		Scanner teclado=new Scanner(System.in);
		int matriz1[][]=new int[2][2];
		int matriz2[][]=new int[2][2];
		int soma[][]=new int[2][2];
		int subtracao[][]=new int[2][2];
		int opcao, i,j=0, constnum;
		
		
		
		
		System.out.println("\n PRIMEIRA MATRIZ\n");
		for ( i=0;i<matriz1.length;i++)
		 {
			 for ( j=0;j<matriz1.length;j++)
			 {	//usuario entra com os números da matrz 1
				 System.out.println("Digite os números da matriz: ");
				 matriz1[i][j]=teclado.nextInt();
			 }
		 }
		System.out.println("\n SEGUNDA MATRIZ\n");
		
		for ( i=0;i<matriz2.length;i++)
		 {
			 for ( j=0;j<matriz2.length;j++)
			 {	//usuario entra com os números da matriz 2
				 System.out.println("Digite os números da matriz: ");
				 matriz2[i][j]=teclado.nextInt();
			 }
		 }
		//usuario escolhe uma das opçoes
		System.out.println("\nSelecione umas das opções abaixo: \n"
				+ "\n(1) Somar as duas matrizes\n "
				+ "\n(2) subtrair a primeira matriz da segunda\n "
				+ "\n(3) adicionar uma constante as duas matrizes\n"
				+ "\n(4) imprimir as matrizes \n");
		opcao=teclado.nextInt();
		
		switch(opcao)
		{
		case 1:
			for ( i=0;i<2;i++)
			 {
				 for ( j=0;j<2;j++)
				 {	
					 soma[i][j]=matriz1[i][j]+matriz2[i][j];
					 System.out.print(soma[i][j]+ " ");
				 }
				 
					
			 }
			
			
			break;
		case 2:
			for ( i=0;i<2;i++)
			 {
				 for ( j=0;j<2;j++)
				 {
					 subtracao[i][j]=matriz1[i][j]-matriz2[i][j];
					
					 System.out.print(subtracao[i][j]+ " ");
				 }
			 }
			break;
		case 3:
			System.out.println("Digite o valor da constante:");
			constnum=teclado.nextInt();
			for ( i=0;i<2;i++)
			 {
				 for ( j=0;j<2;j++)
				 {	
					matriz1[i][j]+=constnum;
					matriz2[i][j]+=constnum;
						System.out.print( "\nMATRIZ 1: "+matriz1[i][j]);
						System.out.print( "\nMATRIZ 2: "+matriz2[i][j]);
				 }
			 }
			
			break;
		case 4:
			for ( i=0;i<2;i++)
			 {
				 for ( j=0;j<2;j++)
				 {	
					 System.out.print("\nMATRIZ 1\n"+matriz1[i][j]+" ");
					 System.out.print("\nMATRIZ 2\n"+matriz2[i][j]+" ");
				 }
			 }
			
			break;
		}
		
				
	}

}
