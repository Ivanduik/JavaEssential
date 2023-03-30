package JavaEssential.general;

import java.util.Scanner;

public class General {
    static Scanner in = new Scanner(System.in);

    public static double inDouble() {
        return in.nextDouble();
    }

    public static String inString() {
        return in.next();
    }
    public static int inInt() {

        while (!in.hasNextInt()){
            System.out.printf("Ви ввели некоректне значення!!!%nCпробуйте ще раз");
            in.next();
        }
        return in.nextInt();
    }

}
