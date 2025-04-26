package Exemplos;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int tt = 0;
        for(int i = 0; i <= 100; i++){
            if(i%5 == 0){
                tt += i;
            }

        }

        System.out.println("A soma desses números é: " + tt);
    }
}
