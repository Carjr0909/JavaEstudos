package L2;
/*
Escreva um programa que solicite ao usuário dois números e exiba a soma, subtração,
multiplicação e divisão entre eles. Utilize o tipo de dados double.

Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/
// Importa a classe Scanner do pacote java.util para permitir a leitura de dados do usuário
import java.util.Scanner;

// Declaração da classe principal
public class L2ex1 {

    // Método principal - ponto de entrada do programa
    public static void main(String[] args){

        // Cria um objeto Scanner chamado 'ler' para ler a entrada do usuário pelo teclado
        Scanner ler = new Scanner(System.in);

        // Declara duas variáveis do tipo double para armazenar os números digitados pelo usuário
        double num1, num2;

        // Solicita ao usuário que digite o primeiro número
        System.out.println("Digite um número: ");
        num1 = ler.nextDouble(); // Lê o número digitado e armazena em 'num1'

        // Solicita ao usuário que digite o segundo número
        System.out.println("Digite outro número: ");
        num2 = ler.nextDouble(); // Lê o segundo número e armazena em 'num2'

        // Exibe o resultado das quatro operações básicas: soma, subtração, multiplicação e divisão
        System.out.println(
                "A Soma entre eles é: " + (num1 + num2) +
                "\nA Subtração entre eles é: " + (num1 - num2) +
                "\nA multiplicação entre eles é: " + (num1 * num2) +
                "\nA divisão entre eles é: " + (num1 / num2)
        );
    }
}
