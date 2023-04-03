package JavaEssential.hw5.t4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static ArrayList<Integer> incIntArrayList(ArrayList<Integer> arrList) {
        ListIterator<Integer> tmp = arrList.listIterator();
        while (tmp.hasNext()) {
            Integer num = tmp.next();
            tmp.set(num + 1);
        }
        return arrList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> intNumber = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            intNumber.add(i, (int) (Math.random() * 100));
        }
        System.out.println("ArrayList " + intNumber.toString());
        System.out.println("ArrayList inc elements" + incIntArrayList(intNumber));
    }
}

