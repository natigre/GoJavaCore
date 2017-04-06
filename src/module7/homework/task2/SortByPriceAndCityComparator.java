package module7.homework.task2;

import module7.homework.task1.Order;

import java.util.Comparator;

public class SortByPriceAndCityComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        if(o1.getPrice() - o2.getPrice() == 0) {
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        }
        return o1.getPrice() - o2.getPrice();
    }
}
