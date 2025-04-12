package Exemplos;/*
Eemplo 1 - Somar dois números

Desenvolva um programa que faça a soma de dois números
e msotre seu total.
 */

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        //Instacionando e criando um objeto do tipo scanner
        Scanner ler = new Scanner(System.in);

        //Declarator as variáveis
        int num1;
        int num2;
        int resultado;

        //Entrada de dados
        System.out.println("Digite o primeiro número: ");
        num1 = ler.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = ler.nextInt();

        resultado = num1 + num2;

        System.out.println("O resultado da soma é: " + resultado);
    }
}
