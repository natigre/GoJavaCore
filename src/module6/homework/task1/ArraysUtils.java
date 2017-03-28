package module6.homework.task1;

import java.util.Arrays;

public final class ArraysUtils {

    public static int getSumOfElements(int[] array) {
        int sum = 0;
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
        } else {
            System.out.print("No array is provided. ");
        }
        return sum;
    }

    public static int getMinElement(int[] array) {
        int min = array[0];
        if (array != null) {
            for (int i = 0; i <= array.length - 1; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
        } else {
            System.out.print("No array is provided. ");
        }
        return min;
    }

    public static int getMaxElement(int[] array) {
        int max = array[0];
        if (array != null) {
            for (int i = 0; i <= array.length - 1; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        } else {
            System.out.print("No array is provided. ");
        }
        return max;
    }

    public static int getMaxPositiveElement(int[] array) {
        int maxPositive = array[0];
        if (array != null)
            for (int i = 0; i <= array.length - 1; i++) {
                if (array[i] > 0 && array[i] > maxPositive) {
                    maxPositive = array[i];
                }
            }
        else {
            System.out.print("No array is provided. ");
        }
        return maxPositive;
    }

    public static int getMiltiplicatoinOfElements(int[] array) {
        if (array != null) {
        int multiplication = 1;
            for (int i = 0; i < array.length; i++) {
                multiplication *= array[i];
            }
            return multiplication;
        } else {
            System.out.print("No array is provided. ");
            return 0;
        }
    }

    public static int getModulus(int[] array) {
        int result = 0;
        if (array != null) {
            if (array[array.length - 1] == 0) {
                System.out.println("NO");
            } else {
                result = array[0] % array[array.length - 1];
            }
        } else {
            System.out.print("No array is provided. ");
        }
        return result;
    }

    public static int getSecondLargestElement(int[] array) {
        if (array != null) {
            for (int i = array.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        int tmp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        } else {
            System.out.print("No array is provided. ");
        }
        return array[array.length - 2];
    }

    public static int[] reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        if (array != null) {
            for (int i = 0; i <= array.length / 2; i++) {
                reverseArray[i] = array[array.length - i - 1];
                reverseArray[array.length - i - 1] = array[i];
            }
        } else {
            System.out.print("No array is provided. ");
        }
        return reverseArray;
    }

    public static int[] findEvenElements(int[] array) {
        int[] evenElementsOfArray = new int[0];
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    evenElementsOfArray = Arrays.copyOf(evenElementsOfArray, evenElementsOfArray.length + 1);
                    evenElementsOfArray[evenElementsOfArray.length - 1] = array[i];
                }
            }
        } else {
        System.out.print("No array is provided. ");
    }
        return evenElementsOfArray;
    }
}
