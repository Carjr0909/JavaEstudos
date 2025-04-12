package L1;
/*
Faça um fluxograma e um programa utilizando a linguagem Java que leia o lado do quadrado e
exiba o seu perímetro e a área.

Data: 05/04/25
Programador: Carlos
Professora: Luciana
*/
import java.util.Scanner;

public class L1ex6 {
    public static void main(String[] args){
        //Instacionando e criando um objeto do tipo scanner
        Scanner ler = new Scanner(System.in);

        //declarando variaveis
        int ld;
        int per;
        int are;

        //entrada de dados
        System.out.println("Digite o lado do quadrado: ");
        ld = ler.nextInt();

        //processamento de dados
        per = ld * 4;
        are = ld * ld;

        //saida de dados
        System.out.println("Perimetro: " + per + "\n" + "Área: " + are);

    }
}
