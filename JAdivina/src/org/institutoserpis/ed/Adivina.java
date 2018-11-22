package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int num = 0, lim1 = 1, lim2 = 1000;
		int aleatorio = random.nextInt(1000) + 1;
		System.out.printf("Introduce un número entre %s y %s: ", lim1, lim2);
		num = scan.nextInt();
		while (num != aleatorio) {
			if (num > aleatorio) {
				System.out.println("Número introducido mayor al número a adivinar");
				lim2 = num;			
			}
			else {
				System.out.println("Número introducido menor al número a adivinar");
				lim1 = num;			
			}
			System.out.printf("Introduce un número entre %s y %s: ", lim1, lim2);
			num = scan.nextInt();
		}
		System.out.println("¡Felicidades!");
	}

}
