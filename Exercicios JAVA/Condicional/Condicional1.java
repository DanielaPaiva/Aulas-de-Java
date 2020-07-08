/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/
package calculo;

import java.util.Scanner;

public class Condicional1 {
	public static void main(String [] args) {
		Scanner teclado=new Scanner(System.in);
		int n1,n2,n3, maior=0;
		System.out.println("Digite o 1° número: ");
		n1=teclado.nextInt();
		System.out.println("Digite o 2° número: ");
		n2=teclado.nextInt();
		System.out.println("Digite o 3° número: ");
		n3=teclado.nextInt();
		if(n1>n2)
		{
			maior=n1;
		}
		else
		{
			maior=n2;
		}
		if(n3>maior)
		{
			maior=n3;
		}
		System.out.println("O maior número digotado foi o: "+maior);
	}

}
