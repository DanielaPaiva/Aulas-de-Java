/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final,
 mostre a soma dos n�meros digitados.(DO...WHILE)*/
package calculo;

import java.util.Scanner;

public class RepeticaoEx5 {
	public static void main(String [] args) 
	{
		Scanner teclado=new Scanner(System.in);
		int num, soma=0;
		
		do 
		{
			System.out.println("Digite um n�mero: ");
			num=teclado.nextInt();
			soma+=num;
			
			
		}
		while(num!=0);
		System.out.println("A soma dos n�meros digitados foi de: "+soma);
	}
	

}
