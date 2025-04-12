package L3;
/*
Faça um programa que leia as notas de duas provas, calcule a média aritmética simples, e
informe se o aluno foi aprovado (média maior ou igual a 6) ou reprovado (média menor que 6).

Data: 05/04/25
Programador: Carlos
Professora: Luciana
*/
import java.util.Scanner;
public class L3ex4 {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner ler = new Scanner(System.in);

        // Declaração das variáveis que armazenarão as notas e a média final
        int med1, med2, medf;

        // Solicita ao usuário que digite a primeira nota
        System.out.println("Digite a primeira nota: ");
        med1 = ler.nextInt();  // Lê a primeira nota e armazena na variável med1

        // Solicita ao usuário que digite a segunda nota
        System.out.println("Digite a segunda nota: ");
        med2 = ler.nextInt();  // Lê a segunda nota e armazena na variável med2

        // Calcula a média final, que é a média aritmética entre med1 e med2
        medf = (med1 + med2) / 2;  // Soma as duas notas e divide por 2 para obter a média

        // Verifica se a média final é maior ou igual a 6 para aprovação
        if (medf >= 6){
            // Se a média for maior ou igual a 6, o aluno está aprovado
            System.out.println("Você está aprovado!");
        }
        else{
            // Se a média for menor que 6, o aluno está reprovado
            System.out.println("Você está reprovado");
        }

    }
}