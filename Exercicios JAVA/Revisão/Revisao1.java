/*Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
Código Condição de pagamento 
1 À vista em dinheiro ou cheque, recebe 20% de desconto 
2 À vista no cartão de crédito, recebe 15% de desconto 
3 Em duas vezes, preço normal de etiqueta sem juros 
4 Em três vezes, preço normal de etiqueta mais juros de 10%*/
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
		System.out.println("Digite o código correspondente a forma de pagamento: ");
		System.out.println("(1) À vista em dinheiro ou cheque\n(2) À vista no cartão de crédito\n(3) Em duas vezes, preço normal de etiqueta sem juros\n(4) Em três vezes, preço normal de etiqueta mais juros de 10%\n");
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
			System.out.println("Código invalido...");
		}
		
		
		
	}
	}


