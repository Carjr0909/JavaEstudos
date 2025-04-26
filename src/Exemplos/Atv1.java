package Exemplos;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class Atv1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        double soma = 0;
        int i = 1;

        while(i <= 10){
            System.out.print("Digite o " + i + "° número:\n--> ");
            double num = ler.nextDouble();

            soma += num;
            i++;
        }

        System.out.println("A soma desses números é : " + soma + " e a média entre eles é: " + (soma/10));
    }
}
