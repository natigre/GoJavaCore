package module8.homework;

import java.util.*;

public class IManageSystemImpl implements IManageSystem<Food> {

    private Map<Food, Double> database = new HashMap<>();

    @Override
    public Food save(Food obj, double price) {
        database.put(obj, price);
        return obj;
    }

    @Override
    public Food save(Food obj) {
        database.put(obj, null);
        return obj;
    }

    @Override
    public void delete(Food obj) {
        database.remove(obj);
        for (Food food : database.keySet()) {
            System.out.println(food);
        }
    }

    @Override
    public void deleteById(int id) {
        Iterator<Food> foodIterator = database.keySet().iterator();
        while (foodIterator.hasNext()) {
            Food next = foodIterator.next();
            if (next.getId() == id) {
                foodIterator.remove();
                System.out.println("This product was deleted ");
            } else {
                System.out.println("This id was not found ");
            }
        }
    }

    @Override
    public Food get(int id) {
        Set<Map.Entry<Food, Double>> entries = database.entrySet();
        for (Map.Entry<Food, Double> entry : entries) {
            if (entry.getKey().getId() == id) {
                return entry.getKey();
            }
        }
        return null;
    }

    @Override
    public Double getPrice(Food obj) {
        Set<Map.Entry<Food, Double>> entries = database.entrySet();
        for (Map.Entry<Food, Double> entry : entries) {
            if (entry.getKey().equals(obj)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public Set<Food> getProducts() {
        Set<Food> foods = new HashSet<>(database.keySet());
        for (Food food : foods) {
            System.out.println(food);
        }
        return foods;
    }

    @Override
    public List<Double> getPrices() {
        List<Double> newList = new ArrayList<>(database.values());
        for (Double aDouble : newList) {
            System.out.println(aDouble);
        }
        return newList;
    }

    @Override
    public void printProductsSortedByName() {
        List<Food> sortByName = new ArrayList<>(database.keySet());
        Collections.sort(sortByName, new Comparator<Food>() {
            @Override
            public int compare(Food food1, Food food2) {
                return food1.getName().compareTo(food2.getName());
            }
        });
        for (Food food : sortByName) {
            System.out.println(food);
        }
    }

    @Override
    public void printProductsSortedByPrice() {
        List<Map.Entry<Food, Double>> sotrByPrice = new ArrayList<>(database.entrySet());
        for (Map.Entry<Food, Double> entry : sotrByPrice) {
            if (entry.getValue() == null) {
                entry.setValue(0d);
            }
        }
        sotrByPrice.sort(new Comparator<Map.Entry<Food, Double>>() {
            @Override
            public int compare(Map.Entry<Food, Double> o1, Map.Entry<Food, Double> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for (Map.Entry<Food, Double> databaseByPrice : sotrByPrice) {
            System.out.println(databaseByPrice.getKey() + " " + databaseByPrice.getValue());
        }
    }
}

