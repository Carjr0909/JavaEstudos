package Exemplos;

import java.util.Scanner;

    public class ex8 {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            for(int i = 0; i <= 5; i++){

                System.out.printf("\nDigite seu nome: \n--> ");
                String nome = ler.nextLine();

                System.out.printf("Digite sua idade: \n--> ");
                int id = ler.nextInt();

                System.out.println("Seu nome é " + nome + " e sua idade é " + id);

                ler.nextLine();
            }

        }
}
