package Exercicios;

import java.util.Scanner;

public class Ex4 {
    public static void main(String [] args) {
        Scanner ler = new Scanner(System.in);

        double[] valor = new double[11];
        double soma;

        System.out.println("============================");
        System.out.println("*** Digite números ***");
        System.out.println("============================");

        for (int i = 1; i <= 10; i++) {

            System.out.print("Digite o valor do " + i + "° número: \n --> ");
            valor[i] = ler.nextDouble();

            soma = soma += valor[i];

            ler.nextLine();
        }
    }
}
