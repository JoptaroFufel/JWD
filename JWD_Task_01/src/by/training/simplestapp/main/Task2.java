package by.training.simplestapp.main;

public class Task2 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        do {
            System.out.println("a: ");
            a = InputScanner.enterDoubleFromConsole();
        } while (a == 0);

        System.out.println("b: ");
        b = InputScanner.enterDoubleFromConsole();

        do {
            System.out.println("c: ");
            c = InputScanner.enterDoubleFromConsole();
        } while ((b * b + 4 * a * c) < 0);

        double answer = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.print("Answer = ");
        System.out.print(answer);
    }
}
