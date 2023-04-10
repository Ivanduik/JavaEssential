package JavaEssential.hw8.t5_1;

import static JavaEssential.general.General.*;

public class Main {
    public static void main(String[] args) {
        double a, b, rez;
        String operation;
        System.out.println("Введить число A");
        a = inDouble();
        System.out.println("Введить число B");
        b = inDouble();
        System.out.println("Введить операцію:"
                + "\nadd – додавання"
                + "\nsub – віднімання"
                + "\nmul – множення"
                + "\ndiv – поділ");
        operation = inString().toLowerCase();
        Arithmetic arithmetic = new Arithmetic(a, b);
        Arithmetic.Calculator calculator = new Arithmetic(a, b).calculator();
        try {
            try {
                switch (operation) {
                    case "add" -> calculator = arithmetic.calculator().add();
                    case "sub" -> calculator = arithmetic.calculator().sub();
                    case "div" -> calculator = arithmetic.calculator().div();
                    case "mul" -> calculator = arithmetic.calculator().mul();
                    default -> throw new IllegalAccessException("Введена не вірна операція");
                }
            } catch (IllegalAccessException e) {
                System.out.println(e.getMessage());
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(arithmetic);
        System.out.println(calculator.toString());
    }
}
