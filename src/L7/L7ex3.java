package L7;

import java.util.Scanner;

public class L7ex3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        double num, t = 0, maior = 0;
        for(int i = 1; i <= 20; i++){
            System.out.print("Digite o " + i + "° número: \n--> ");
            num = ler.nextDouble();

            if (num > 10){
                maior++;
            }
        }

        System.out.println("O total de números maiores que 10 são: " + maior);

    }
}
