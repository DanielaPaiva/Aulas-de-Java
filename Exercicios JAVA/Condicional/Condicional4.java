/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
 Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/
package calculo;

import java.util.Scanner;

public class Condicional4 {
	public static void main(String [] args) {
		
		int n1;
		double raiz, elevado;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero: ");
		n1=teclado.nextInt();
		
		if(n1%2==0)
		{	raiz=Math.sqrt(n1);
			System.out.println("� par!");
			System.out.println("Sua raiz �:"+raiz);
		}
		else 
		{	elevado= Math.pow(n1, 2);
			System.out.println("� �mpar!");
			System.out.println("Elevado ao quadrado �: "+elevado);
		}
	}

}
