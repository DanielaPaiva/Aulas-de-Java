/*Faça um programa que entre com três números e coloque em ordem crescente.*/
package calculo;

import java.util.Scanner;

public class Condicional2 {
	public static void main(String [] args) {
		Scanner teclado=new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.println("Digite o 1° número:");
		n1=teclado.nextInt();
		System.out.println("Digite o 2° número:");
		n2=teclado.nextInt();
		System.out.println("Digite o 3° número:");
		n3=teclado.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			if(n2>n3) {
				System.out.println(n3+" "+n2+" "+n1+" ");
			}
			else{
				System.out.println(n2+" "+n3+" "+n1+" ");
			}
		}
		else if(n2>n1 && n2>n3)
		{
			if(n1>n3)
			{
				System.out.println(n3+" "+n1+" "+n2+" ");
			}
				else
				{
					System.out.println(n1+" "+n3+" "+n2+" ");
				}
		}
		else
		{
			if(n1>n2)
			{
				System.out.println(n2+" "+n1+" "+n3+" ");
			}
			else if(n2>n1)
			{
				System.out.println(n1+" "+n2+" "+n3+" ");
			}
		}
	}
}
		
	

