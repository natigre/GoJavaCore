package module7.homework.task2;

import module7.homework.task1.Order;
import java.util.Comparator;


public class SortByPriceComparator implements Comparator<Order>{

    @Override
    public int compare(Order o1, Order o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
