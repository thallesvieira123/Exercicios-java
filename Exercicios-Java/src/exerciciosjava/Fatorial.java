package exerciciosjava;

import java.util.Scanner;

public class Fatorial {

    //Solicite um número ao usuário e calcule o seu fatorial
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x;
        
        int fatorial = 1;

        System.out.println("Digite um número para saber seu fatorial: ");
        x = sc.nextInt();
        
        //Armazena o valor original de x em y
        
        int y = x;
        
        /*Laço de repetição utilizado para calcular o fatorial sempre que x for maior ou igual a 1,
        e em seguida, decrementa o valor de x em 1.*/
        
        while (x >= 1) {

            fatorial *= x;
            x--;
  
        }

        System.out.println("O fatorial de " + y + " é: " + fatorial);



        sc.close();
    }
}
