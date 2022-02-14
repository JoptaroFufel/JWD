package by.epam.jwd.task2;

public class Logic {
    public static double problem3(double a, double b) {
        return a * b / 2;
    }

    public static double problem6(double x, double y, double z) {
        return Math.max(x, Math.max(y, z)) + Math.min(x, Math.min(y, z));
    }

    public static int[] problem9(int[] m1, int[] m2, int entryPoint) {
        int[] m3 = new int[m1.length + m2.length];

        for (int i = 0; i <= entryPoint; i++) {
            m3[i] = m1[i];
        }

        for (int i = 0; i < m2.length; i++) {
            m3[entryPoint + i + 1] = m2[i];
        }

        for (int i = entryPoint + 1; i < m1.length; i++) {
            m3[i + m2.length] = m1[i];
        }

        return m3;
    }

    public static int[][] problem10(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (i % 2 != 0 ? m.length - j : j);
            }
        }

        return m;
    }
}
