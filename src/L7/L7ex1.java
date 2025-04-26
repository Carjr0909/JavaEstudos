package L7;

import java.util.Scanner;

public class L7ex1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int exp, bas, i = 1;

        System.out.println("Digite a base");
        bas = ler.nextInt();

        System.out.println("Digite o expoente");
        exp = ler.nextInt();

        int resp = bas;

        while(i < exp){
            resp = resp * bas;
            i++;
        }

        System.out.println(resp);
    }
}
