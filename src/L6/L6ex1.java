package L6;

import java.util.Scanner;

public class L6ex1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int i = 1;

        System.out.println("Os números pares de 1 a 50");
        while(i <= 51){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        i = 51;
        System.out.println("Os números ímapres de 51 a 100");
        while(i <= 100){
            if(i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
