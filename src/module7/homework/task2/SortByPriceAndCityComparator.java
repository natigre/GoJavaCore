package module7.homework.task2;

import module7.homework.task1.Order;

import java.util.Comparator;

public class SortByPriceAndCityComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        int price1 = o1.getPrice();
        int price2 = o2.getPrice();
        String cityUser1 = o1. getUser().getCity();
        String cityUser2 = o2. getUser().getCity();

        if(price1 - price2 == 0) {
            return cityUser1.compareTo(cityUser2);
        } else  {
            return price1 - price2;
        }
    }
}
