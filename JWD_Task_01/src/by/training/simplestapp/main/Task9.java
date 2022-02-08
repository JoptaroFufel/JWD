package by.training.simplestapp.main;

public class Task9 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int k;

        do {
            System.out.print("n1: ");
            n1 = InputScanner.enterIntFromConsole();
        } while (n1 <= 0);

        do {
            System.out.print("n2: ");
            n2 = InputScanner.enterIntFromConsole();
        } while (n2 <= 0);

        do {
            System.out.print("k: ");
            k = InputScanner.enterIntFromConsole();
        } while (k < 0 && k >= n1 - 1);

        int m1[] = new int[n1];
        int m2[] = new int[n2];

        for (int i = 0; i < n1; i ++) {
            m1[i] = (int)(Math.random() * 100);
            System.out.println("m1[" + i + "] = " + m1[i]);
        }

        for (int i = 0; i < n2; i ++) {
            m2[i] = (int)(Math.random() * 100);
            System.out.println("m2[" + i + "] = " + m2[i]);
        }

        int m3[] = new int[n1 + n2];

        for (int i = 0; i <= k; i++) {
            m3[i] = m1[i];
            System.out.println("m3[" + i + "] = " + m3[i]);
        }

        for (int i = 0; i < n2; i++) {
            m3[k + i + 1] = m2[i];
            System.out.println("m3[" + (k + i + 1) + "] = " + m3[k + i + 1]);
        }

        for (int i = k + 1; i < n1; i++) {
            m3[i + n2] = m1[i];
            System.out.println("m3[" + (i + n2) + "] = " + m3[i + n2]);
        }
    }
}
