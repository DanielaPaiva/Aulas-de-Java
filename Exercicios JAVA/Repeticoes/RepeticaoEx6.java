/*Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3. 
Para sair digitar 0(zero).(DO...WHILE)*/
package calculo;

import java.util.Scanner;

public class RepeticaoEx6 {
	public static void main(String [] args)
	{
		Scanner teclado=new Scanner(System.in);
		int num, soma=0,cont=0;
		double media=0;
		
		
		System.out.println("Para sair digite 0 (ZERO)");
		do
		{
			
			System.out.println("Digite um número: ");
			num=teclado.nextInt();
			
			if (num%3==0) 
			{
				soma=soma+num;
				cont++;
				
			}
			
			
		
			
		}
		while(num!=0);
		media=soma/cont;
		System.out.println("A média dos números múltiplos de 3"+media);
	}

}
