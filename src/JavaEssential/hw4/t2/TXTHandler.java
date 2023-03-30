package JavaEssential.hw4.t2;

public class TXTHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Open txt file");

    }

    @Override
    void create() {
        System.out.println("Create txt file");

    }

    @Override
    void change() {
        System.out.println("Change txt file");

    }

    @Override
    void save() {
        System.out.println("Save txt file");

    }
}
