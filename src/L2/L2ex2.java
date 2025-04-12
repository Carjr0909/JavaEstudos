package L2;

import java.util.Scanner;
import java.lang.Math;
/*
Escreva um programa que calcule a média geométrica entre três números informados pelo
usuário. Utilize o tipo de dados double.
Fórmula da média geométrica: √num1 × num2 × num3 -> (num1 × num2 × num3)1/3

Função para calcular potências: Math.pow(num1 * num2 * num3, 1.0/3.0)
Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/
// Declaração da classe principal do programa
public class L2ex2 {
    // Método principal - onde o programa começa a ser executado
    public static void main(String[] args){

        // Cria um objeto Scanner para ler dados do teclado
        Scanner ler = new Scanner(System.in);

        // Declara variáveis do tipo double para armazenar os números e os cálculos intermediários
        double num1, num2, num3, pt1, pt2;

        // Solicita ao usuário que digite o primeiro número
        System.out.println("Digite o primeiro número: ");
        num1 = ler.nextDouble(); // Lê o número e armazena em 'num1'

        // Solicita ao usuário que digite o segundo número
        System.out.println("Digite o segundo número: ");
        num2 = ler.nextDouble(); // Lê o número e armazena em 'num2'

        // Solicita ao usuário que digite o terceiro número
        System.out.println("Digite o terceiro número: ");
        num3 = ler.nextDouble(); // Lê o número e armazena em 'num3'

        // Calcula o produto dos três números
        pt1 = (num1 * num2 * num3);

        // Calcula a raiz cúbica do produto, que representa a média geométrica
        pt2 = Math.cbrt(pt1);

        // Exibe o resultado da média geométrica na tela
        System.out.println("A média geométrica dos números digitados é: " + pt2);
    }
}

