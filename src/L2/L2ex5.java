package L2;
/*
Faça um programa que receba uma temperatura em graus Celsius e a converta
para Fahrenheit.

Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/
// Importa a classe Scanner para permitir a leitura de dados pelo teclado
import java.util.Scanner;

// Declaração da classe principal do programa
public class L2ex5 {
    // Método principal - ponto de entrada do programa
    public static void main(String[] args){

        // Cria um objeto Scanner para ler dados do usuário
        Scanner ler = new Scanner(System.in);

        // Declara duas variáveis inteiras: 'c' para Celsius e 'f' para Fahrenheit
        int c, f;

        // Solicita ao usuário que digite a temperatura em graus Celsius
        System.out.println("Digite a temperatura em C°:");
        c = ler.nextInt(); // Lê o valor digitado e armazena em 'c'

        // Converte a temperatura de Celsius para Fahrenheit usando a fórmula: F = (C × 9/5) + 32
        f = (c * 9/5) + 32;

        // Exibe o resultado da conversão
        System.out.println("A temperatura em Fahrenheit: " + f);
    }
}
