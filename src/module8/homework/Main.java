package module8.homework;

import static module8.homework.Country.*;

public class Main {
    public static void main(String[] args) {
        Food goods1 = new Food("Milk", POLAND, 12);
        Food goods2 = new Food("Potatoes", USA, 150);
        Food goods3 = new Food("Cookies", UKRAINE, 360);
        Food goods4 = new Food("Banana", CHILY, 48);
        Food goods5 = new Food("Pasta", ITALY, 720);

        IManageSystemImpl foodManageSystem = new IManageSystemImpl();
        foodManageSystem.save(goods1, 23);
        foodManageSystem.save(goods2, 6.6);
        foodManageSystem.save(goods3, 27.9);
        foodManageSystem.save(goods4, 29);
        foodManageSystem.save(goods5);

        System.out.println("Save products with price:");
        System.out.println(foodManageSystem.save(goods5, 18.9));
        System.out.println();

        System.out.println("Save products without price:");
        System.out.println(foodManageSystem.save(goods4));
        System.out.println();

        System.out.println("Delete specific product");
        foodManageSystem.delete(goods3);
        System.out.println();

        System.out.println("Delete product by id:");
        foodManageSystem.deleteById(0);
        System.out.println();

        System.out.println("Get products by specific id:");
        System.out.println(foodManageSystem.get(2));
        System.out.println();

        System.out.println("Get price specific product:");
        Double price1 = foodManageSystem.getPrice(goods5);
        System.out.println(price1);
        System.out.println();

        System.out.println("Get all products:");
        foodManageSystem.getProducts();
        System.out.println();

        System.out.println("Get all prices of products:");
        foodManageSystem.getPrices();
        System.out.println();

        System.out.println("Sorted products by increase name:");
        foodManageSystem.printProductsSortedByName();
        System.out.println();

        System.out.println("Sorted products by increase price:");
        foodManageSystem.printProductsSortedByPrice();
    }
}
