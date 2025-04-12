package L4;
/*
Escreva um programa que receba três valores inteiros representando os lados
de um triângulo e determine se ele é:
Equilátero (todos os lados iguais)
Isósceles (dois lados iguais)
Escaleno (todos os lados diferentes)
Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/
import java.util.Scanner;
public class L4ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int ld1, ld2, ld3;

        System.out.println("Digite o primeiro lado");
        ld1 = ler.nextInt();
        System.out.println("Digite o segundo lado");
        ld2 = ler.nextInt();
        System.out.println("Digite o terceiro lado");
        ld3 = ler.nextInt();

        if((ld1 + ld2) < ld3 || (ld3 + ld2) < ld1 || (ld1 + ld3) < ld2 ) {
            System.out.println("Os valores não formam um triângulo válido.");
        }
        else if(ld1 == ld2 && ld1 == ld3){
            System.out.println("Triângulo Equilátero");
        }
        else if(ld1 == ld2 || ld1 == ld3 || ld3 == ld2){
            System.out.println("Triângulo Isósceles");
        }
        else{
            System.out.println("Triângulo Escaleno");
        }
    }
}