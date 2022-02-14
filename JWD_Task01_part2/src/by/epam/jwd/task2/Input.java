package by.epam.jwd.task2;

import java.util.Scanner;

public class Input {
    public static double enterDoubleFromConsole(String str) {
        Scanner sc = new Scanner(System.in);
        double a = 0.0;

        System.out.print(str + ": ");

        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input. double is required: ");
            sc.next();
        }
        a = sc.nextDouble();

        return a;
    }

    public static int enterIntFromConsole(String str) {
        Scanner sc = new Scanner(System.in);
        int a = 0;

        System.out.print(str + ": ");

        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. int is required: ");
            sc.next();
        }
        a = sc.nextInt();

        return a;
    }

    public static int[] enterIntMassiveFromConsole(int size) {
        int mass[] = new int[size];

        for (int i = 0; i < size; i ++) {
            mass[i] = (int)(Math.random() * 100);;
        }

        return mass;
    }
}
