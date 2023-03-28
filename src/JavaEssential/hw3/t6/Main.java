package JavaEssential.hw3.t6;

public class Main {
    public static void main(String[] args) {
        Printer printer =new Printer();
        printer.print("Printer class");
        printer=new PrinterA();
        printer.print("PrinterA class");
        printer=new PrinterB();
        printer.print("PrinterB class");
        printer=new PrinterC();
        printer.print("PrinterC class");
        printer =new Printer();
        printer.print("Printer class");
    }
}
