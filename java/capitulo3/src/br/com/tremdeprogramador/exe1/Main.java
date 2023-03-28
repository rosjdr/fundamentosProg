package br.com.tremdeprogramador.exe1;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		int n1, n2, n3, n4, soma;
		Scanner tec = new Scanner(System.in);
		n1 = tec.nextInt();
		n2 = tec.nextInt();
		n3 = tec.nextInt();
		n4 = tec.nextInt();
		soma = n1+n2+n3+n4;
		System.out.println("Soma = " + soma);
	}

}
