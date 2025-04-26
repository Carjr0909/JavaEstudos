package Exemplos;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int num = 0, sm = 0;

        while(num <= 10){
            sm += num;
            num++;
        }
        System.out.println("A soma dos números de 1 a 10 é: " + sm);
    }
}
