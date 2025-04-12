package L3;
/*
Faça um programa que leia um número e informe se ele é par ou ímpar.

Data: 05/04/25
Programador: Carlos
Professora: Luciana
*/
import java.util.Scanner;
public class L3ex2 {
    public static void main(String[] args){
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner ler = new Scanner(System.in);

        // Declaração das variáveis que irão armazenar o número digitado e o resultado da operação
        int num, d;
        double num1, d1;

        // Solicita ao usuário que digite um número
        System.out.println("Digite um número inteiro: ");
        num = ler.nextInt();  // Lê o número digitado e armazena na variável num

        // Solicita ao usuário que digite um número
        System.out.println("Digite um número decimal: ");
        num1 = ler.nextDouble();  // Lê o número digitado e armazena na variável num

        // Calcula o resto da divisão do número por 2 (verifica se é par ou ímpar)
        d = num % 2;
        d1 = num1 % 2;    // O operador % retorna o resto da divisão de num por 2

        // Verifica se o número é par (resto 0) ou ímpar (resto 1)
        if (d == 0) {
            // Se o resto da divisão for 0, o número é par
            System.out.println("O número inteiro é par!");
        }
        else {
            // Se o resto da divisão for diferente de 0, o número é ímpar
            System.out.println("O número inteiro é ímpar!");
        }

        if (d1 == 0){
            // Se o resto da divisão for 0, o número é par
            System.out.println("O número decimal é par!");
        }
        else{
            // Se o resto da divisão for diferente de 0, o número é ímpar
            System.out.println("O número decimal é impar!");
        }

    }
}