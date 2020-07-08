/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto*/
package calculo;

import java.util.Scanner;

public class Condicional3 {
	public static void main(String [] args) {
		int idade;
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		idade=teclado.nextInt();
		if(idade>=10 && idade<=14)
			{
			System.out.println("Categoria: INFANTIL");
			}
		else if(idade>=15 && idade<=17)
			{
				System.out.println("Categoria: JUVENIL");
			}
		else if(idade>=18)
			{		
				System.out.println("Adulto");
			}
		else {
			System.out.println("Dado inválido!");
		}

}

}
