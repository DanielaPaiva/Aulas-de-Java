/*4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: */
package calculo;

import java.util.Scanner;

public class ExercicioQuatro {
	public static void main (String [] args){
		Scanner teclado= new Scanner(System.in);
		int a,b,c;
		double r,s,d; 
		System.out.printf("Digite o valor de A: ");
		a=teclado.nextInt();
		System.out.printf("Digite o valor de B: ");
		b=teclado.nextInt();
		System.out.printf("Digite o valor de C: ");
		c=teclado.nextInt();
		r=Math.pow((a+b), 2);
		s=Math.pow((b+c), 2);
		d=(r+s)/2;
		System.out.printf("A express�o D=(R+S)/2 �:%2.0f ", d);
		
		
		
	}

}
