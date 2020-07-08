/*Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. */
package calculo;

import java.util.Scanner;

public class ExercicioSete {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float a, b, c, d, e, f, x, y;

		System.out.printf("Digite o valor de A: ");
		a=teclado.nextFloat();
		System.out.printf("Digite o valor de B: ");
		b=teclado.nextFloat();
		System.out.printf("Digite o valor de C: ");
		c=teclado.nextFloat();
		System.out.printf("Digite o valor de D: ");
		d=teclado.nextFloat();
		System.out.printf("Digite o valor de E: ");
		e=teclado.nextFloat();
		System.out.printf("Digite o valor de F: ");
		f=teclado.nextFloat();
		x=((c*e)-(b*f))/((a*e)-(b*d));
		y=((a*f)-(c*d))/((a*e)-(b*d));
		System.out.printf("O valor de X é: %f \n",x );
		System.out.printf("O valor de Y é: %f \n",y);
		
		

	}

}
