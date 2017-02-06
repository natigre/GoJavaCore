package module2.homework;

import java.util.Arrays;

public class ArrayArithmeticActions {
    public static void main(String[] args) {

        int[] intArray = {-44, 75, 6, 8, -17, -25, 29, 68, 32, 10};
        double[] doubleArray = {3.6, -2.6, -7.2, 8.5, 16.3, -6.4, 1.9, -5.7, 4.5, 9.7};

        System.out.println("The elements of int intArray: " + Arrays.toString(intArray));
        System.out.println("The elements of double doubleArray: " + Arrays.toString(doubleArray));

        System.out.println("===================================");

        System.out.println("The sum elements of intArray is: " + getsumOfElements(intArray));
        System.out.println("The sum elements of doubleArray is: " + getsumOfElements(doubleArray));
        System.out.println("The minimum element of intArray is: " + getminElement(intArray));
        System.out.println("The minimum element of doubleArray: " + getminElement(doubleArray));
        System.out.println("The maximum element of intArray is: " + getmaxElement(intArray));
        System.out.println("The maximum element  of doubleArray: " + getmaxElement(doubleArray));
        System.out.println("The maximum positive element of intArray is: " + getmaxPositiveElement(intArray));
        System.out.println("The maximum positive element of doubleArray is: " + getmaxPositiveElement(doubleArray));
        System.out.println("The multiplication of elements of intArray is: " + getmiltiplicatoinOfElements(intArray));
        System.out.println("The multiplication of elements of doubleArray is: " + getmiltiplicatoinOfElements(doubleArray));
        System.out.println("The modulus of elements of intArray is: " + getModulus(intArray));
        System.out.println("The modulus of elements of doubleArray is: " + getModulus(doubleArray));
        System.out.println("The second largest element of intArray is : " + getSecondLargestElement(intArray));
        System.out.println("The second largest element of doubleArray is: " + getSecondLargestElement(doubleArray));

    }

    static int getsumOfElements(int intArray[]) {
        int sum = 0;
        if (intArray != null) {
            for (int i = 0; i < intArray.length; i++) {
                sum += intArray[i];
            }
        }
        return sum;
    }

    static double getsumOfElements(double doubleArray[]) {
        double sum = 0;
        if (doubleArray != null) {
            for (int i = 0; i < doubleArray.length; i++) {
                sum += doubleArray[i];
            }
        }
        return sum;

    }

    static int getminElement(int intArray[]) {
        int min = intArray[0];
        if (intArray != null) {
            for (int i = 0; i <= intArray.length - 1; i++) {
                if (intArray[i] < min) {
                    min = intArray[i];
                }
            }
        }
        return min;

    }

    static double getminElement(double doubleArray[]) {
        double min = doubleArray[0];
        if (doubleArray != null) {
            for (int i = 0; i <= doubleArray.length - 1; i++) {
                if (doubleArray[i] < min) {
                    min = doubleArray[i];
                }
            }
        }
        return min;
    }

    static int getmaxElement(int intArray[]) {
        int max = intArray[0];
        if (intArray != null) {
            for (int i = 0; i <= intArray.length - 1; i++) {
                if (intArray[i] > max) {
                    max = intArray[i];
                }
            }
        }
        return max;
    }

    static double getmaxElement(double doubleArray[]) {
        double max = doubleArray[0];
        if (doubleArray != null) {
            for (int i = 0; i <= doubleArray.length - 1; i++) {
                if (doubleArray[i] > max) {
                    max = doubleArray[i];
                }
            }
        }
        return max;
    }

    static int getmaxPositiveElement(int intArray[]) {
        int maxPositive = intArray[0];
        if (intArray != null) {
            for (int i = 0; i <= intArray.length - 1; i++) {
                if (intArray[i] > 0 && intArray[i] > maxPositive) {
                    maxPositive = intArray[i];
                }
            }
        }
        return maxPositive;
    }

    static double getmaxPositiveElement(double doubleArray[]) {
        double maxPositive = doubleArray[0];
        if (doubleArray != null)
            for (int i = 0; i <= doubleArray.length - 1; i++)
                if (doubleArray[i] > 0 && doubleArray[i] > maxPositive) {
                    maxPositive = doubleArray[i];
                }
        return maxPositive;
    }

    static int getmiltiplicatoinOfElements(int intArray[]) {
        int multiplication = 1;
        if (intArray != null) {
            for (int i = 0; i < intArray.length; i++) {
                multiplication *= intArray[i];
            }
        }
        return multiplication;
    }

    static double getmiltiplicatoinOfElements(double doubleArray[]) {
        double multiplication = 1;
        if (doubleArray != null) {
            for (int i = 0; i < doubleArray.length; i++) {
                multiplication *= doubleArray[i];
            }
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
        }
        return doubleArray[doubleArray.length - 2];
    }
}

