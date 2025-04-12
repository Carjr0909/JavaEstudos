package L1;
/*
Faça um fluxograma e um programa utilizando a linguagem Java que imprima a média aritmética
de duas notas. Obs. Utilize o tipo de variável real.

Data: 05/04/25
Programador: Carlos
Professora: Luciana
*/


import java.util.Scanner;

public class L1ex1 {
    public static void main(String[] args) {
        //Instacionando e criando um objeto do tipo scanner
        Scanner ler = new Scanner(System.in);

        //declarando variaveis
        int num1;
        int num2;
        int result;

        //entrada de dados
        System.out.println("Digite um número: ");
        num1 = ler.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = ler.nextInt();

        //processamento de dados
        result = (num1 + num2) / 2;

        //saida de dados
        System.out.println("A média aritimetica entre " + num1 + " e " + num2 + " é " + result);
    }
}