package L6;

import java.util.Scanner;

public class L6ex4 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int i = 1, tb;
        System.out.println("Digite um número: ");
        tb = ler.nextInt();

        while(i <= 10){
            System.out.println(tb + " X " + i + " = " + (tb*i));
            i++;
        }
    }
}
