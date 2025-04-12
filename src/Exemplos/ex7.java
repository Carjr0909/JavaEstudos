package Exemplos;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);


        System.out.println("Calculos");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("Escolha sua opção");
        char opcao = ler.next().charAt(0);

        switch(opcao){
            case '1':
                System.out.println("Digite um número");
                double num1 = ler.nextDouble();
                System.out.println("Digite outro número");
                double num2 = ler.nextDouble();
                System.out.println("O resultado dessa operação é: " + (num1 + num2));
                break;
            case '2':
                System.out.println("Digite um número");
                double num3 = ler.nextDouble();
                System.out.println("Digite outro número");
                double num4 = ler.nextDouble();
                System.out.println("O resultado dessa operação é: " + (num3 - num4));
                break;
            case '3':
                System.out.println("Digite um número");
                double num5 = ler.nextDouble();
                System.out.println("Digite outro número");
                double num6 = ler.nextDouble();
                System.out.println("O resultado dessa operação é: " + (num5 * num6));
                break;
            case '4':
                System.out.println("Digite um número");
                double num7 = ler.nextDouble();
                System.out.println("Digite outro número");
                double num8 = ler.nextDouble();
                if (num7 == 0 || num8 == 0){
                    System.out.println("Não é possivel dividir por 0");
                }
                else{
                    System.out.println("O resultado dessa operação é: " + (num7 / num8));
                }
                break;
        }


    }
}
