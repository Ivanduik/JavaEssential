package JavaEssential.hw3.t4;

import JavaEssential.general.General;

import static JavaEssential.general.General.inString;

public class Main {

    public static void main(String[] args) {
        DocumentWorker worker;
        String inStr;
        System.out.println("Введить номер продукта- або no, якщо немає");
        inStr = inString();
        worker = switch (inStr.toLowerCase()) {
            case "a" -> new ProDocumentWorker();
            case "b" -> new ExpertDocumentWorker();
            default -> new DocumentWorker();
        };
        worker.openDocument();
        worker.editDocument();
        worker.saveDocument();

    }
}
