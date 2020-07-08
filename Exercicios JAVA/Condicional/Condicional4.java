/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
 Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/
package calculo;

import java.util.Scanner;

public class Condicional4 {
	public static void main(String [] args) {
		
		int n1;
		double raiz, elevado;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Digite o 1° número: ");
		n1=teclado.nextInt();
		
		if(n1%2==0)
		{	raiz=Math.sqrt(n1);
			System.out.println("É par!");
			System.out.println("Sua raiz é:"+raiz);
		}
		else 
		{	elevado= Math.pow(n1, 2);
			System.out.println("É ímpar!");
			System.out.println("Elevado ao quadrado é: "+elevado);
		}
	}

}
