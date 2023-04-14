package JavaEssential.hw10.t2;


public class Main {
    public static void main(String[] args) {
        MyList<String> lst = new MyList<>("000000");
        lst.add("aaa");
        lst.add("bbb");
        lst.add("ccc");
        lst.add("ddd");
        lst.add("eee");
        System.out.println("Всі елементи - \n" + lst.toString());
        System.out.println("2 елемент - " + lst.get(2));
        System.out.println("1 елемент - " + lst.get(1));
        System.out.println("Розмір - " + lst.size());

        MyList<Integer> lst1 = new MyList<>(123);
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);
        lst1.add(5);
        System.out.println("Всі елементи - \n" + lst1.toString());
        System.out.println("2 елемент - " + lst1.get(2));
        System.out.println("1 елемент - " + lst1.get(1));
        System.out.println("Розмір - " + lst1.size());
    }


}
