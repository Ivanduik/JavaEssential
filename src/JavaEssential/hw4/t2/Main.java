package JavaEssential.hw4.t2;

import JavaEssential.general.General;

public class Main {

    public static void main(String[] args) {
        AbstractHandler editor;
        String inStr;
        System.out.println("Введить і'мя файлу, тип-doc,txt,xml:");
        inStr = General.inString();

        if (inStr.length() < 5) {
            System.out.println("Не вірне ім'я файлу");
            return;
        }
        switch (inStr.substring(inStr.length() - 4)) {
            case ".doc" -> {
                editor = new DOCHandler();
            }
            case ".txt" -> {
                editor = new TXTHandler();
            }
            case ".xml" -> {
                editor = new XMLHandler();
            }
            default -> {
                System.out.println("Було введено не правильний тип");
                return;
            }
        }
        editor.create();
        editor.open();
        editor.save();
        editor.change();
    }

}

