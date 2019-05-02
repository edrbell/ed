package org.institutoserpis.ed;
import java.util.Scanner;

public class Suma {
	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner lec = new Scanner(System.in);
		System.out.print("Di el primer número a sumar: ");
		a = lec.nextInt();
		System.out.print("Di el segundo número a sumar: ");
		b = lec.nextInt();
		System.out.println("-------------------------------");
		int suma = a + b;
		System.out.println(a + " + " + b + " = " + suma);
	}
}
