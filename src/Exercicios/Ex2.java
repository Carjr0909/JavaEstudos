package Exercicios;

import java.util.Objects;
import java.util.Scanner;
import java.io.IOException;

public class Ex2 {

    public static void limpa() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public static void main(String [] args) throws InterruptedException {
        Scanner ler = new Scanner(System.in);
        int esc, esc2, esc3, i = 0, conta = 600, f = 0, g = 0;
        double depat, saqat;
        String[] usu = new String[6];
        String[] senha = new String[6];
        double[] saldo = new double[6];
        double[] saque = new double[6];
        double[] deposito = new double[6];
        String sen, sn1, sn2;
        boolean contaCriada = false, contaLogada = false;

        do {
            do {
                limpa();
                System.out.println("============================");
                System.out.println("****** Banco no Java ******");
                System.out.println("============================");
                System.out.println("1 - Criar conta");
                System.out.println("2 - logar");
                System.out.println("3 - Sair");
                System.out.println("============================");
                System.out.print("Digite a opção desejada: \n--> ");
                esc2 = ler.nextInt();

                ler.nextLine();
                switch (esc2){
                case 1:
                    limpa();
                    i = i + 1;
                    do {
                        System.out.println("============================");
                        System.out.println("****** Criar conta ******");
                        System.out.println("============================");
                        System.out.println("Digite o nome de usuario");
                        usu[i] = ler.nextLine();

                        System.out.println("Digite a senha");
                        sn1 = ler.nextLine();

                        System.out.println("Digite a senha novamente");
                        sn2 = ler.nextLine();

                        if(Objects.equals(sn1, sn2)){
                            senha[i] = sn1;
                            contaCriada = true;
                        }
                        else{
                            System.out.println("As senhas não batem! Tente novamente");
                        }
                    }while (!contaCriada);
                    break;
                case 2:
                    break;
            }

            }while(esc2 != 2 && esc2 != 3);

            limpa();

            System.out.println("============================");
            System.out.println("****** logar ******");
            System.out.println("============================");
            System.out.println("1 - " + usu[1]);
            System.out.println("2 - " + usu[2]);
            System.out.println("3 - " + usu[3]);
            System.out.println("4 - " + usu[4]);
            System.out.println("5 - " + usu[5]);
            System.out.println("============================");
            System.out.print("Digite a conta que deseja logar\n--> ");
            conta = ler.nextInt();

            ler.nextLine();
            do {
                System.out.print("Digite a senha da conta\n--> ");
                sen = ler.nextLine();

                if (Objects.equals(sen, senha[conta])) {
                    System.out.println("Logado com secesso!");
                    Thread.sleep(3000);
                    contaLogada = true;
                }
                else{
                    System.out.println("Senha incorreta! Tente novamente");
                    Thread.sleep(2000);
                }
            }while(!contaLogada);




            do {
                limpa();
                System.out.println("============================");
                System.out.println("****** Banco no Java ******");
                System.out.println("****** Olá " + usu[conta] + " ******");
                System.out.println("============================");
                System.out.println("1 - Depósito bancário");
                System.out.println("2 - Saque");
                System.out.println("3 - Saldo");
                System.out.println("4 - Sair da conta");
                System.out.println("============================");
                System.out.print("Digite a opção desejada: \n--> ");
                esc = ler.nextInt();

                saldo[conta] = deposito[conta] - saque[conta];

                ler.nextLine();

                switch (esc) {
                    case 1:
                        limpa();
                        System.out.println("============================");
                        System.out.println("**** Deposito Bancario ****");
                        System.out.println("============================");
                        System.out.print("Digite o valor que deseja depositar: \n--> ");
                        depat = ler.nextDouble();
                        deposito[conta] = deposito[conta] + depat;
                        Thread.sleep(2000);
                        System.out.println("Processando.");
                        Thread.sleep(1000);
                        limpa();
                        System.out.println("Processando..");
                        Thread.sleep(1000);
                        limpa();
                        System.out.println("Processando...");
                        Thread.sleep(1000);
                        break;
                    case 2:
                        limpa();
                        System.out.println("============================");
                        System.out.println("**** Sacar Dinheiro ****");
                        System.out.println("============================");
                        System.out.print("Digite o valor que deseja sacar: \n--> ");
                        saqat = ler.nextDouble();

                        if (saqat > saldo[conta]) {
                            System.out.println("Saldo insulficiente");
                            Thread.sleep(3000);
                            break;
                        }
                        saque[conta] = saque[conta] + saqat;
                        Thread.sleep(2000);
                        System.out.println("Processando.");
                        Thread.sleep(1000);
                        limpa();
                        System.out.println("Processando..");
                        Thread.sleep(1000);
                        limpa();
                        System.out.println("Processando...");
                        Thread.sleep(1000);
                        break;
                    case 3:
                        limpa();
                        Thread.sleep(2000);
                        System.out.println("Processando.");
                        Thread.sleep(1000);
                        limpa();
                        System.out.println("Processando..");
                        Thread.sleep(1000);
                        limpa();
                        System.out.println("Processando...");
                        Thread.sleep(1000);
                        System.out.println("============================");
                        System.out.println("**** Consultar saldo ****");
                        System.out.println("============================");
                        System.out.println("Seu saldo é de: " + saldo[conta]);
                        Thread.sleep(3000);

                        break;
                }
            } while (esc != 4);
        } while(esc2 != 3);
    }
}