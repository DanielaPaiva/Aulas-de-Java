/* O custo ao consumidor de um carro novo � a soma do custo de 
f�brica com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.*/
package calculo;

import java.util.Scanner;

public class ExercicioOito {
	public static void main(String [] args) {
		
		double custoFab,pcDoDist,pcDoImp,custoConsumidor;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escreva o custo de f�brica:");
		custoFab=teclado.nextDouble();
		
		pcDoDist=(custoFab*28)/100;
		pcDoImp=(custoFab*45)/100;
		
		custoConsumidor=custoFab+pcDoDist+pcDoImp;
		
		System.out.println("O custo para o consumidoe � de: "+custoConsumidor);
		
		
	}

}
