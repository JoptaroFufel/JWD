package by.training.simplestapp.main;

public class Task1 {
    public static void main(String[] args) {
        int inputNumber = 1000;
        int x;
        int y;

        while (true) {
            inputNumber = InputScanner.enterIntFromConsole();
            if (inputNumber > 999 && inputNumber < 10000) break;
        }

        y = (inputNumber % 100) % 10 + (inputNumber % 100) / 10;
        x = (inputNumber / 100) % 10 + (inputNumber / 100) / 10;

        if (x == y) System.out.println("True");
            else System.out.println("False");
    }
}
