package module2.homework;

import java.util.Arrays;

public class ArrayArithmeticActions {
    public static void main(String[] args) {

        int[] intArray = {-44, 75, 6, 8, -17, -25, 29, 68, 32, 10};
//        int[] intArray = null;
        double[] doubleArray = {3.6, -2.6, -7.2, 8.5, 16.3, -6.4, 1.9, -5.7, 4.5, 9.7};

        System.out.println("The elements of int intArray: " + Arrays.toString(intArray));
        System.out.println("The elements of double doubleArray: " + Arrays.toString(doubleArray));

        System.out.println("===================================");

        System.out.println("The sum elements of intArray is: " + getSumOfElements(intArray));
        System.out.println("The sum elements of doubleArray is: " + getSumOfElements(doubleArray));
        System.out.println("The minimum element of intArray is: " + getMinElement(intArray));
        System.out.println("The minimum element of doubleArray: " + getMinElement(doubleArray));
        System.out.println("The maximum element of intArray is: " + getMaxElement(intArray));
        System.out.println("The maximum element  of doubleArray: " + getMaxElement(doubleArray));
        System.out.println("The maximum positive element of intArray is: " + getMaxPositiveElement(intArray));
        System.out.println("The maximum positive element of doubleArray is: " + getMaxPositiveElement(doubleArray));
        System.out.println("The multiplication of elements of intArray is: " + getMiltiplicatoinOfElements(intArray));
        System.out.println("The multiplication of elements of doubleArray is: " + getMiltiplicatoinOfElements(doubleArray));
        System.out.println("The modulus of elements of intArray is: " + getModulus(intArray));
        System.out.println("The modulus of elements of doubleArray is: " + getModulus(doubleArray));
        System.out.println("The second largest element of intArray is : " + getSecondLargestElement(intArray));
        System.out.println("The second largest element of doubleArray is: " + getSecondLargestElement(doubleArray));

    }

    static int getSumOfElements(int intArray[]) {
        int sum = 0;
        if (intArray != null) {
            for (int i = 0; i < intArray.length; i++) {
                sum += intArray[i];
            }
        } else {
            System.out.println("No array is provided");
        }
        return sum;
    }

    static double getSumOfElements(double doubleArray[]) {
        double sum = 0;
        if (doubleArray != null) {
            for (int i = 0; i < doubleArray.length; i++) {
                sum += doubleArray[i];
            }
        } else {
            System.out.println("No array is provided");
        }
        return sum;
    }

    static int getMinElement(int intArray[]) {
        int min = 0;
        if (intArray != null) {
            for (int i = 0; i <= intArray.length - 1; i++) {
                if (intArray[i] < min) {
                    min = intArray[i];
                }
            }
        } else {
            System.out.println("No array is provided");
        }
        return min;
    }

    static double getMinElement(double doubleArray[]) {
        double min = 0;
        if (doubleArray != null) {
            for (int i = 0; i <= doubleArray.length - 1; i++) {
                if (doubleArray[i] < min) {
                    min = doubleArray[i];
                }
            }
        } else {
            System.out.println("No array is provided");
        }
        return min;
    }

    static int getMaxElement(int intArray[]) {
        int max = 0;
        if (intArray != null) {
            for (int i = 0; i <= intArray.length - 1; i++) {
                if (intArray[i] > max) {
                    max = intArray[i];
                }
            }
        } else {
            System.out.println("No array is provided");
        }
        return max;
    }

    static double getMaxElement(double doubleArray[]) {
        double max = 0;
        if (doubleArray != null) {
            for (int i = 0; i <= doubleArray.length - 1; i++) {
                if (doubleArray[i] > max) {
                    max = doubleArray[i];
                }
            }
        } else {
            System.out.println("No array is provided");
        }
        return max;
    }

    static int getMaxPositiveElement(int intArray[]) {
        int maxPositive = 0;
        if (intArray != null)
            for (int i = 0; i <= intArray.length - 1; i++) {
                if (intArray[i] > 0 && intArray[i] > maxPositive) {
                    maxPositive = intArray[i];
                }
            }
        else {
            System.out.println("No array is provided");
        }
        return maxPositive;
    }

    static double getMaxPositiveElement(double doubleArray[]) {
        double maxPositive = 0;
        if (doubleArray != null) {
            for (int i = 0; i <= doubleArray.length - 1; i++)
                if (doubleArray[i] > 0 && doubleArray[i] > maxPositive) {
                    maxPositive = doubleArray[i];
                }
        } else {
            System.out.println("No array is provided");
        }
        return maxPositive;
    }

    static int getMiltiplicatoinOfElements(int intArray[]) {
        int multiplication = 1;
        if (intArray != null)
            if (intArray != null) {
                for (int i = 0; i < intArray.length; i++) {
                    multiplication *= intArray[i];
                }
            } else {
                System.out.println("No array is provided");
            }
        return multiplication;
    }

    static double getMiltiplicatoinOfElements(double doubleArray[]) {
        double multiplication = 1;
        if (doubleArray != null) {
            for (int i = 0; i < doubleArray.length; i++) {
                multiplication *= doubleArray[i];
            }
        } else {
            System.out.println("No array is provided");
        }
        return multiplication;
    }

    static int getModulus(int intArray[]) {
        int c = 0;
        if (intArray != null) {
            if (intArray[intArray.length - 1] == 0) {
                System.out.println("NO");
            } else {
                c = intArray[0] % intArray[intArray.length - 1];
            }
        } else {
            System.out.println("No array is provided");
        }
        return c;
    }

    static double getModulus(double doubleArray[]) {
        double mod = 0;
        if (doubleArray != null) {
            if (doubleArray[doubleArray.length - 1] == 0) {
                System.out.println("NO");
            } else {
                mod = doubleArray[0] % doubleArray[doubleArray.length - 1];
            }
        } else {
            System.out.println("No array is provided");
        }
        return mod;
    }

    static int getSecondLargestElement(int intArray[]) {
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
            System.out.println("No array is provided");
        }
        return intArray[intArray.length - 2];
    }

    static double getSecondLargestElement(double doubleArray[]) {
        if (doubleArray != null) {
            for (int i = doubleArray.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (doubleArray[j] > doubleArray[j + 1]) {
                        double tmp = doubleArray[j + 1];
                        doubleArray[j + 1] = doubleArray[j];
                        doubleArray[j] = tmp;
                    }
                }
            }
        } else {
            System.out.println("No array is provided");
        }
        return doubleArray[doubleArray.length - 2];
    }
}

