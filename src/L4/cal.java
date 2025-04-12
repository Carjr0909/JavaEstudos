package L4;
/*
Eemplo 1 - Somar dois números

Faça uma calculadora

05/04/25
Carlos
prof: Luciana
 */
import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        //Instacionando e criando um objeto do tipo scanner
        Scanner ler = new Scanner(System.in);

        int esc;

        System.out.println("==============================");
        System.out.println("===== *** Calculadora *** ====");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Sair");
        System.out.println("==============================");
        System.out.print("Digite o número da operação: ");
        esc = ler.nextInt();

        if (esc == 1) {
            int num1, num2, lr, r;
            do {
                System.out.println("Digite um número: ");
                num1 = ler.nextInt();
                System.out.println("Digite o segundo número: ");
                num2 = ler.nextInt();
                r = num1 + num2;
                System.out.println("Digite o segundo número: " + r);

                System.out.println("Deseja continuar? 1 para sim e 2 para não: ");
                lr = ler.nextInt();

            } while (lr == 1);
        }
        if (esc == 2) {
            int num1, num2, lr;
            do {
                System.out.println("Digite um número: ");
                num1 = ler.nextInt();
                System.out.println("Digite o segundo número: ");
                num2 = ler.nextInt();

                System.out.println("O resultado dessa operação é:" + (num2 - num1));

                System.out.println("Deseja continuar? 1 para sim e 2 para não: ");
                lr = ler.nextInt();

            } while (lr == 1);
        }
        if (esc == 3) {
            int num1, num2, lr;
            do {
                System.out.println("Digite um número: ");
                num1 = ler.nextInt();
                System.out.println("Digite o segundo número: ");
                num2 = ler.nextInt();

                System.out.println("O resultado dessa operação é: " + (num2 * num1));

                System.out.println("Deseja continuar? 1 para sim e 2 para não: ");
                lr = ler.nextInt();

            } while (lr == 1);
        }
        if (esc == 4) {
            int num1, num2, lr;
            do {
                System.out.println("Digite um número: ");
                num1 = ler.nextInt();
                System.out.println("Digite o segundo número: ");
                num2 = ler.nextInt();

                System.out.println("O resultado dessa operação é: " + (num2 / num1));

                System.out.println("Deseja continuar? 1 para sim e 2 para não: ");
                lr = ler.nextInt();

            } while (lr == 1);
        }

    }
}