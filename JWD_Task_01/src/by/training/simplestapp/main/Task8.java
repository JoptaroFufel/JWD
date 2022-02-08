package by.training.simplestapp.main;

public class Task8 {
    public static void main(String[] args) {
        int n;
        int k;
        int sum = 0;

        do {
            System.out.print("n: ");
            n = InputScanner.enterIntFromConsole();
        } while (n <= 0);

        double a[] = new double[n];

        for (int i = 0; i < n; i++) {
            do {
                System.out.print("a[" + i + "] = ");
                a[i] = InputScanner.enterIntFromConsole();
            } while (a[i] < 0);
        }

        do {
            System.out.print("k: ");
            k = InputScanner.enterIntFromConsole();
        } while (k <= 0);

        for (int i = 0; i < n; i++)
            if (a[i] % k == 0) {
                sum += a[i];
            }

        System.out.println("Answer = " + sum);
    }
}
