package module7.homework.task4;

import java.util.*;

public class TestingTimeOfWorkArrayListAndLinkedList {
    public static void main(String[] args) {
        List<Integer> integerArrayListSmall = new ArrayList<Integer>();
        List<Integer> integersArrayListBig = new ArrayList<Integer>();
        List<Integer> integerLinkedListSmall = new LinkedList<Integer>();
        List<Integer> integerLinkedListBig = new LinkedList<Integer>();

        List<String> stringArrayListSmall = new ArrayList<String>();
        List<String> stringArrayListBig = new ArrayList<String>();
        List<String> stringLinkedListSmall = new LinkedList<String>();
        List<String> stringLinkedListBig = new LinkedList<String>();

        addNewIntegersToList(integerArrayListSmall, 1000);
        addNewIntegersToList(integerLinkedListSmall, 1000);
        addNewIntegersToList(integersArrayListBig, 10000);
        addNewIntegersToList(integerLinkedListBig, 10000);

        addNewStringsToList(stringArrayListSmall, 1000);
        addNewStringsToList(stringLinkedListSmall, 1000);
        addNewStringsToList(stringArrayListBig, 10000);
        addNewStringsToList(stringLinkedListBig, 10000);

        setNewElementToList(integerArrayListSmall, 1000);
        setNewElementToList(integerLinkedListSmall, 1000);
        setNewElementToList(integersArrayListBig, 10000);
        setNewElementToList(integerLinkedListBig, 10000);

        setNewElementToList(stringArrayListSmall, 1000);
        setNewElementToList(stringLinkedListSmall, 1000);
        setNewElementToList(stringArrayListBig, 10000);
        setNewElementToList(stringLinkedListBig, 10000);

        getElementFromList(integerArrayListSmall, 1000);
        getElementFromList(integerLinkedListSmall, 1000);
        getElementFromList(integersArrayListBig, 10000);
        getElementFromList(integerLinkedListBig, 10000);

        getElementFromList(stringArrayListSmall, 1000);
        getElementFromList(stringLinkedListSmall, 1000);
        getElementFromList(stringArrayListBig, 10000);
        getElementFromList(stringLinkedListBig, 10000);

        removeElementsFromList(integerArrayListSmall, 1000);
        removeElementsFromList(integerLinkedListSmall, 1000);
        removeElementsFromList(integersArrayListBig, 10000);
        removeElementsFromList(integerLinkedListBig, 10000);

        removeElementsFromList(stringArrayListSmall, 1000);
        removeElementsFromList(stringLinkedListSmall, 1000);
        removeElementsFromList(stringArrayListBig, 10000);
        removeElementsFromList(stringLinkedListBig, 10000);
    }

    private static void addNewStringsToList(List<String> list, int numberOfElements) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfElements; i++) {
            list.add("Test" + i);
        }
        long finishTime = System.currentTimeMillis() - startTime;
        System.out.println("Adding String, " + (list instanceof ArrayList ? "ArrayList from " : "LinkedList from ") + numberOfElements + " items. Runtime " + finishTime);
    }

    private static void addNewIntegersToList(List<Integer> list, int numberOfElements) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(i);
        }
        long finishTime = System.currentTimeMillis() - startTime;
        System.out.println("Adding Integer, " + (list instanceof ArrayList ? "ArrayList from " : "LinkedList from ") + numberOfElements + " items. Runtime " + finishTime);
    }

    private static void setNewElementToList(List list, int numberOfElements) {
        if (list.isEmpty()) {
            System.out.println("First, fill in the list!");
            return;
        }
        if (list.get(0) instanceof String) {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < numberOfElements; i++) {
                list.set(i, "New Text" + i);
            }
            long finishTime = System.currentTimeMillis() - startTime;
            System.out.println("Set new String, " + (list instanceof ArrayList ? "ArrayList from " : "LinkedList from ") + numberOfElements + " items. Runtime " + finishTime);
        }
        if (list.get(0) instanceof Integer) {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < numberOfElements; i++) {
                list.set(i, numberOfElements - i);
            }
            long finishTime = System.currentTimeMillis() - startTime;
            System.out.println("Set new Integer, " + (list instanceof ArrayList ? "ArrayList from " : "LinkedList from ") + numberOfElements + " items. Runtime " + finishTime);
        }
    }

    private static void getElementFromList(List list, int numberOfElements) {
        if (list.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        if (list.get(0) instanceof String) {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < numberOfElements; i++) {
                list.get(i);
            }
            long finishTime = System.currentTimeMillis() - startTime;
            System.out.println("Get the values of the index from String, " + (list instanceof ArrayList ? "ArrayList from " : "LinkedList from ") + numberOfElements + " items. Runtime" + finishTime);
        }
        if (list.get(0) instanceof Integer) {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < numberOfElements; i++) {
                list.get(i);
            }
            long finishTime = System.currentTimeMillis() - startTime;
            System.out.println("Get the values of the index from Integer, " + (list instanceof ArrayList ? "ArrayList from " : "LinkedList from ") + numberOfElements + " items. Runtime" + finishTime);
        }
    }

    private static void removeElementsFromList(List list, int numberOfElements) {
        if (list.isEmpty()) {
            System.out.println("There's nothing to delete, the list is empty!");
            return;
        }

        if (!(list.isEmpty()) && list.get(0) instanceof String) {
            long startTime = System.currentTimeMillis();
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
            long finishTime = System.currentTimeMillis() - startTime;
            System.out.println("Delete list items String, " + (list instanceof ArrayList ? "ArrayList from " : "LinkedList from ") + numberOfElements + " items. Runtime " + finishTime);
        }
        if (!(list.isEmpty()) && list.get(0) instanceof Integer) {
            long startTime = System.currentTimeMillis();
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
            long finishTime = System.currentTimeMillis() - startTime;
            System.out.println("Delete list items Integer, " + (list instanceof ArrayList ? "ArrayList from " : "LinkedList from ") + numberOfElements + " items. Runtime " + finishTime);
        }
    }
}

