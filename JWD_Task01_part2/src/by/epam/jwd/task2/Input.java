package by.epam.jwd.task2;

import java.util.Scanner;

public class Input {
    public static double enterDoubleFromConsole(String str) {
        Scanner sc = new Scanner(System.in);
        double a;

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
        int a;

        System.out.print(str + ": ");

        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. int is required: ");
            sc.next();
        }
        a = sc.nextInt();

        return a;
    }

    public static int[] enterIntMassiveFromConsole(int size) {
        int[] mass = new int[size];

        for (int i = 0; i < size; i ++) {
            mass[i] = (int)(Math.random() * 100);
        }

        return mass;
    }

    public static int enterEntryPoint(int size) {
        int entryPoint;

        do {
            entryPoint =enterPositiveIntFromConsole("Точка вхождения");
        }while(entryPoint >= size);

        return entryPoint;
    }

    public static double enterPositiveDoubleFromConsole(String str) {
        double x;

        do{
            x = enterDoubleFromConsole(str);
        }while (x <= 0);

        return x;
    }

    public static int enterPositiveIntFromConsole(String str) {
        int x;

        do{
            x = enterIntFromConsole(str);
        }while (x <= 0);

        return x;
    }
}
