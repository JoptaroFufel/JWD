package by.epam.jwd.task2;

public class Main {
    public static void main(String[] args){
        /* Problem 3 */
        double aSide;
        double bSide;

        aSide = Input.enterDoubleFromConsole("Катет а");

        bSide = Input.enterDoubleFromConsole("Катет b");

        double area = Logic.problem3(aSide, bSide);

        Output.outputDoubleToConsole("Площадь: ", area);

        /* Problem 6*/
        double firstNumber = Input.enterDoubleFromConsole("First");
        double secondNumber = Input.enterDoubleFromConsole("Second");
        double thirdNumber = Input.enterDoubleFromConsole("Third");

        double answer = Logic.problem6(firstNumber, secondNumber, thirdNumber);

        Output.outputDoubleToConsole("Answer:", answer);

        /* Problem 9 */
        int sizeOfFirstMassive = Input.enterIntFromConsole("Размер массива 1");
        int sizeofSecondMassive = Input.enterIntFromConsole("Размер массива 2");
        int entryPoint = Input.enterIntFromConsole("Точка вхождения");

        int[] firstMassive = Input.enterIntMassiveFromConsole(sizeOfFirstMassive);
        int[] secondMassive = Input.enterIntMassiveFromConsole(sizeofSecondMassive);

        Output.outputIntMassive("Массив 1", firstMassive);
        Output.outputIntMassive("Массив 2", secondMassive);

        int[] resultMassive = Logic.problem9(firstMassive, secondMassive, entryPoint);

        Output.outputIntMassive("Результат", resultMassive);

        /* Problem 10*/
        int size = Input.enterIntFromConsole("Размер массива");

        int[][] massive = new int[size][size];

        massive = Logic.problem10(massive);

        Output.outputIntQuadraticMatrix(massive);
    }
}
