package homework2;

import java.util.Scanner;

public class homework2_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число a ");
        int a = scanner.nextInt();
        System.out.println("Введіть число b ");
        int b = scanner.nextInt();
        System.out.println("Введіть число c ");
        int c = scanner.nextInt();

        double x;
        double d;
        double x1;
        double x2;


        if (a == 0) {

            x = (-c) / b;
            System.out.println("Ваш корінь рівняння: " + x);

        } else {

            d = Math.pow(b, 2) - 4 * a * c;
            if (d >= 0) {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("Ваш перший корінь: " + x1);
                System.out.println("Ваш другий корінь: " + x2);
            } else {
                System.out.println("У вас D менший за нуль, тому коренів нема");
            }
        }
    }
}
