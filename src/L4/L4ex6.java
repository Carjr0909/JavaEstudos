package L4;
/*
Peça ao usuário que informe sua renda mensal.
Com base na renda, informe a faixa de imposto:
Até R$2.000: isento
De R$2.001 a R$3.500: 7,5%
De R$3.501 a R$5.000: 15%
Acima de R$5.000: 22,5%
Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/
import java.util.Scanner;
public class L4ex6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int sl;

        System.out.println("Informe o seu salário: ");
        sl = ler.nextInt();

        if(sl <= 2000 && sl > 0){
            System.out.println("Insento de impostos: ");
        }
        else if(sl >= 2001 && sl <= 3500){
            System.out.println("Cerca de 7,5% de impostos");
        }
        else if(sl >= 3501 && sl <= 5000){
            System.out.println("Cerca de 15% de impostos");
        }
        else if(sl > 5000){
            System.out.println("Cerca de 22,5% de impostos");
        }
        else{
            System.out.println("Tu é tão pobre que ou está devendo ou não tem 1 real");
        }

    }
}