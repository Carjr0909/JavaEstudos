package L2;
/*

Crie um programa que peça ao usuário um valor em reais (R$) e o converta para
dólares (US$).
Suponha que a cotação do dólar seja R$ 5,00.

Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/
// Importa a classe Scanner para permitir a leitura de dados pelo teclado
import java.util.Scanner;

// Declaração da classe principal
public class L2ex7 {
    // Método principal - ponto de entrada do programa
    public static void main(String[] args){

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner ler = new Scanner(System.in);

        // Declara variáveis do tipo double:
        // 'r' para armazenar o valor em reais e 'd' para o valor convertido em dólares
        double r, d;

        // Solicita ao usuário que digite um valor em reais
        System.out.println("Digite o valor em reais: ");
        r = ler.nextDouble(); // Lê o valor digitado e armazena em 'r'

        // Converte o valor de reais para dólares usando uma taxa fixa de 5 (1 dólar = 5 reais)
        d = r / 5;

        // Exibe o valor convertido em dólares
        System.out.println("O valor em dolares é : $" + d);
    }
}

