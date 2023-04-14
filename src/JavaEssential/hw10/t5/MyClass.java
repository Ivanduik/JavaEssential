package JavaEssential.hw10.t5;

public class MyClass<T>  {
    static <T> T factoryMethod(T arg){
        System.out.println("factoryMethod - "+arg.toString());
        return arg;
    }

}
