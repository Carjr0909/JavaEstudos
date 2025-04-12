package L4;
/*
Peça ao usuário que informe a hora do dia (apenas a hora, entre 0 e 23).
Exiba uma saudação com base nesse valor:
"Bom dia" se for entre 5 e 11
"Boa tarde" se for entre 12 e 17
"Boa noite" se for entre 18 e 23
"Boa madrugada" se for entre 0 e 4
Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/
import java.util.Scanner;

public class L4ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int hr;

        System.out.println("Digite que horas são ( Apens horas )");
        hr = ler.nextInt();

        if(hr >= 5 && hr <= 11){
            System.out.println("Bom dia");
        }
        else if(hr >= 12 && hr <= 17){
            System.out.println("Boa tarde");
        }
        else if(hr >= 18 && hr <= 23){
            System.out.println("Boa noite");
        }
        else{
            System.out.println("Boa Madrugada");
        }


    }
}
