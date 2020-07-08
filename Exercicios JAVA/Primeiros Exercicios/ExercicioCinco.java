/* 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
 Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. */
package calculo;

import java.util.Scanner;

public class ExercicioCinco {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int nota1, nota2, nota3, soma;
		float media;
		System.out.printf("Digite a 1° nota: ");
		nota1 = teclado.nextInt();
		System.out.printf("Digite a 2° nota: ");
		nota2 = teclado.nextInt();
		System.out.printf("Digite a 3° nota: ");
		nota3 = teclado.nextInt();
		soma = nota1 + nota2 + nota3;
		media = soma / 3;
		System.out.printf("A media das notas foi de: %f", media);
	}
}
