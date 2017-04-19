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
            public int compare(Food o1, Food o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Food food : sortByName) {
            System.out.println(food);
        }
    }

    @Override
    public void printProductsSortedByPrice() {
        Set<Map.Entry<Food, Double>> sortByPrices = new TreeSet<>(new Comparator<Map.Entry<Food, Double>>() {
            @Override
            public int compare(Map.Entry<Food, Double> o1, Map.Entry<Food, Double> o2) {
                if (o1.getValue().compareTo(o2.getValue()) == 0) {
                    return o1.getKey().getName().compareTo(o2.getKey().getName());
                }
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        sortByPrices.addAll(database.entrySet());
        for (Map.Entry<Food, Double> sortByPrice : sortByPrices) {
            System.out.println(sortByPrice.getKey() + " " + sortByPrice.getValue());
        }
    }
}
