package Exercicios;

import java.util.Scanner;

public class Ex1 {
    public static void limpa(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


    }

    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        String[] nomes = new String[11];
        double[] valor = new double[11];
        int pr, soma = 0;
        double total = 0;
        String fr = "ola";

        System.out.println("============================");
        System.out.println("*** Cadastro de Produtos ***");
        System.out.println("============================");

        System.out.print("Digite a quantidade de produtos: \n--> ");
        pr = ler.nextInt();
        ler.nextLine();

        for(int i = 1; i <= pr; i++) {
            System.out.print("Digite o nome do " + i + "° produto: \n--> ");
            nomes[i] = ler.nextLine();
            System.out.print("Digite o valor do " + i +  "° produto: \n --> ");
            valor[i] = ler.nextDouble();

            soma = soma += valor[i];

            ler.nextLine();
        }
        limpa();

        System.out.println("==========================");
        System.out.println("*** Forma de pagamento ***");
        System.out.println("==========================");
        System.out.println("1 - À Vista em Dinheiro ou Pix, 8% de desconto.");
        System.out.println("2 - À Vista no cartão de crédito, 3% de desconto.");
        System.out.println("3 - Parcelado no cartão em duas vezes, sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou até 10 vezes, preço normal do produto " + "mais parcelas 10% de juros.");
        System.out.print("Digite a forma de pagamento: \n--> ");
        int esc = ler.nextInt();


        switch (esc) {
            case 1:
                fr = "À Vista em Dinheiro ou Pix, 8% de desconto";
                total = soma * 0.92;
                break;
            case 2:
                fr = "À Vista no cartão de crédito, 3% de desconto";
                total = soma * 0.97;
                break;
            case 3:
                fr = "Parcelado no cartão de até 10 vezes, sem juros";
                total = soma;
                break;
            case 4:
                fr = "Parcelado no cartão em mais de 10 parcelas, 10% de juros";
                total = soma * 1.10;
                break;
        }

        limpa();

        System.out.println("==========================");
        System.out.println("******* Finalizar ********");
        System.out.println("==========================");
        for (int f = 1; f <= pr; f++){
            System.out.println(f + "° " + nomes[f] + " - R$" + valor[f]);

        }
        System.out.println("\nValor total: " + total);

        System.out.println("\n" + fr);

        ler.nextLine();

        System.out.println("\nDeseja concluir? [s/n]");
        String cl = ler.nextLine();

        if(cl.equals("s")  || cl.equals("sim")){
            System.out.println("Obrigado volte sempre!");
        }
        else{
            System.out.println("Tudo bem, volte sempre");
        }


    }
}
