package L2;

import java.util.Scanner;
import java.lang.Math;
/*

Crie um programa que calcule e exiba o perímetro (cm) de um círculo, solicitando o raio (cm) ao
usuário. Utilizar a fórmula Perímetro = 2 × π × raio.

Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/
// Declaração da classe principal do programa
public class L2ex3 {
    // Método principal - ponto de entrada da execução do programa
    public static void main(String[] args){

        // Cria um objeto Scanner para ler dados do teclado
        Scanner ler = new Scanner(System.in);

        // Declara as variáveis do tipo double para armazenar o raio e o perímetro
        double raio, per;

        // Solicita ao usuário que digite o valor do raio do círculo
        System.out.println("Digite o raio: ");
        raio = ler.nextDouble(); // Lê o valor digitado e armazena em 'raio'

        // Calcula o perímetro do círculo usando a fórmula: perímetro = 2 * π * raio
        per = 2 * Math.PI * raio;

        // Exibe o resultado do perímetro na tela
        System.out.println("O perimetro do circulo é: " + per);
    }
}

