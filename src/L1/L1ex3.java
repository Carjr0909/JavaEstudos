package L1;
/*
Faça um fluxograma e um programa utilizando a linguagem Java que leia um número inteiro e
imprima o seu antecessor e o seu sucessor.

Data: 05/04/25
Programador: Carlos
Professora: Luciana
*/

import java.util.Scanner;

public class L1ex3 {
    public static void main(String[] args){
        //Instacionando e criando um objeto do tipo scanner
        Scanner ler = new Scanner (System.in);

        //declarando variaveis

        int num;
        int ant;
        int suc;

        //entrada de dados

        System.out.println("Digite um número: ");
        num = ler.nextInt();

        //processamento de dados
        ant = num - 1;
        suc = num + 1;

        //saida de dados
        System.out.println("O número antecessor de " + num + " é " + ant + " e o número sucessor é " + suc);
    }
}
