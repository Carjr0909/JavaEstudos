package L4;
/*
Faça um programa que leia três números, e mostre eles na tela em ordem crescente.

Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/
import java.util.Scanner;

public class L4ex3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Digite o priemiro número: ");
        n1 = ler.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = ler.nextInt();
        System.out.println("Digite o terceiro número: ");
        n3 = ler.nextInt();

        if(n1 >= n2 && n1 >= n3){
            if(n2 >= n3){
                System.out.println(n3 + " " + n2 + " " + n1);
            }
            else{
                System.out.println(n2 + " " + n3 + " " + n1);
            }
        }
        else if(n2 >= n1 && n2 >= n3){
            if(n1 >= n3){
                System.out.println(n3 + " " + n1 + " " + n2);
            }
            else{
                System.out.println(n1 + " " + n3 + " " + n2);
            }
        }
        else{
            if(n2 >= n1){
                System.out.println(n1 + " " + n2 + " " + n3);
            }
            else{
                System.out.println(n2 + " " + n1 + " " + n3);
            }
        }

    }
}
