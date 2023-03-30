package JavaEssential.hw4.t2;

public class DOCHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Open doc file");

    }

    @Override
    void create() {
        System.out.println("Create doc file");

    }

    @Override
    void change() {
        System.out.println("Change doc file");

    }

    @Override
    void save() {
        System.out.println("Save doc file");

    }
}
