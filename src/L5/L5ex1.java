package L5;

import java.io.IOException;
import java.util.Scanner;

public class L5ex1 {

    public static void limparTela() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public static void main(String[] args) throws InterruptedException{
        Scanner ler = new Scanner(System.in);


        int esc;
        do {
            System.out.println("=============================");
            System.out.println("==== *** Calculadora *** ====");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.println("=============================");
            System.out.println("Escolha sua opção");
            esc = ler.next().charAt(0);
            limparTela();
            switch (esc) {
                case '1':
                    System.out.println("============================");
                    System.out.println("Digite um número");
                    double num1 = ler.nextDouble();
                    System.out.println("Digite outro número");
                    double num2 = ler.nextDouble();
                    System.out.println("O resultado dessa operação é: " + (num1 + num2));
                    System.out.println("============================");
                    Thread.sleep(3000);
                    limparTela();
                    break;
                case '2':
                    System.out.println("============================");
                    System.out.println("Digite um número");
                    double num3 = ler.nextDouble();
                    System.out.println("Digite outro número");
                    double num4 = ler.nextDouble();
                    System.out.println("O resultado dessa operação é: " + (num3 - num4));
                    System.out.println("============================");
                    Thread.sleep(3000);
                    limparTela();
                    break;
                case '3':
                    System.out.println("============================");
                    System.out.println("Digite um número");
                    double num5 = ler.nextDouble();
                    System.out.println("Digite outro número");
                    double num6 = ler.nextDouble();
                    System.out.println("O resultado dessa operação é: " + (num5 * num6));
                    System.out.println("============================");
                    Thread.sleep(3000);
                    limparTela();
                    break;
                case '4':
                    System.out.println("============================");
                    System.out.println("Digite um número");
                    double num7 = ler.nextDouble();
                    System.out.println("Digite outro número");
                    double num8 = ler.nextDouble();
                    if (num7 == 0 || num8 == 0) {
                        System.out.println("Não é possivel dividir por 0");
                    } else {
                        System.out.println("O resultado dessa operação é: " + (num7 / num8));
                    }
                    System.out.println("============================");
                    Thread.sleep(3000);
                    limparTela();
                    break;
            }
        }while(esc == 5);

        System.out.println("Saindo.");
        Thread.sleep(1000);
        limparTela();        System.out.println("Saindo..");
        Thread.sleep(1000);
        limparTela();        System.out.println("Saindo...");
        Thread.sleep(1000);
    }
}
