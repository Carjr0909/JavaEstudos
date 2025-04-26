package L6;

import java.util.Scanner;

public class L6ex3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int tb = ler.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(tb + " X " + i + " = " + (tb*i));
        }
    }
}
