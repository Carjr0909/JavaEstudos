package Exemplos;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int tt = 0;
        for(int i = 0; i <= 5; i++){

            System.out.print("Digite um número: \n--> ");
            int id = ler.nextInt();

            tt = tt + id;

        }

        System.out.println("A soma desses números é: " + tt);
    }
}
