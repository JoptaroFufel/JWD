package by.epam.jwd.task22;
import by.epam.jwd.task2.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Logic logic = new Logic();
        boolean flag = Logic.flag;
        String str = input.stringInput("Enter the expression: ");

        try {
            input.inputCheck(str);
        } catch (Exception var6) {
            System.out.println(var6.getMessage());
        }

        List<String> expression = Logic.parseExpression(str);
        if (flag) {
            System.out.println();
            System.out.println(Logic.calc(expression));
        }
    }
}
