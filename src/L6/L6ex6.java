package L6;

import java.util.Scanner;

public class L6ex6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int t = 0, i = 1;
        while (i <= 100){
            if(i % 2 == 0){
                t = t + i;
            }
            i++;
        }

        System.out.println("A soma dos números pares é: " + t);
    }
}
