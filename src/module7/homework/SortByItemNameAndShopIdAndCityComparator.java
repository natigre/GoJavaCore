package module7.homework;

import java.util.Comparator;

public class SortByItemNameAndShopIdAndCityComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        String itemName1 = o1.getItemName();
        String itemName2 = o2.getItemName();
        String shopIdintificator1 = o1.getShopIdintificator();
        String shopIdintificator2 = o2.getShopIdintificator();
        String cityUser1 = o1.getUser().getCity();
        String cityUser2 = o2.getUser().getCity();

        if (itemName1.compareTo(itemName2) != 0) {
            return itemName1.compareTo(itemName2);
        } else if (cityUser1.compareTo(cityUser2) == 0) {
            return shopIdintificator1.compareTo(shopIdintificator2);
        } else {
            return cityUser1.compareTo(cityUser2);
        }
    }
}
