package by.training.simplestapp.main;

public class Task4 {
    public static void main(String[] args) {
        double x;
        double y;
        System.out.println("x: ");
        x = InputScanner.enterDoubleFromConsole();

        System.out.println("y: ");
        y = InputScanner.enterDoubleFromConsole();

        if ((Math.abs(x) <= 2 && y <= 4 && y>= 0)
                || (Math.abs(x) <= 4 && y <=0 && y >= -3))
            if (x == 0 && y == -1) System.out.print("False");
            else System.out.print("True");
    }
}
