package JavaEssential.hw3.t6;

import java.util.Arrays;

public class Printer {
    private final String[] textColor={"\033[0m","\033[0;30m","\033[0;31m","\033[0;32m","\033[0;33m",
            "\033[0;34m","\033[0;35m","\033[0;36m","\033[0;37m"};
//    public static final String RESET = "\033[0m";  // Text Reset
//    // Regular Colors
//    public static final String BLACK = "\033[0;30m";   // BLACK
//    public static final String RED = "\033[0;31m";     // RED
//    public static final String GREEN = "\033[0;32m";   // GREEN
//    public static final String YELLOW = "\033[0;33m";  // YELLOW
//    public static final String BLUE = "\033[0;34m";    // BLUE
//    public static final String PURPLE = "\033[0;35m";  // PURPLE
//    public static final String CYAN = "\033[0;36m";    // CYAN
//    public static final String WHITE = "\033[0;37m";   // WHITE

    private final String parentClass = Printer.class.getSimpleName();

    public void print(String value) {
        if (this.getClass().getSimpleName().equals(parentClass))
            System.out.println(value);
        else  { System.out.println(textColor[(int) (Math.random() * 6)+2]+ value+textColor[0]);

        }
    }
}
