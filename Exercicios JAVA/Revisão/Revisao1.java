/*Elabore um programa que calcule o que deve ser pago por um produto, considerando o pre�o normal de etiqueta e a escolha da condi��o de pagamento. 
Utilize os c�digos da tabela a seguir para ler qual a condi��o de pagamento escolhida e efetuar o c�lculo adequado. 
C�digo Condi��o de pagamento 
1 � vista em dinheiro ou cheque, recebe 20% de desconto 
2 � vista no cart�o de cr�dito, recebe 15% de desconto 
3 Em duas vezes, pre�o normal de etiqueta sem juros 
4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%*/
package calculo;

import java.util.Scanner;

public class Revisao1 {
	public static void main(String [] args) 
	{
		Scanner teclado= new Scanner(System.in);
		double etiqueta,cd1,cd2,cd3,cd4;
		int codigo;
		
		System.out.println("Digite o valor da etiqueta: ");
		etiqueta= teclado.nextDouble();
		System.out.println("Digite o c�digo correspondente a forma de pagamento: ");
		System.out.println("(1) � vista em dinheiro ou cheque\n(2) � vista no cart�o de cr�dito\n(3) Em duas vezes, pre�o normal de etiqueta sem juros\n(4) Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%\n");
		codigo=teclado.nextInt();
		
		switch(codigo) 
		{
		case 1:
			cd1=((etiqueta*20)/100);
			cd1=etiqueta-cd1;
			System.out.println("Valor final:"+cd1);
			break;
		case 2:
			cd2=((etiqueta*15)/100);
			cd2=etiqueta-cd2;
			System.out.println("Valor total: "+cd2);
			break;
		case 3:
			cd3= etiqueta/2;
			System.out.println("Valor total: "+cd3+"\nParcelado em: 2 vezes");
			break;
		case 4:
			cd4= ((etiqueta*10)/100);
			cd4=etiqueta+cd4;
			System.out.println("Valor total: "+cd4+"\nParcelado em: 3 vezes");
			
			break;
		default:
			System.out.println("C�digo invalido...");
		}
		
		
		
	}
	}


