package module7.homework.task2;

import java.util.*;
import module7.homework.task1.*;
import module7.homework.task1.Currency;
import static module7.homework.task1.Currency.*;

public class MainForList {
    private static List<Order> orderList = new ArrayList<>();

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

        orderList.sort(new SortByPriceComparator());
        System.out.println("Sorted list by price in decrase order: " + orderList);

        orderList.sort(new SortByPriceAndCityComparator());
        System.out.println("Sorted list by price and city: " + orderList);

        orderList.sort(new SortByItemNameAndShopIdAndCityComparator());
        System.out.println("Sorted list by item name, shop idintificator and city: " + orderList);

        System.out.println("List with removed duplicates: " + deleteDublicateFromList(orderList));
        System.out.println("List deleted items with price low than 1500: " + deleteOrdersWithLowestPrice(orderList));
        System.out.println("List separeted by currency: " + separateListByCurrency(orderList));
        System.out.println("List separated into lists by cities: " + separateListIntoListsByCities(orderList));
    }

    private static List<Order> deleteDublicateFromList(List<Order> orders) {
        Set<Order> resultList = new HashSet<>();
        resultList.addAll(orders);
        return new ArrayList<>(resultList);
    }

    private static List<Order> deleteOrdersWithLowestPrice(List<Order> orders) {
        List<Order> resultList = new ArrayList<>();
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getPrice() < 1500) {
                resultList.add(order);
            }
        }
        return resultList;
    }

    private static Map<Currency, List<Order>> separateListByCurrency(List<Order> orders) {
        Map<Currency, List<Order>> resultMap = new HashMap<>();
        List<Order> listUSD = new ArrayList<>();
        List<Order> listUAH = new ArrayList<>();

        for(Order order : orders) {
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
    private static Map<String, List<Order>> separateListIntoListsByCities(List<Order> orders) {
        Map<String, List<Order>> result = new HashMap<>();
        for (Order order : orders) {
            String city = order.getUser().getCity();
            if (result.containsKey(city)) {
                result.get(city).add(order);
            } else {
                List<Order> orderList = new ArrayList<>();
                orderList.add(order);
                result.put(city, orderList);
            }
        }
        return result;
    }

    }


