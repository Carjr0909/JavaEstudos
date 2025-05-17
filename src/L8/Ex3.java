package L8;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int c = 0;


        System.out.println("Digite os elementos da matriz 4x4: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println();
        }

        System.out.println("Repetidos");
        for(int a = 0; a < 5; a++){
            for(int b = 0; b < 5; b++){
                for(int a1 = 0; a1 < 5; a1++){
                    for(int b1 = 0; b1 < 5; b1++){
                        if (!(a == a1 && b == b1) && matriz[a][b] == matriz[a1][b1]){
                            System.out.println(matriz[a1][b1]);
                        }
                    }
                }
            }
        }
    }
}