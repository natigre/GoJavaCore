package module9.homework;

import module7.homework.task1.*;
import module7.homework.task1.Currency;

import java.util.*;
import java.util.stream.Collectors;

import static module7.homework.task1.Currency.*;


public class Main {
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

        sortByPrice(orderList);
        sortByPriceAndCity(orderList);
        sortByItemNameAndShopIdAndCity(orderList);
        deleteDublicateFromList(orderList);
        separateListByCurrency(orderList);
        separateListIntoListsByCities(orderList);
        checkForUserLastName(orderList, "Petrov");
        deleteOrdersWithUSD(orderList);
        deleteOrdersWithLowestPrice(orderList);

    }

    private static void sortByPrice(List<Order> orderList) {
        System.out.println("Sorted list by price in decrase order: ");
        Collections.sort(orderList, (o1, o2) -> o2.getPrice() - o1.getPrice());
        orderList.forEach(System.out::println);
    }

    private static void sortByPriceAndCity(List<Order> orderList) {
        System.out.println("\nSorted list by price and city: ");
        Collections.sort(orderList, (o1, o2) -> o1.getPrice() - o2.getPrice() != 0
                ? o1.getPrice() - o2.getPrice() : o1.getUser().getCity().compareTo(o2.getUser().getCity()));
        orderList.forEach(System.out::println);
    }

    private static void sortByItemNameAndShopIdAndCity(List<Order> orderList) {
        System.out.println("\nSorted list by item name, shop idintificator and city: ");
        orderList
                .stream()
                .sorted((o1, o2) -> o1.getUser().getCity().compareTo(o2.getUser().getCity()))
                .sorted(Comparator.comparing(order -> order.getShopIdintificator()))
                .sorted(Comparator.comparing(Order::getItemName))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void deleteDublicateFromList(List<Order> orderList) {
        System.out.println("\nList with removed duplicates: ");
        orderList
                .stream()
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void deleteOrdersWithLowestPrice(List<Order> orderList) {
        System.out.println("\nList after deleting items with price low than 1500: ");
        orderList.removeIf(order -> order.getPrice() < 1500);
        orderList.forEach(System.out::println);
    }

    private static void separateListByCurrency(List<Order> orders) {

        System.out.println("\nList separeted by currency: ");
        System.out.println("Orders with USD");
        orderList.stream()
                .filter(order -> order.getCurrency().equals(Currency.USD))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("Orders with UAH");
        orderList.stream()
                .filter(order -> order.getCurrency().equals(Currency.UAH))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void separateListIntoListsByCities(List<Order> orderList) {
        System.out.println("\nList cities: ");
        HashSet<String> cities =
                orderList
                        .stream()
                        .map(order -> order.getUser().getCity())
                        .collect(Collectors.toCollection(HashSet::new));
        System.out.println(cities);
        for (String city : cities) {
            System.out.println("Separate list for " + city);
            orderList
                    .stream()
                    .filter(order -> order.getUser().getCity().equals(city))
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
        }
    }

    private static void checkForUserLastName(List<Order> orderList, String name) {
        System.out.println("\n Check for equality of last name 'Petrov'  ");
        System.out.println(orderList
                .stream()
                .anyMatch(order -> order.getUser().getLastName().equals(name)));
        orderList
                .stream()
                .filter(order -> name != null && order.getUser().getLastName().equals(name))
                .forEach(System.out::println);
    }


    private static void deleteOrdersWithUSD(List<Order> orderList) {
        System.out.println("\nList with deleted orders, that contain currency USD: ");
        orderList
                .stream()
                .filter(order -> order.getCurrency() != USD)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
