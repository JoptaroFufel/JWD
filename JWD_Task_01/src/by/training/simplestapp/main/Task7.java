package by.training.simplestapp.main;

public class Task7 {
    public static void main(String[] args) {
        double a;
        double b;
        double h;
        double f;

        System.out.print("a: ");
        a = InputScanner.enterDoubleFromConsole();

        do {
            System.out.print("b: ");
            b = InputScanner.enterDoubleFromConsole();
        } while (b <= a);

        do {
            System.out.print("h: ");
            h = InputScanner.enterDoubleFromConsole();
        } while (h >= b - a);

        for (double i = a; i <= b; i += h) {
            f = Math.pow(Math.sin(i), 2) + Math.cos(2 * i);
            System.out.println("x = " + i + " | f(x) = " + f);
        }
    }
}
