package exerciciosjava;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x;
        int fatorial = 1;

        System.out.println("Digite um número para saber seu fatorial: ");
        x = sc.nextInt();

        while (x >= 1) {

            fatorial *= x;
            x--;
  
        }

        System.out.println("O fatorial de " + x + " é: " + fatorial);











        sc.close();
    }
}
