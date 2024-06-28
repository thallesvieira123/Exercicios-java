package exerciciosjava;

import java.util.Scanner;

public class Sucessor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
           
        int n,sucessor = 0; 

        System.out.println("Digite um número para saber seu sucessor: ");
        n = sc.nextInt();

        for(int i = 0; i <= n; i++) {

            sucessor = sucessor + 1;

        }

        System.out.println(sucessor);





        sc.close();
    }
}
