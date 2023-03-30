package JavaEssential.hw4.t2;

public class XMLHandler extends  AbstractHandler{
    @Override
    void open() {
        System.out.println("Open xml file");

    }

    @Override
    void create() {
        System.out.println("Create xml file");

    }

    @Override
    void change() {
        System.out.println("Change xml file");

    }

    @Override
    void save() {
        System.out.println("Save xml file");

    }
}
