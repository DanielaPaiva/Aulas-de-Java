/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
package calculo;

import java.util.Scanner;

public class RepeticaoEx2 {
	public static void main(String [] args) 
	{
		Scanner teclado=new Scanner(System.in);
		int num,x, somapar=0,somaimpar=0;
		
		for(x=1;x<=10;x++) 
		{
			System.out.println("Digite o "+ x + "° número: ");
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
		System.out.printf("Dos números digitados, %d são números pares e %d são números ímpares! ", somapar,somaimpar);
		
		
		
		
		
	}

}
