package by.training.simplestapp.main;

public class Task10 {
    public static void main(String[] args) {
        int n;

        do {
            System.out.print("n1: ");
            n = InputScanner.enterIntFromConsole();
        } while (n <= 0);

        int m[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = (i % 2 != 0 ?  n - j : j);
                System.out.print(m[i][j] + "; ");
            }
            System.out.println();
        }
    }
}
