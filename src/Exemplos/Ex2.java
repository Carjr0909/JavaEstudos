package Exemplos;

import java.util.Scanner;

public class Ex2 {
   public static void main(String[] args){
       //Instacionando e criando um objeto do tipo scanner
        Scanner ler = new Scanner(System.in);

        //declarando variaveis
        int num;
        int resp;

       System.out.println("Digite um número: ");
       num = ler.nextInt();

       resp = num % 2;

       if(resp == 0)
           System.out.println("O número é par");
       else
           System.out.println("O número é impar");

    }
}
