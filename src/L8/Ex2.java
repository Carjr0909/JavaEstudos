package L8;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[][] matriz = new int[3][4];
        int[][] matriz2 = new int[3][4];


        System.out.println("Digite os elementos da matriz 3x4: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();

                if(matriz[i][j] >= 0){
                    matriz2[i][j] = matriz[i][j];
                }
                else{
                    matriz2[i][j] = 0;
                }
            }
        }
        System.out.println("Original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println();
        }

        System.out.println("Modificada");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("|" + matriz2[i][j] + "|");
            }
            System.out.println();
        }


    }
}