package exerciciosjava;

import java.util.Scanner;

public class SomaDoisNumeros {

    //Solicite dois números ao usuário e calcule a soma dos dois número
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.println("Digite o valor 1: ");
        n1 = sc.nextInt();
        
        System.out.println("Digite o valor 2: ");
        n2 = sc.nextInt();

        System.out.println("A soma entre " + n1 + " e " + n2 + " é: " + (n1 + n2));

        sc.close();
    }
}
