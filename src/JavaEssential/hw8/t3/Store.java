package JavaEssential.hw8.t3;

import java.util.Arrays;
import java.util.Comparator;
import static JavaEssential.general.General.*;
public class Store {
    Price[] price = new Price[2];

    public void sort() {
        try {
            Arrays.sort(price, Comparator.comparing(Price::getProductName));
        } catch (Exception e) {
            System.out.println("Масив пустий");
        }
    }

    public void addProduct() {

        for (int i = 0; i < price.length; i++) {
            System.out.println("Товар - " + (i + 1));
            price[i] = new Price();
            System.out.println("Введить назву магазину");
            price[i].setStoreName(inString());
            System.out.println("Введить назву товару");
            price[i].setProductName(inString());
            System.out.println("введить вартість товару");
            price[i].setProductPrice(inDouble());
        }
    }

    public String searchProduct(String product) throws Exception {
        StringBuilder str = new StringBuilder();
        try {
            for (Price el : price)
                if (el.getProductName().equals(product))
                    str.append("Товар - ")
                            .append(el.getProductName())
                            .append(" в магзине - ")
                            .append(el.getStoreName())
                            .append(" ціна - ")
                            .append(el.getProductPrice())
                            .append("\n");

        } catch (Exception e) {
            System.out.println("Масив пустий");
        }
        if (str.toString().equals("")) {
            throw new Exception("Цього товару немає у магазинах");
        }
        return str.toString();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        try {
            for (Price val : price)
                str.append("Название магазина - ")
                        .append(val.getStoreName())
                        .append(", товар - ")
                        .append(val.getProductName())
                        .append(", вартість - ")
                        .append(val.getProductPrice())
                        .append(".\n");
            return str.toString();
        } catch (Exception e) {
            System.out.println("Масив пустий");
            return null;
        }
    }
}
