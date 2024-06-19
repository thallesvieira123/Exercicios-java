package exerciciosjava;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		//Um número é primo quando é divísivel por 1 e por ele mesmo
		
		Scanner sc = new Scanner(System.in);
		boolean ePrimo = true;
		
		System.out.println("Digite um número: ");
		int x = sc.nextInt();
		
		for(int i = 2; i < x; i++) {
			if(x % i == 0) {
				ePrimo = false;
			}
		}
		
		if(ePrimo) {
			System.out.println("É primo!");
		}else {
			System.out.println("Não é primo!");
		}
			
		
		

		
		sc.close();
		
	}

	
}
