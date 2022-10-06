package com.game;

import java.util.Scanner;

public class Number {

    public Number() {

    }

    public void game() {
        int randomNumber = (int) (Math.random() * 100 + 1);
        boolean hasWon = false;

        System.out.println("Numeros random del 1 al 100: ");
        System.out.println("Ingresar: ");

        Scanner sc = new Scanner(System.in);

        for (int i = 10; i > 0; i--) {

            int number = sc.nextInt();

            if (number > randomNumber) {
                System.out.println("numero mayor");
            } else if (number < randomNumber) {
                System.out.println("numero menor");
            } else {
                System.out.println("Iguales");
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("ganaste");
        } else {
            System.out.println("perdiste");
        }

    }
}
