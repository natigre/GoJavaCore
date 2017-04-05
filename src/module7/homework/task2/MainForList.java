package module7.homework.task2;

import module7.homework.task1.*;
import module7.homework.task1.Currency;
import java.util.*;
import static module7.homework.task1.Currency.*;

public class MainForList {
    public static void main(String[] args) {

        User user1 = new User(21, "Olga", "Moroz", "Kiyv", 2500);
        User user2 = new User(29, "Alex", "Fokin", "Odessa", 15500);
        User user3 = new User(85, "Pavel", "Malov", "Lviv", 1600);
        User user4 = new User(74, "Kate", "Shylo", "Dnipro", 25000);
        User user5 = new User(1, "Olga", "Boyun", "Chernihiv", 8000);
        User user6 = new User(33, "Sergey", "Davidenko", "Dnipro", 7200);
        User user7 = new User(60, "Maryna", "Kravchenko", "Poltava", 1000);
        User user8 = new User(100, "Vlad", "Lukin", "Chernihiv", 4200);
        User user9 = new User(48, "Oleg", "Kuchkin", "Sumy", 3500);
        User user10 = new User(99, "Nina", "Morozenko", "Kiyv", 6600);

        List<Order> orderList = new ArrayList<>(12);
        orderList.add(new Order(125, 250, UAH, "Food", "AUCHAN", user2));
        orderList.add(new Order(228, 500, USD, "Bicycle", "Rozetka", user5));
        orderList.add(new Order(84, 1200, UAH, "Armchair", "Rozetka", user9));
        orderList.add(new Order(384, 600, USD, "Wardrobe", "AUCHAN", user7));
        orderList.add(new Order(125, 250, UAH, "Food", "AUCHAN", user2));
        orderList.add(new Order(41, 400, UAH, "Barbie", "Rozetka", user8));
        orderList.add(new Order(1254, 850, UAH, "Desk", "AUCHAN", user4));
        orderList.add(new Order(851, 500, USD, "Notebook", "Rozetka", user3));
        orderList.add(new Order(46, 425, UAH, "Food", "AUCHAN", user1));
        orderList.add(new Order(11, 3500, UAH, "Desk", "Rozetka", user10));
        orderList.add(new Order(36, 600, UAH, "Armchair", "Rozetka", user10));
        orderList.add(new Order(54, 250, USD, "Bicycle", "Rozetka", user6));

        System.out.println("Generated list of orders: " + orderList);

        orderList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        System.out.println("Sorted list by price in decrase order: " + orderList);

        orderList.sort(new SortByPriceAndCityComparator());
        System.out.println("Sorted list by price and city: " + orderList);

        orderList.sort(new SortByItemNameAndShopIdAndCityComparator());
        System.out.println("Sorted list by item name, shop idintificator and city: " + orderList);

        System.out.println("List with removed duplicates: " + deleteDublicateFromList(orderList));
        System.out.println("List deleted items with price low than 1500: " + deleteOrdersWithLowestPrice(orderList));
        System.out.println("List separeted by currency: " + separateListByCurrency(orderList));


    }

    public static List<Order> deleteDublicateFromList(List<Order> orders) {
        Set<Order> resultList = new HashSet<>();
        resultList.addAll(orders);
        return new ArrayList<>(resultList);
    }

    public static List<Order> deleteOrdersWithLowestPrice(List<Order> orders) {
        List<Order> resultList = new ArrayList<>();
        Iterator<Order> iter = orders.iterator();
        while (iter.hasNext()) {
            Order order = iter.next();
            if (order.getPrice() < 1500) {
                resultList.add(order);
            }
        }
        return resultList;
    }

    public static Map<Currency, List<Order>> separateListByCurrency(List<Order> ordares) {
        Map<Currency, List<Order>> resultMap = new HashMap<>();
        List<Order> listUSD = new ArrayList<>();
        List<Order> listUAH = new ArrayList<>();

        for(Order order : ordares) {
            if (order.getCurrency().equals(Currency.UAH)) {
                listUAH.add(order);
            } else {
                listUSD.add(order);
            }
        }
        resultMap.put(UAH, listUAH);
        resultMap.put(USD, listUSD);
        return resultMap;
    }
}
