package L4;
/*
Faça um programa que leia três notas de um aluno e informe se ele foi aprovado (nota final
maior ou igual a 7), reprovado (nota final menor que 4) ou ficou de recuperação (nota final entre
4 e 7).

Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/
import java.util.Scanner;

public class L4ex4 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int num1, num2, num3, resp;

        System.out.println("Digite a primeira nota: ");
        num1 = ler.nextInt();
        System.out.println("Digite a segunda nota: ");
        num2 = ler.nextInt();
        System.out.println("Digite a terceira nota: ");
        num3 = ler.nextInt();

        resp = num1 + num2 + num3;

        resp = resp / 3;

        if (resp >= 7){
            System.out.println("Aprovado");
        }
        else if (resp < 4){
            System.out.println("Reprovado");
        }
        else{
            System.out.println("Recuperação");
        }

    }
}
