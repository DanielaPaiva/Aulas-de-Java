/*Escrever um programa que leia uma quantidade desconhecida de n�meros e conte quantos deles est�o 
nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando for lido um n�mero negativo.*/
package calculo;

import java.util.Scanner;

public class Revisao3 {
	public static void main(String [] args) 
	{	
		int num, int1=0, int2=0,int3=0, int4=0;
		Scanner teclado =new Scanner(System.in);
		System.out.println("O programa para assim que voc� digitar um N�MERO NEGATIVO!");
		System.out.println("---------------------------------------------------------");
		
		do
		 {
			 System.out.println("Digite um n�mero: ");
			 num=teclado.nextInt();
			 if(num>=0 && num<=25)
			 {
				 int1++;
				
			 }
			 else if(num>=26 && num<=50) 
			 {
				 int2++;
			 }
			 else if(num>=51 && num<=75) 
			 {
				 int3++;
			 }
			 else if(num>=76 && num<=100)
			 {
				 int4++;
			 }
			 else
			 {
				 System.out.println("N�mero inv�lido, digite de 0 a 100!");
			 }
		 }
		 while(num>=0);
		
		 System.out.printf("%d n�meros foram digitados e eles pertecem ao intervalo de [0-25]\n", int1);
		 System.out.printf("%d n�meros foram digitados e eles pertecem ao intervalo de [26-50]\n", int2);
		 System.out.printf("%d n�meros foram digitados e eles pertecem ao intervalo de [51-75]\n", int3);
		 System.out.printf("%d n�meros foram digitados e eles pertecem ao intervalo de [76-100]\n", int4);
		
	}
}
