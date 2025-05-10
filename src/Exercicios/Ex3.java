package Exercicios;

import java.util.Scanner;

public class Ex3 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        int[] idade = new int[6];
        String[] nome = new String[6];

        for(int i = 1; i <= 5; i++){
            System.out.print("Digite o nome da " + i + "° pessoa: \n--> ");
            nome[i] = ler.nextLine();
            System.out.print("Digite a idade da " + i + "° pessoa: \n--> ");
            idade[i] = ler.nextInt();
            ler.nextLine();
        }

        for(int f = 1; f <= 5; f++){
            if(idade[f] >= 18){
                System.out.println("A " + f + "° pessoa se chama " + nome[f] + " e tem " + idade[f] + " anos de idade");
            }
        }
    }
}
