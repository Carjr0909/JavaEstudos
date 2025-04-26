package L6;

import java.util.Scanner;

public class L6ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int t = 0;
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                t += i;
            }

        }

        System.out.println("A soma dos números pares é: " + t);
    }
}
