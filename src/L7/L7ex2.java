package L7;

import java.util.Scanner;

public class L7ex2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        double id, t = 0;
        for(int i = 1; i <= 5; i++){
            System.out.print("Digite a idade da " + i + "° pessoa: \n--> ");
            id = ler.nextDouble();

            t = t + id;
        }

        System.out.println("A média entre as idades é: " + (t/5));

    }
}
