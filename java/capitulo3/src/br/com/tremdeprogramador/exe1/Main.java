package br.com.tremdeprogramador.exe1;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		int n1, n2, resultado;
		Scanner tec = new Scanner(System.in);
		
		n1 = tec.nextInt();
		n2 = tec.nextInt();
		resultado = n1-n2;
		System.out.println("Subtração = " + resultado);
	}

}
