package L2;
/*

Desenvolva um programa que peça o valor total da compra e o valor pago pelo
cliente. O programa deve calcular e exibir o troco.

Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/

// Importa a classe Scanner para permitir a leitura de dados via teclado
import java.util.Scanner;

// Declaração da classe principal
public class L2ex6 {
    // Método principal - onde o programa começa a ser executado
    public static void main(String[] args){

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner ler = new Scanner(System.in);

        // Declara variáveis inteiras:
        // vlp = valor do produto
        // vlt = valor do troco
        // vlc = valor que o cliente deu
        int vlp, vlt, vlc;

        // Solicita ao usuário que digite o valor do produto
        System.out.println("Digite o valor do produto:");
        vlp = ler.nextInt(); // Lê o valor e armazena em 'vlp'

        // Solicita ao usuário o valor dado pelo cliente
        System.out.println("Digite quanto o cliente deu:");
        vlc = ler.nextInt(); // Lê o valor e armazena em 'vlc'

        // Calcula o troco subtraindo o valor do produto do valor pago
        vlt = vlc - vlp;

        // Verifica se o valor dado pelo cliente é menor que o valor do produto
        if (vlp > vlc){
            // Se for, exibe que o dinheiro é insuficiente
            System.out.println("Dinheiro insuficiente!");
        }
        else {
            // Caso contrário, exibe o valor do troco
            System.out.println("O troco é de : " + vlt);
        }
    }
}
