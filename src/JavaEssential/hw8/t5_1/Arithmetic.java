package JavaEssential.hw8.t5_1;

import static JavaEssential.general.General.*;

public class Arithmetic {
    private double a, b, result;
    private String strResult = "";

    public Arithmetic() {
    }
    public Arithmetic(double result,String strResult) {
    this.result=result;
    this.strResult=strResult;
    }

    public Arithmetic(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return strResult;
    }

    public void inputA() {
        a = inDouble();
    }

    public void inputB() {
        b = inDouble();
    }

    public Calculator calculator() {
        return new Calculator(a, b);
    }

    public class Calculator {
        private double a, b, result;
        private String strResult = "";

        public Calculator(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public Calculator(double a, double b, double result, String strResult) {
            this.a = a;
            this.b = b;
            this.result = result;
            this.strResult = strResult;
        }

        public Calculator add() {
            result = a + b;
            strResult += a + "+" + b + "=" + result + "\n";
            Arithmetic.this.result = result;
            Arithmetic.this.strResult = strResult;
            return new Calculator(a, b, result, strResult);
        }

        public Calculator sub() {
            result = a - b;
            strResult += a + "-" + b + "=" + result + "\n";
            Arithmetic.this.result = result;
            Arithmetic.this.strResult = strResult;
            return new Calculator(a, b, result, strResult);
        }

        public Calculator mul() {
            result = a * b;
            strResult += a + "*" + b + "=" + result + "\n";
            Arithmetic.this.result = result;
            Arithmetic.this.strResult = strResult;
            return new Calculator(a, b, result, strResult);
        }

        public Calculator div() throws ArithmeticException {
            if (b == 0) {// double/double не вызывает exception;
                result = -1;
                strResult += a + "/" + b + "=" + "Помилка!!! Ділення на нуль" + "\n";
                Arithmetic.this.result = result;
                Arithmetic.this.strResult = strResult;
                throw new ArithmeticException("Помилка!!! Ділення на нуль");
            } else {
                result = a / b;
                strResult += a + "/" + b + "=" + result + "\n";
                Arithmetic.this.result = result;
                Arithmetic.this.strResult = strResult;
            }
            return new Calculator(a, b, result, strResult);
        }

        @Override
        public String toString() {
            return strResult;
        }
    }
}
