package Exemplos;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int num;

        System.out.println("Digite um número: ");
        num = ler.nextInt();

        if(num > 100)
            System.out.println("O número " + num + " é maior que 100");
        else if(num == 100)
            System.out.println("O número " + num + " é igual que 100");
        else
            System.out.println("O número " + num + " é menor que 100");


    }


}
