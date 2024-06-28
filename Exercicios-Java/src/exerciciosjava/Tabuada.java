package exerciciosjava;

import java.util.Scanner;

public class Tabuada {

    //Solicite um número ao usuário e exiba sua tabuada
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,x;

        System.out.println("Digite um número para saber sua tabuada: ");
        x = sc.nextInt();
        
        //Laço de repetição para contar de 0 a 10 
        
        for(i = 0; i <= 10; i++) {
            System.out.println(x + " X " + i + " = " + (x * i));
        }

        sc.close();
    }
}
