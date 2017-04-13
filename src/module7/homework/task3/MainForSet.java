package module7.homework.task3;

import module7.homework.task1.*;
import module7.homework.task1.Currency;
import java.util.*;

import static module7.homework.task1.Currency.UAH;
import static module7.homework.task1.Currency.USD;

public class MainForSet {

    private static Set<Order> orderTreeSet = new TreeSet<>();

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

        orderTreeSet.add(new Order(125, 250, UAH, "Food", "AUCHAN", user2));
        orderTreeSet.add(new Order(228, 500, USD, "Bicycle", "Rozetka", user5));
        orderTreeSet.add(new Order(84, 1200, UAH, "Armchair", "Rozetka", user9));
        orderTreeSet.add(new Order(384, 600, USD, "Wardrobe", "AUCHAN", user7));
        orderTreeSet.add(new Order(125, 250, UAH, "Food", "AUCHAN", user2));
        orderTreeSet.add(new Order(41, 400, UAH, "Barbie", "Rozetka", user8));
        orderTreeSet.add(new Order(1254, 850, UAH, "Desk", "AUCHAN", user4));
        orderTreeSet.add(new Order(851, 500, USD, "Notebook", "Rozetka", user3));
        orderTreeSet.add(new Order(36, 600, UAH, "Armchair", "Rozetka", user10));
        orderTreeSet.add(new Order(54, 250, USD, "Bicycle", "Rozetka", user6));

        System.out.println("Check for equality of last name 'Petrov' -  " + checkForUserLastName(orderTreeSet));

        TreeSet<Order> largestPrice = new TreeSet<>(orderTreeSet);
        System.out.println("Order with largest price is " + largestPrice.first());

        System.out.println("Set with deleted orders, that contain currency USD: " + deleteOrdersWithUSD(orderTreeSet));

    }
     private static boolean checkForUserLastName(Set<Order> orders) {
        String lastNameForCheck = "Petrov";
        Iterator<Order> lastName = orders.iterator();
        while (lastName.hasNext()) {
            User user = lastName.next().getUser();
            if (user.getLastName().contains(lastNameForCheck)) {
                return true;
            }
        }
        return false;
    }

    private static Set<Order> deleteOrdersWithUSD(Set<Order> orders) {
        Set<Order> result = new TreeSet<>(orders);
        Iterator<Order> iterator = result.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getCurrency().equals(Currency.USD)) {
                iterator.remove();
            }
        }
        return result;
    }
}
