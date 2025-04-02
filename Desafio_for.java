package Repetição_est;

import java.util.Scanner;

public class Desafio_for {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int fat=1, n;
	

		System.out.println("Informe o fatorial: ");
		n= ler.nextInt();
		
		for (int i = 1; i <= n; i++) {
			fat = fat * i;
			System.out.println("o fatorial é: " + fat);
		}

	}

}
