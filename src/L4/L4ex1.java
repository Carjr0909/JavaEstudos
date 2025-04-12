package L4;
/*
Faça um programa que leia três números, e informe se a soma deles é divisível por 5 ou não.

Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/
import java.util.Scanner;

public class L4ex1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int num1, num2, num3, resp;

        System.out.println("Digite o primeiro número: ");
        num1 = ler.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = ler.nextInt();
        System.out.println("Digite o segundo número: ");
        num3 = ler.nextInt();

        resp = num1 + num2 + num3;

        resp = resp % 5;

        if (resp == 0){
            System.out.println("A soma é divisível por 5");
        }
        else{
            System.out.println("Mensagem: A soma não é divisível por 5");
        }

    }
}
