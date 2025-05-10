package Exercicios;

import java.util.Scanner;
import java.io.IOException;

public class Ex2 {
    public static void limpa() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public static void main(String [] args) throws InterruptedException {
        Scanner ler = new Scanner(System.in);
        int esc;
        double saq = 0, dep = 0, depat, saqat;
        do {
            limpa();
            System.out.println("============================");
            System.out.println("****** Banco no Java ******");
            System.out.println("============================");
            System.out.println("1 - Depósito bancário");
            System.out.println("2 - Saque");
            System.out.println("3 - Saldo");
            System.out.println("4 - Sair");
            System.out.println("============================");
            System.out.print("Digite a opção desejada: \n--> ");
            esc = ler.nextInt();

            double saldo = dep - saq;

            switch (esc) {
                case 1:
                    limpa();
                    System.out.println("============================");
                    System.out.println("**** Deposito Bancario ****");
                    System.out.println("============================");
                    System.out.print("Digite o valor que deseja depositar: \n--> ");
                    depat = ler.nextDouble();
                    dep = dep + depat;
                    Thread.sleep(2000);
                    System.out.println("Processando.");
                    Thread.sleep(1000);
                    limpa();
                    System.out.println("Processando..");
                    Thread.sleep(1000);
                    limpa();
                    System.out.println("Processando...");
                    Thread.sleep(1000);
                    break;
                case 2:
                    limpa();
                    System.out.println("============================");
                    System.out.println("**** Sacar Dinheiro ****");
                    System.out.println("============================");
                    System.out.print("Digite o valor que deseja sacar: \n--> ");
                    saqat = ler.nextDouble();

                    if (saqat > saldo){
                        System.out.println("Saldo insulficiente");
                        Thread.sleep(3000);
                        break;
                    }
                    saq = saq + saqat;
                    Thread.sleep(2000);
                    System.out.println("Processando.");
                    Thread.sleep(1000);
                    limpa();
                    System.out.println("Processando..");
                    Thread.sleep(1000);
                    limpa();
                    System.out.println("Processando...");
                    Thread.sleep(1000);
                    break;
                case 3:
                    limpa();
                    Thread.sleep(2000);
                    System.out.println("Processando.");
                    Thread.sleep(1000);
                    limpa();
                    System.out.println("Processando..");
                    Thread.sleep(1000);
                    limpa();
                    System.out.println("Processando...");
                    Thread.sleep(1000);
                    System.out.println("============================");
                    System.out.println("**** Consultar saldo ****");
                    System.out.println("============================");
                    System.out.println("Seu saldo é de: " + saldo);

                    break;
            }
        } while (esc != 5);
    }
}
