package JavaEssential.hw10.t5;

public class Main {
    public static void main(String[] args) {
        MyNull<String> myNull;
        myNull = MyClass.factoryMethod(new MyNull<>());
        myNull.nullMethod("Factory");

    }
}
