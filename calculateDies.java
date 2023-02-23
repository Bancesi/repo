package org.example;

import java.util.Scanner;

public class git2023 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double costo, salari, dies;
        int totaldiasdias;

        costo = keyboard.nextInt();
        salari = keyboard.nextInt();

        dies = costo/(salari/30);
        totaldiasdias = (int)Math.ceil(dies);

        System.out.println("S'ha d'estalviar durant "+totaldiasdias+" dies.");
    }
}