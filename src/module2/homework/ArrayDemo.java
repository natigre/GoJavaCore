package module2.homework;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] array = {-44, 75, 6, 8, -17, -25, 29, 68, 32, 10};
        double[] array2 = {3.6, -2.6, -7.2, 8.5, 16.3, -6.4, 1.9, -5.7, 4.5, 9.7};

        System.out.println("Сумма int array: " + sum(array));
        System.out.println("Сумма double array2: " + sum(array2));
        System.out.println("Минимум int array: " + min(array));
        System.out.println("Минимум double array2: " + min(array2));
        System.out.println("Максимум int array: " + max(array));
        System.out.println("Максимум double array2: " + max(array2));
        System.out.println("Максимально позитивный элемент int array: " + maxPositive(array));
        System.out.println("Максимально позитивный элемент double array2: " + maxPositive(array2));
        System.out.println("Произведение элементов int array: " + miltiplicatoin(array));
        System.out.println("Произведение элементов double array2: " + miltiplicatoin(array2));
        System.out.println("Остаток от деления элементов int array: " + modulus(array));
        System.out.println("Остаток от деления элементов double array2: " + modulus(array2));
        System.out.println("Второй наибольший элемент в массиве array: " + secondLargest(array));
        System.out.println("Второй наибольший элемент в массиве array2: " + secondLargest(array2));

    }

    //Считаем сумму всех элементов массива array
    static int sum(int array[]) {
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa += array[i];
        }
        return summa;
    }

    //Считаем сумму всех элементов массива array2
    static double sum(double array2[]) {
        double summa = 0;
        for (int i = 0; i < array2.length; i++) {
            summa += array2[i];
        }
        return summa;

    }

    //Находим min элемент в массиве array
    static int min(int array[]) {
        int min = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    //Находим min элемент в массиве array2
    static double min(double array2[]) {
        double min = array2[0];
        for (int i = 0; i <= array2.length - 1; i++) {
            if (array2[i] < min) {
                min = array2[i];
            }
        }
        return min;
    }

    //Находим max элемент в массиве array
    static int max(int array[]) {
        int max = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //Находим max элемент в массиве array2
    static double max(double array2[]) {
        double max = array2[0];
        for (int i = 0; i <= array2.length - 1; i++) {
            if (array2[i] > max) {
                max = array2[i];
            }
        }
        return max;
    }

    //Находим maxPositive массива array
    static int maxPositive(int array[]) {
        int maxP = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > 0 && array[i] > maxP) {
                maxP = array[i];
            }
        }
        return maxP;
    }

    //Находим maxPositive массива array2
    static double maxPositive(double array2[]) {
        double maxP = array2[0];
        for (int i = 0; i <= array2.length - 1; i++)
            if (array2[i] > 0 && array2[i] > maxP) {
                maxP = array2[i];
            }
        return maxP;
    }

    //Находим произведение элементов в массиве array
    static int miltiplicatoin(int array[]) {
        int multiply = 1;
        for (int i = 0; i < array.length; i++) {
            multiply *= array[i];
        }
        return multiply;
    }

    //Находим произведение элементов в массиве array2
    static double miltiplicatoin(double array2[]) {
        double multiply = 1;
        for (int i = 0; i < array2.length; i++) {
            multiply *= array2[i];
        }
        return multiply;
    }

    //Находим остаток от деления первого и последнего элемента массива array
    static int modulus(int array[]) {
        int a = array[0];
        int b = array[array.length - 1];
        int c = a % b;
        return c;
    }

    //Находим остаток от деления первого и последнего элемента массива array2
    static double modulus(double array2[]) {
        double mod = 0;
        mod = array2[0] % array2[array2.length - 1];
        return mod;
    }

    //Находим второй наибольший элемент в массиве array
    static int secondLargest(int array[]) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array[array.length - 2];
    }

    //Находим второй наибольший элемент в массиве array2
    static double secondLargest(double array2[]) {
        for (int i = array2.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++) {
                if (array2[j] > array2[j + 1]) {
                    double tmp = array2[j + 1];
                    array2[j + 1] = array2[j];
                    array2[j] = tmp;
                }
            }
        return array2[array2.length - 2];
    }

}

