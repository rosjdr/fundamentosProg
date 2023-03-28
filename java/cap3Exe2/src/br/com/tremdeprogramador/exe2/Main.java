package br.com.tremdeprogramador.exe2;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		int n1, n2, n3, mult;
		Scanner tec = new Scanner(System.in);
		
		n1 = tec.nextInt();
		n2 = tec.nextInt();
		n3 = tec.nextInt();
		mult = n1*n2*n3;
		System.out.println("Multiplicação = " + mult);
	}

}
