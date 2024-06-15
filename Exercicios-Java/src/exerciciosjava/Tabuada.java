package exerciciosjava;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,x;

        System.out.println("Digite um número para saber sua tabuada: ");
        x = sc.nextInt();

        for(i = 0; i <= 10; i++) {
            System.out.println(x + " X " + i + " = " + (x * i));
        }

        sc.close();
    }
}
