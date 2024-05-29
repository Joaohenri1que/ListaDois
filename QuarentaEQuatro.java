package Main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Insira um número");
		double a = ref.nextDouble();
		
		System.out.println("Insira outro número");
		double b = ref.nextDouble();
		
		System.out.println("Insira o terceiro número");
		double c = ref.nextDouble();
			
		if((a > b) && (b > c)){
			System.out.println("o numero" + a + " é maior que " + b + " e o " + b + " é maior que" + c );
			
		}
	}
}
