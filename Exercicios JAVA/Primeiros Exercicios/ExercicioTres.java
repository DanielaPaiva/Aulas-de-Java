/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos 
e mostre-o expresso em horas, minutos e segundos. */
package calculo;

import java.util.Scanner;

public class ExercicioTres {
	public static void main(String[] args) {
		
		int segundos,x, minutos,horas;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite o tempo do evento da fábrica em segundos: ");
		x=teclado.nextInt();
		horas=x/3600;
		minutos=(x%3600)/60;
		segundos=(x%3600)/3600;
		System.out.println("Horas"+horas);
		System.out.println("Minutos"+minutos);
		System.out.println("Segundos"+ segundos);
		
		
	}
	

}
