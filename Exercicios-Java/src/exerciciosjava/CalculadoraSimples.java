package exerciciosjava;

import java.util.Scanner;

public class CalculadoraSimples {
	 
	public static void main(String[] args) {
		
		double n1 = 0, n2 = 0, result = 0;
		char op;
		boolean operadorValido = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha uma das opções para iniciar uma operação:");
		System.out.println();
		System.out.println("----CALCULADORA----");
		System.out.println();
		System.out.println("+ = ADIÇÃO");
		System.out.println("- = SUBTRAÇÃO");
		System.out.println("* = MULTIPLICAÇÃO");
		System.out.println("/ = DIVISÃO");
		op = sc.next().charAt(0);
		
		
		if(op == '+' || op == '-' || op == '*' || op == '/') {
		
		System.out.println("Digite o valor 1: ");
		n1 = sc.nextDouble();
		System.out.println("Digite o valor 2: ");
		n2 = sc.nextDouble();
		}else {
			System.out.println("Opção Inválida!!");
			operadorValido = false;
		}
		
		
		switch (op) {
		
		case '+': 
			
			result = n1 + n2;
			break;
			
		case '-':
			
			result = n1 - n2;
			break;
			
		case '*':
			
			result = n1 * n2;
			break;
			
		case '/':
			
			if(n2 == 0) {
				
				System.out.println("Erro! Denominador não pode ser igual a 0! Tente outro número");
				operadorValido = false;
			
			}else{
				
			result = n1 / n2;
		}
			break;
			
			
		}
		
		if(operadorValido) {
			System.out.println("O resultado da operação é: " + result);
		}
		
		sc.close();
	}

}
