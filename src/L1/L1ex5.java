package L1;
/*
Faça um fluxograma e um programa utilizando a linguagem Java que leia um número inteiro e
imprima o triplo do seu valor.

Data: 05/04/25
Programador: Carlos
Professora: Luciana
*/
import java.util.Scanner;

public class L1ex5 {
    public static void main(String[] args){
        //Instacionando e criando um objeto do tipo scanner
        Scanner ler = new Scanner (System.in);

        //declarando variaveis
        int num;
        int resp;

        //entrada de dados
        System.out.println("Digite um número para eu triplicar o seu valor: ");
        num = ler.nextInt();

        //saida de dados
        System.out.println("O Resultado é: " + (num * 3));

    }
}
