package by.epam.jwd.task2;

public class Output {
    public static void outputDoubleToConsole(String str, double number) {
        System.out.println(str + " " + number);
    }

    public static void outputIntToConsole(String str, int number) {
        System.out.println(str + " " + number);
    }

    public static void outputIntMassive(String str, int mass[]) {
        System.out.println(str + " {");

        for (int i = 0; i < mass.length; i++) {
            System.out.println("    " + mass[i]);
        }

        System.out.println("}");
    }

    public static void outputIntQuadraticMatrix(int mass[][]) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j] + "; ");
            }
            System.out.println();
        }
    }
}
