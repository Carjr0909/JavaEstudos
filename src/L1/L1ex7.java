package L1;
/*
Faça um fluxograma e um programa utilizando a linguagem Java que leia os lados do retângulo
e exiba o seu perímetro e a área.

Data: 05/04/25
Programador: Carlos
Professora: Luciana
*/
import java.util.Scanner;

public class L1ex7 {
    public static void main(String[] args) {
        //Instacionando e criando um objeto do tipo scanner
        Scanner ler = new Scanner(System.in);

        //declarando variaveis
        int ld1;
        int ld2;
        int per;
        int are;

        //entrada de dados
        System.out.println("Digite o maior lado do retângulo: ");
        ld1 = ler.nextInt();

        System.out.println("Digite o menor lado do retângulo: ");
        ld2 = ler.nextInt();

        //processamento de dados
        per = (ld1 * 2) + (ld2 * 2);
        are = ld1 * ld2;

        //saida de dados
        System.out.println("Perimetro: " + per + "\n" + "Área: " + are);
    }
}
