package by.training.simplestapp.main;

public class Task3 {
    public static void main(String[] args) {
        double a;
        double b;

        do {
            System.out.println("a: ");
            a = InputScanner.enterDoubleFromConsole();
        } while (a <= 0);

        do {
            System.out.println("b: ");
            b = InputScanner.enterDoubleFromConsole();
        } while (b <= 0);

        double answer = a * b / 2;
        System.out.print("Answer = ");
        System.out.print(answer);
    }
}
