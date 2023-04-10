package JavaEssential.hw8.t5;

import static JavaEssential.general.General.*;
public class Main {
    public static void main(String[] args) {
        double a, b, rez;
        String operation;
        Calculator calculator;
        System.out.println("Введить число A");
        a = inDouble();
        System.out.println("Введить число B");
        b = inDouble();
        System.out.println("Введить операцію:" +
                "\nadd – додавання" +
                "\nsub – віднімання" +
                "\nmul – множення" +
                "\ndiv – поділ");
        operation = inString().toLowerCase();
        calculator = new Calculator(a, b);
        try {
            try {
                switch (operation) {
                    case "add" -> rez = calculator.add();
                    case "sub" -> rez = calculator.sub();
                    case "div" -> rez = calculator.div();
                    case "mul" -> calculator.mul();
                    default -> throw new IllegalAccessException("Введена не вірна операція");
                }
            } catch (IllegalAccessException e) {
                System.out.println(e.getMessage());
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(calculator);
    }
}
