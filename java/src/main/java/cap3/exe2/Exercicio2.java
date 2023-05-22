package cap3.exe2;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 
 * @author rodrigo
 * Faça um programa que receba três números, calcule e mostre a multiplicação desses números. 
 */
public class Exercicio2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("INFORME O PRIMEIRO NÚMERO: ");
		BigDecimal n1 = new BigDecimal(sc.nextDouble());
		System.out.print("INFORME O SEGUNDO NÚMERO: ");
		BigDecimal n2 = new BigDecimal(sc.nextDouble());
		System.out.print("INFORME O TERCEIRO NÚMERO: ");
		BigDecimal n3 = new BigDecimal(sc.nextDouble());
		
		BigDecimal multiplicacao = n1.multiply(n2).multiply(n3);
		System.out.println("MULTIPLICAÇÃO = " + multiplicacao);
	}
}
