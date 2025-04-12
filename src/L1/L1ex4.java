package L1;
/*
Faça um fluxograma e um programa utilizando a linguagem Java que leia um número real e
imprima 1⁄4 deste número.

Data: 05/04/25
Programador: Carlos
Professora: Luciana
*/
import java.util.Scanner;

public class L1ex4 {
    public static void main(String[] args){
        //Instacionando e criando um objeto do tipo scanner
        Scanner ler = new Scanner (System.in);

        //declarando variaveis
        int num;
        int resp;
        num = 0;

        //entrada de dados
        System.out.println("Digite um número: ");
        num = ler.nextInt();

        //processamento de dados e saida
        System.out.println("1/4 de  " + num + " É igual a: " + (num / 4));


    }
}
