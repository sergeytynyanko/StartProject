package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // Вагу посилки в кілограмах
        System.out.println("The weight of the package?");
        var rate = scanner.nextDouble();

        //Вартість доставки за кілограм в грн
        while (true) {
            System.out.println("Delivery cost per kilogram?");
            var grn = scanner.nextDouble();

            if (grn == 0)
                break;

            var result = grn * rate;
            System.out.println("Result = " + result);
        }
    }
}