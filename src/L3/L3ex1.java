package L3;
/*
Faça um programa que leia dois números e informe qual é o maior.

Data: 05/04/25
Programador: Carlos
Professora: Luciana
*/
import java.util.Scanner;
public class L3ex1 {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner ler = new Scanner(System.in);

        // Declaração das variáveis que irão armazenar os números
        double num1, num2;

        // Solicita ao usuário que digite o primeiro número
        System.out.println("Digite um número: ");
        num1 = ler.nextDouble();  // Lê o primeiro número e armazena na variável num1

        // Solicita ao usuário que digite o segundo número
        System.out.println("Digite o segundo número: ");
        num2 = ler.nextDouble();  // Lê o segundo número e armazena na variável num2

        // Compara os dois números e imprime qual é o maior ou se são iguais
        if (num1 > num2) {
            // Se num1 for maior que num2, imprime que num1 é o maior
            System.out.println("O número " + num1 + " é o maior!");
        } else if (num1 < num2) {
            // Se num1 for menor que num2, imprime que num2 é o maior
            System.out.println("O número " + num2 + " é o maior!");
        } else {
            // Se num1 for igual a num2, imprime que os dois números são iguais
            System.out.println("Os dois números são iguais!");
        }
    }
}
