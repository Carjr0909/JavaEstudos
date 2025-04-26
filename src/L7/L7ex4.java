package L7;

import java.util.Scanner;

public class L7ex4 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        double num, t = 0, dentro = 0;
        for(int i = 1; i <= 10; i++){
            System.out.print("Digite o " + i + "° número: \n--> ");
            num = ler.nextDouble();

            if (num <= 100 && num >= 0){
                dentro++;
            }
        }

        System.out.println("A quantidade de números que estão dentro de 0 e 100 é: " + dentro);

    }
}
