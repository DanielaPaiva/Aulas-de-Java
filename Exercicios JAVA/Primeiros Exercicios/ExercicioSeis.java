/*Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
escreva a distância entre eles. A fórmula que efetua tal cálculo é: */
package calculo;

import java.util.Scanner;

public class ExercicioSeis {
	public static void main(String [] args) {
		
		double x1,x2,y1,y2,potx,poty,d;
		
		Scanner teclado = new Scanner(System.in);
			System.out.println("Digite o valor de x1: ");
			x1=teclado.nextDouble();
			System.out.println("Digite o valor de x2: ");
			x2=teclado.nextDouble();
			System.out.println("Digite o valor de y1: ");
			y1=teclado.nextDouble();
			System.out.println("Digite o valor de y2: ");
			y2=teclado.nextDouble();
		
		
		potx= Math.pow((x2-x1),2);
		poty=Math.pow((y2-y1),2);
		
		d=Math.sqrt(potx+poty);
		
		System.out.println("O resultado é de: "+d);
		
	}

}
