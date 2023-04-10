package JavaEssential.hw8.t5;


public class Calculator {


    private double a;
    private double b;
    private double result;
    private String outMsg;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Calculator() {
    }


    public void inNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        result = a + b;
        outMsg = a + "+" + b + "=" + result;
        return result;

    }

    public double sub() {
        result = a - b;
        outMsg = a + "-" + b + "=" + result;
        return result;

    }

    public double mul() {
        result = a * b;
        outMsg = a + "*" + b + "=" + result;
        return result;
    }

    public double div() throws ArithmeticException {

        if (b == 0) {// double/double не вызывает exception;
            outMsg = "Помилка!!! Ділення на нуль";
            throw new ArithmeticException("Помилка!!! Ділення на нуль");
        } else {
            result = a / b;
            outMsg = a + "/" + b + "=" + result;
            return result;
        }

    }

    @Override
    public String toString() {
        return outMsg;
    }

    public double getResult() {
        return result;
    }


}
