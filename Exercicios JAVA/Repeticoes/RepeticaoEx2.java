/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
package calculo;

import java.util.Scanner;

public class RepeticaoEx2 {
	public static void main(String [] args) 
	{
		Scanner teclado=new Scanner(System.in);
		int num,x, somapar=0,somaimpar=0;
		
		for(x=1;x<=10;x++) 
		{
			System.out.println("Digite o "+ x + "� n�mero: ");
			num=teclado.nextInt();
			if(num%2==0) 
			{
				somapar++;
			}
			else 
			{
				somaimpar++;
			}
			
		}
		System.out.printf("Dos n�meros digitados, %d s�o n�meros pares e %d s�o n�meros �mpares! ", somapar,somaimpar);
		
		
		
		
		
	}

}
