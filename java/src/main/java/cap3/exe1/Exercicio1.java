package cap3.exe1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args[]) {
		int n1, n2, resultado;
		Scanner tec = new Scanner(System.in);
		
		n1 = tec.nextInt();
		n2 = tec.nextInt();
		resultado = n1-n2;
		System.out.println("Subtração = " + resultado);
	}
}
