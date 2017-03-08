package module6.homework.task1;

import java.util.Arrays;

public final class ArraysUtils {

    public static int getSumOfElements(int[] intArray) {
        int sum = 0;
        if (intArray != null) {
            for (int i = 0; i < intArray.length; i++) {
                sum += intArray[i];
            }
        } else {
            System.out.print("No array is provided. ");
        }
        return sum;
    }

    public static int getMinElement(int[] intArray) {
        int min = intArray[0];
        if (intArray != null) {
            for (int i = 0; i <= intArray.length - 1; i++) {
                if (intArray[i] < min) {
                    min = intArray[i];
                }
            }
        } else {
            System.out.print("No array is provided. ");
        }
        return min;
    }

    public static int getMaxElement(int[] intArray) {
        int max = intArray[0];
        if (intArray != null) {
            for (int i = 0; i <= intArray.length - 1; i++) {
                if (intArray[i] > max) {
                    max = intArray[i];
                }
            }
        } else {
            System.out.print("No array is provided. ");
        }
        return max;
    }

    public static int getMaxPositiveElement(int[] intArray) {
        int maxPositive = intArray[0];
        if (intArray != null)
            for (int i = 0; i <= intArray.length - 1; i++) {
                if (intArray[i] > 0 && intArray[i] > maxPositive) {
                    maxPositive = intArray[i];
                }
            }
        else {
            System.out.print("No array is provided. ");
        }
        return maxPositive;
    }

    public static int getMiltiplicatoinOfElements(int[] intArray) {
        int multiplication = 1;
        if (intArray != null) {
            for (int i = 0; i < intArray.length; i++) {
                multiplication *= intArray[i];
            }
        } else {
            System.out.print("No array is provided. ");
            return 0;
        }
        return multiplication;
    }

    public static int getModulus(int[] intArray) {
        int c = 0;
        if (intArray != null) {
            if (intArray[intArray.length - 1] == 0) {
                System.out.println("NO");
            } else {
                c = intArray[0] % intArray[intArray.length - 1];
            }
        } else {
            System.out.print("No array is provided. ");
        }
        return c;
    }

    public static int getSecondLargestElement(int[] intArray) {
        if (intArray != null) {
            for (int i = intArray.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (intArray[j] > intArray[j + 1]) {
                        int tmp = intArray[j + 1];
                        intArray[j + 1] = intArray[j];
                        intArray[j] = tmp;
                    }
                }
            }
        } else {
            System.out.print("No array is provided. ");
        }
        return intArray[intArray.length - 2];
    }

    public static int[] reverse(int[] intArray) {
        int[] reverseintArray = new int[intArray.length];
        if (intArray != null) {
            for (int i = 0; i <= intArray.length / 2; i++) {
                reverseintArray[i] = intArray[intArray.length - i - 1];
                reverseintArray[intArray.length - i - 1] = intArray[i];
            }
        } else {
            System.out.print("No array is provided. ");
        }
        return reverseintArray;
    }

    public static int[] findEvenElements(int[] intArray) {
        int[] evenElementsOfArray = new int[0];
        if (intArray != null) {
            for (int i = 0; i < intArray.length / 2; i++) {
                if (intArray[i] % 2 == 0) {
                    evenElementsOfArray = Arrays.copyOf(evenElementsOfArray, evenElementsOfArray.length + 1);
                    evenElementsOfArray[evenElementsOfArray.length - 1] = intArray[i];
                }
            }
        }
        return evenElementsOfArray;
    }
}
