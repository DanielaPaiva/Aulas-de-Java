/*O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta.
A fórmula é IMC = peso / ( altura )2 
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
IMC em adultos Condição 
Abaixo de 18,5 Abaixo do peso 
Entre 18,5 e 25 Peso normal 
Entre 25 e 30 Acima do peso 
Acima de 30 obeso*/
package calculo;

import java.util.Scanner;

public class Revisao2 {
	public static void main(String [] args) 
	{
		double peso,altura,imc;
		Scanner teclado =new Scanner(System.in);
		
		
		System.out.println("Digite seu peso: ");
		peso=teclado.nextDouble();
		System.out.println("Digite sua altura: ");
		altura=teclado.nextDouble();
		
		imc=(peso/(altura*altura));
		System.out.println("Seu imc é de : "+imc);
		if(imc<=18.5)
		{
			System.out.println("Situação: ABAIXO DO PESO");
		}
		else if(imc>18.5 && imc<=25) 
		{
			System.out.println("Situação: PESO NORMAL");
		}
		else if(imc>25 && imc<=30) 
		{
			System.out.println("Situação: ACIMA DO PESO");
		}
		else
		{
			System.out.println("Situação: OBESO");
		}
			
		
			
			
	}
}

