package by.training.simplestapp.main;

public class Task6 {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        System.out.print("x: ");
        x = InputScanner.enterDoubleFromConsole();

        System.out.print("y: ");
        y = InputScanner.enterDoubleFromConsole();

        System.out.print("z: ");
        z = InputScanner.enterDoubleFromConsole();

        double answer = Math.max(x, Math.max(y, z)) + Math.min(x, Math.min(y, z));
        System.out.println("Answer = " + answer);
    }
}
