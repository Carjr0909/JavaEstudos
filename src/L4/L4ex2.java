package L4;

import java.util.Scanner;

/*
Crie um programa que leia três números e verifique se a soma deles é positiva, negativa ou igual
a zero.

Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/
public class L4ex2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        double num1, num2, num3, resp;

        System.out.println("Digite o primeiro número: ");
        num1 = ler.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = ler.nextDouble();
        System.out.println("Digite o terceiro número: ");
        num3 = ler.nextDouble();

        resp = num1 + num2 + num3;

        if (resp > 0){
            System.out.println("A Soma é positiva");
        }
        else if (resp < 0){
            System.out.println("A soma é negativa");
        }
        else{
            System.out.println("A soma é igual a zero");
        }
    }
}
