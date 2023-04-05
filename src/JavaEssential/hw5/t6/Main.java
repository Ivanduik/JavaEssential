package JavaEssential.hw5.t6;

import JavaEssential.hw4.t2.AbstractHandler;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int minLikeIndex(ArrayList<Teacher> teach) {

        int min = Integer.MAX_VALUE;
        for (Teacher tmp : teach)
            if (tmp.like < min)
                min = tmp.like;
        return min;
    }

    public static int maxLikeIndex(ArrayList<Teacher> teach) {

        int max = Integer.MIN_VALUE;
        for (Teacher tmp : teach)
            if (tmp.like > max)
                max = tmp.like;
        return max;
    }

    public static void printValueIndex(ArrayList<Teacher> teach, int value) {
        for (Teacher tmp : teach)
            if (tmp.like == value || tmp.like == value + 1 || tmp.like == value - 1)
                System.out.println(tmp.name + " " + tmp.like + " " + tmp.subject);
    }

    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<>(0);
        Teacher teacher = new Teacher("Alexander Anatolyevich", 8, " assembler");
        teachers.add(teacher);
        teacher = new Teacher("Natalia Nikolaevna", 9, " mathematics");
        teachers.add(teacher);
        teacher = new Teacher("Elena Lvovna ", 10, "C++ curator");
        teachers.add(teacher);
        teacher = new Teacher("Oleksiy Anatoliyovich ", 10, "Oleksiy Anatoliyovich");
        teachers.add(teacher);
        teacher = new Teacher("Oksana Kostyantinivna", 4, "information security");
        teachers.add(teacher);
        teacher = new Teacher("Alona Volodymyrivna ", 2, "intellectual property");
        teachers.add(teacher);
        System.out.println("Не самый хороший учитель");
        printValueIndex(teachers, minLikeIndex(teachers));
        System.out.println("Самый хороший учитель");
        printValueIndex(teachers, maxLikeIndex(teachers));
    }

}
