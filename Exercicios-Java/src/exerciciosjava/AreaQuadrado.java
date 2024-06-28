package exerciciosjava;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double ladoQuadrado, areaQuadrado, perimetroQuadrado;

        System.out.println("Digite o valor do lado do quadrado em metros: ");
        ladoQuadrado = sc.nextDouble();

        areaQuadrado = 2 * (ladoQuadrado);
        perimetroQuadrado = ladoQuadrado * 4;

        System.out.println("O valor da área do quadrado em metros é: " + areaQuadrado + " m\u00B2");
        System.out.println("O valor do perímetro do quadrado em metros é: " + perimetroQuadrado + " m\u00B2");



        sc.close();
    }
}
