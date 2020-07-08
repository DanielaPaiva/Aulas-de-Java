/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. */
package calculo;

import java.util.Scanner;

public class ExercicioDois {
	public static void main(String [] args) {
		Scanner teclado= new Scanner(System.in);
		int dias, meses, anos, totdias;
		
		System.out.printf("Digite sua idade em dias: ");
		 totdias=teclado.nextInt();
		 anos=totdias/365;
		 meses=(totdias%365)/30;
		 dias=(totdias%365)%30;
		 System.out.format("\nTenho %d anos",anos);
		 System.out.format("\nTenho %d meses",meses);
		 System.out.format("\nTenho %d dias",dias);
				
		
	}
	

}
