package L2;
/*

Escreva um programa que calcule o montante final de um investimento usando a
fórmula de juros simples
M = C + (C * i * t)
• M = montante final
• C = capital inicial
• i = taxa de juros (em decimal, ex: 5% = 0.05)
• t = tempo em anos

Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/
// Importa a classe Scanner para permitir a leitura de dados via teclado
import java.util.Scanner;

// Declaração da classe principal
public class L2ex8 {
    // Método principal - ponto de entrada do programa
    public static void main(String[] args){

        // Cria um objeto Scanner para ler dados do usuário
        Scanner ler = new Scanner(System.in);

        // Declara variáveis do tipo double:
        // m = montante final, c = capital inicial, i = taxa de juros, t = tempo
        double m, c, i, t;

        // Solicita ao usuário o valor da capital (valor inicial investido)
        System.out.println("Digite a capital:");
        c = ler.nextDouble(); // Lê o valor digitado e armazena em 'c'

        // Solicita ao usuário a taxa de juros (em formato decimal, ex: 5% = 0.05)
        System.out.println("Digite a taxa de juros (em decimal):");
        i = ler.nextDouble(); // Lê a taxa de juros e armazena em 'i'

        // Solicita ao usuário o tempo em anos
        System.out.println("Digite o tempo em anos:");
        t = ler.nextDouble(); // Lê o tempo e armazena em 't'

        // Calcula o montante usando a fórmula de juros simples: M = C + (C * i * t)
        m = c + ( c * i * t);

        // Exibe o valor final (montante) ao usuário
        System.out.println("O montante final é de: " + m);
    }
}

