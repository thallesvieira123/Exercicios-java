package exerciciosjava;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite um número: ");
        x = sc.nextInt();
        
        //Verifica se o número é par ou ímpar utilizando o operador ternário
        
        String eParouImpar = x % 2 == 0 ? (x + " é par! ") : (x + " é ímpar!" );

        System.out.println(eParouImpar);

        sc.close();
    }
}
