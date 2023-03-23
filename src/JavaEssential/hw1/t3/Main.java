package JavaEssential.hw1.t3;

import java.util.Random;

public class Main {
    static public void main(String[] arg) {
        Computer comp[] = new Computer[5];
        Computer comp1[] = new Computer[5];

        comp1[0] = new Computer();
        comp1[0].setId(1);
        comp1[0].setName("Computer 1");

        comp1[1] = new Computer();
        comp1[1].setId(1);
        comp1[1].setName("Computer 2");

        comp1[2] = new Computer();
        comp1[2].setId(2);
        comp1[2].setName("Computer 2");

        comp1[3] = new Computer();
        comp1[3].setId(3);
        comp1[3].setName("Computer 3");

        comp1[4] = new Computer();
        comp1[4].setId(4);
        comp1[4].setName("Computer 4");

        for (int i = 0; i < comp1.length; i++) {
            comp[i] = new Computer();
            comp[i].setName(i + 1 + "");
            comp[i].setId((int) (Math.random() * 100));
            System.out.println(comp[i].getName());
            System.out.println(comp[i].getId());

        }
    }

}
