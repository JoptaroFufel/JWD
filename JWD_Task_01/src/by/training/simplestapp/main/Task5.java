package by.training.simplestapp.main;

public class Task5 {
    public static void main(String[] args) {
        double matrix[] = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("m[" + i + "]:");
            matrix[i] = InputScanner.enterDoubleFromConsole();
        }

        for (int i = 0; i < 4; i++) {
            if (matrix[i] < 0) {
                matrix[i] = Math.pow(matrix[i], 4);
                System.out.print("m[" + i + "] = " + matrix[i] + "; ");
            }
            else {
                matrix[i] = Math.pow(matrix[i], 2);
                System.out.print("m[" + i + "] = " + matrix[i] + "; ");
            }
        }
    }
}
