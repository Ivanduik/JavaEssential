package JavaEssential.hw8.t2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;


import static JavaEssential.general.General.inString;

public class Company{
    Worker[] firm = new Worker[5];

    public void sort() {
        Arrays.sort(firm, Comparator.comparing(Worker::getNameInitials));// так предложила идея
//        Arrays.sort(firm,(fist,second)->{
//            return fist.getNameInitials().compareTo(second.getNameInitials());
//        });

    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Worker w : firm)
            str.append(w.getNameInitials())
                    .append(" ")
                    .append(w.getJobPosition())
                    .append(" ")
                    .append(w.getEmployment())
                    .append("\n");
        return str.toString();
    }

    public void addWorker() {
        for (int i = 0; i < firm.length; i++) {
            firm[i] = new Worker();
            System.out.println("Ввeдите данные работника - " + (i + 1));
            System.out.println("Введите Имя и инициал работника");
            firm[i].setNameInitials(inString());
            System.out.println("Введите должность работника");
            firm[i].setJobPosition(inString());
            System.out.println("Введите дату принятия на работу работника в формате dd/mm/yyyy ");
            while (true) {
                try {
                    firm[i].setEmployment(inString(), "dd/mm/yyyy");
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            for (int j = 0; j <= i; j++) {
                try {
                    if (0 > new SimpleDateFormat("dd/MM/yyyy").parse(firm[i].getEmployment())
                            .compareTo(new SimpleDateFormat("dd/MM/yyyy").parse(firm[j].getEmployment())))
                        System.out.println("У " + firm[j].getNameInitials() + " стаж работі больше");
                } catch (ParseException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        sort();
    }
}
