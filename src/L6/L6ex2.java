package L6;

import java.util.Scanner;

public class L6ex2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int i = 0;

        System.out.println("Os números pares de 1 a 50");
        for(i = 0; i <= 51; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        i = 51;
        System.out.println("Os números ímapres de 51 a 100");
        for(i = 51; i <= 100; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
