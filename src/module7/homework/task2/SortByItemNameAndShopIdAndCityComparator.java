package module7.homework.task2;

import module7.homework.task1.Order;
import java.util.Comparator;

public class SortByItemNameAndShopIdAndCityComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if (o1.getItemName().compareTo(o2.getItemName()) != 0) {
            return o1.getItemName().compareTo(o2.getItemName());
        } else if (o1.getUser().getCity().compareTo(o2.getUser().getCity()) == 0) {
            return o1.getShopIdintificator().compareTo(o2.getShopIdintificator());
        } else {
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        }
    }
}
