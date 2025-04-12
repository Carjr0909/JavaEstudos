package L2;

import java.util.Scanner;
import java.lang.Math;
/*

Escreva um programa que calcule a área (mm2) de um círculo a partir do raio (mm), utilizando a
fórmula Área = π × raio².

Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/
// Declaração da classe principal do programa
public class L2ex4 {
    // Método principal - ponto de entrada do programa
    public static void main(String[] args){

        // Cria um objeto Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);

        // Declara variáveis do tipo double para armazenar o raio e a área do círculo
        double raio, are;

        // Solicita ao usuário que digite o valor do raio do círculo
        System.out.println("Digite o raio: ");
        raio = ler.nextDouble(); // Lê o valor digitado e armazena na variável 'raio'

        // Calcula a área do círculo usando a fórmula: área = π * raio²
        are = Math.PI * Math.pow(raio, 2); // Math.pow(raio, 2) eleva o raio ao quadrado

        // Exibe o resultado da área na tela
        System.out.println("A area do círculo é: " + are);
    }
}

