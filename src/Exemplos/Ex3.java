package Exemplos;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int id;

        System.out.println("Digite sua idade: ");
        id = ler.nextInt();


        if(id >= 18)
            System.out.println("Você é maior de idade!");
        else
            System.out.println("Você é menor de idade!");

    }
}
