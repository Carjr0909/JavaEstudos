package L4;
/*
Peça ao usuário o peso de uma encomenda (em kg) e calcule o valor do frete:
Até 1 kg: R$10
De 1.01 até 5 kg: R$20
De 5.01 até 10 kg: R$30
Acima de 10 kg: "Frete não disponível para esse peso"
Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/
import java.util.Scanner;
public class L4ex8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double ps;

        System.out.println("Informe o peso da mercadoria: ");
        ps = ler.nextDouble();

        if(ps <= 1){
            System.out.println("Frente: R$10");
        }
        else if(ps > 1 && ps <= 5){
            System.out.println("Frente: R$20");
        }
        else if(ps > 5 && ps <= 10){
            System.out.println("Frente: R$30");
        }
        else{
            System.out.println("Frente não disponível pra esse peso");
        }

    }
}