package by.training.simplestapp.main;

import java.util.Scanner;

public class InputScanner {
    public static double enterDoubleFromConsole() {
        Scanner sc = new Scanner(System.in);
        double a = 0.0;

        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input. double is required: ");
            sc.next();
        }
        a = sc.nextDouble();

        return a;
    }

    public static int enterIntFromConsole() {
        Scanner sc = new Scanner(System.in);
        int a = 0;

        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. int is required: ");
            sc.next();
        }
        a = sc.nextInt();

        return a;
    }
}
