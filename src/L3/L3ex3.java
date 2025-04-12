package L3;
/*
Faça um programa que leia um número e informe se ele é positivo, negativo ou zero.

Data: 05/04/25
Programador: Carlos
Professora: Luciana
*/
import java.util.Scanner;
public class L3ex3 {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner ler = new Scanner(System.in);

        // Declaração da variável que armazenará o número digitado
        Double num;

        // Solicita ao usuário que digite um número
        System.out.println("Digite um número: ");
        num = ler.nextDouble();  // Lê o número digitado e armazena na variável num

        // Verifica se o número é negativo, positivo ou neutro (zero)
        if (num < 0){
            // Se o número for menor que zero, é um número negativo
            System.out.println("Este número é negativo!");
        }
        else if (num > 0){
            // Se o número for maior que zero, é um número positivo
            System.out.println("Este número é positivo!");
        }
        else{
            // Se o número não for maior nem menor que zero, então ele é zero (neutro)
            System.out.println("Este número é neutro (igual a zero)!");
        }

    }
}
