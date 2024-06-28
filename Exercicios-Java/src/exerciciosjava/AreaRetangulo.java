package exerciciosjava;

import java.util.Scanner;

public class AreaRetangulo {
    
     //Dado o tamanho da base e da altura de um retângulo, calcular a sua área e o seu perímetro.
     
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double baseRatangulo,alturaRetangulo;
        double areaRetangulo, perimetroRetangulo;

        System.out.println("Digite o valor da base do retângulo: ");
        baseRatangulo = sc.nextDouble();

        System.out.println("Digite o valor da altura do retângulo: ");
        alturaRetangulo = sc.nextDouble();

        areaRetangulo = baseRatangulo * alturaRetangulo;
        perimetroRetangulo = 2 * (baseRatangulo + alturaRetangulo );

        System.out.println("O valor da área do retângulo é: " + areaRetangulo);
        System.out.println("O valor do perímetro do retângulo é: " + perimetroRetangulo);


        sc.close();


    }
}
