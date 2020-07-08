/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. */
package calculo;

import java.util.Scanner;

public class ExercicioUm {
	public static void main(String [] args) {
		Scanner teclado= new Scanner(System.in);
		int anos,meses,dias, tot;
		
		System.out.printf("Digite anos: ");
		anos=teclado.nextInt();
		System.out.printf("Digite meses: ");
		meses=teclado.nextInt();
		System.out.printf("Digite dias: ");
		dias=teclado.nextInt();
		tot=anos*365+meses*30+dias;
		System.out.format("\n Tenho %d anos de vida!", tot);
	}

}
