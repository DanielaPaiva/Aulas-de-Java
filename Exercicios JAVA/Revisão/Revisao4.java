/*Faça um programa em C que calcula e escreve a seguinte 
soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50*/
package calculo;

public class Revisao4 {
	public static void main(String [] args) 
	{
		double soma=0;
		int termo1=1, termo2=1;
		while(termo1<=99 && termo2<=50)
		{
			soma+=termo1/termo2;
			termo1+=2;
			termo2++;
		}
		System.out.println("O somatório é: "+soma);
	}
}