package L4;
/*
Leia a nota de um aluno (de 0 a 10) e imprima o conceito correspondente:
9 a 10: A
7 a 8.9: B
5 a 6.9: C
3 a 4.9: D
0 a 2.9: E
Fora desse intervalo: "Nota inválida"
Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/
import java.util.Scanner;
public class L4ex7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double nt;

        System.out.println("Informe sua nota ");
        nt = ler.nextDouble();

        if(nt >= 9 && nt < 11){
            System.out.println("A");
        }
        else if(nt < 9 && nt >= 7){
            System.out.println("B");
        }
        else if(nt < 7 && nt >= 5){
            System.out.println("C");
        }
        else if(nt < 5 && nt >= 3){
            System.out.println("D");
        }
        else if(nt < 3 && nt >= 0){
            System.out.println("E");
        }
        else{
            System.out.println("Nota inválida");
        }
    }
}