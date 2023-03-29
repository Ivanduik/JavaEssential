package JavaEssential.hw3.t4;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    public void saveDocument() {
        System.out.println("Версія Експерт");
        System.out.println("Документ збережено у новому форматі");
    }
}
