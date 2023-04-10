package JavaEssential.hw8.t3;

import static JavaEssential.general.General.*;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct();
        store.sort();
        try {
            System.out.println("Пошук по назві товару.\nВведить назву товару");
            System.out.println(store.searchProduct(inString()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(store);
    }
}
