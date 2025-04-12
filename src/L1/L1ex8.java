package L1;
/*
Crie um fluxograma e um programa que leia o valor do salário mínimo e o valor do salário de um
usuário, calcule a quantidade de salários mínimos que esse usuário ganha e imprima o
resultado. Obs. Salário mínimo: R$1.640,00.

Data: 05/04/25
Programador: Carlos
Professora: Luciana
*/
import java.util.Scanner;

public class L1ex8 {
    public static void main(String[] args) {
        // Instanciando e criando um objeto do tipo scanner
        Scanner ler = new Scanner(System.in);

        // Declarando variáveis
        double sal;
        double qntsal = 1640.0;
        double salm;

        // Entrada de dados
        System.out.println("Qual é o seu salário: ");
        sal = ler.nextDouble(); // Usando nextDouble() para capturar valores com decimais

        // Processamento de dados
        salm = sal / qntsal;

        // Saída de dados
        System.out.printf("O seu salário de %.2f é equivalente a %.2f salários mínimos.\n", sal, salm);

    }
}

