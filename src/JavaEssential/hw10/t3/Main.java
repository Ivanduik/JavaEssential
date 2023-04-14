package JavaEssential.hw10.t3;

public class Main {
    public static void main(String[] args) {
        MyDictionary<String, String> myDictionary = new MyDictionary<>();
        myDictionary.add("Dad", "Батько");
        myDictionary.add("Mother", "Мати");
        myDictionary.add("Son", "Син");
        myDictionary.add("Daughter", "Дочь");
        System.out.println(myDictionary.toString());
        System.out.println(myDictionary.get(0));
        System.out.println(myDictionary.get(0).getWord());
        System.out.println(myDictionary.get(0).getTranslate());
        System.out.println("Розмір словаря - " + myDictionary.size());
    }
}
