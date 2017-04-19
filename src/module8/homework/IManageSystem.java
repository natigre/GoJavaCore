package module8.homework;

import java.util.*;

public interface IManageSystem<T> {
    T save(T obj, double price);
    T save(T obj);
    void delete(T obj) ;
    void deleteById(int id);
    T get(int id);
    Double getPrice(T obj);
    Set<T> getProducts();
    List<Double> getPrices();

    void printProductsSortedByName();
    void printProductsSortedByPrice();

}
