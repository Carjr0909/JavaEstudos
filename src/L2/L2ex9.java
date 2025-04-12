
package L2;
/*

Crie um programa que peça ao usuário um valor em reais (R$) e o converta para
dólares (US$).
Suponha que a cotação do dólar seja R$ 5,00.

Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/
// Importa a classe Scanner para permitir a leitura de dados via teclado
import java.util.Scanner;

// Declaração da classe principal
public class L2ex9 {
    // Método principal - ponto de entrada do programa
    public static void main(String[] args){

        // Cria um objeto Scanner para ler entrada do usuário
        Scanner ler = new Scanner(System.in);

        // Declara variáveis do tipo double:
        // po = preço original, pf = preço final com desconto, des = porcentagem de desconto
        double po, pf, des;

        // Solicita ao usuário o preço original do produto
        System.out.println("Digite o preço do produto: ");
        po = ler.nextDouble(); // Lê o valor digitado e armazena em 'po'

        // Solicita ao usuário a porcentagem de desconto
        System.out.println("Digite a porcentagem de desconto: ");
        des = ler.nextDouble(); // Lê o valor digitado e armazena em 'des'

        // Calcula o preço final com desconto: pf = po - (po * des / 100)
        pf = po - (po * des / 100);

        // Exibe o valor final do produto com o desconto aplicado
        System.out.println("O valor do produto com o desconto é de: " + pf);
    }
}

