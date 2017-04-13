package module6.homework.task1;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        int[] array = {-44, 75, 6, 8, -17, -25, 29, 68, 32, 10};

        System.out.println("The sum elements of array is: " + ArraysUtils.getSumOfElements(array));

        System.out.println("The minimum element of array is: " + ArraysUtils.getMinElement(array));

        System.out.println("The maximum element of array is: " + ArraysUtils.getMaxElement(array));

        System.out.println("The maximum positive element of array is: " + ArraysUtils.getMaxPositiveElement(array));

        System.out.println("The multiplication of elements of array is: " +
                ArraysUtils.getMiltiplicatoinOfElements(array));

        System.out.println("The modulus of elements of array is: " + ArraysUtils.getModulus(array));

        System.out.println("The second largest element of array is: " +
                ArraysUtils.getSecondLargestElement(array));

        int[] reverseArray = ArraysUtils.reverse(array);
        System.out.println("The reverse array is: " + Arrays.toString(reverseArray));

        int[] evenElementsOfArray = ArraysUtils.findEvenElements(array);
        System.out.println("The even elements of array is : = " + Arrays.toString(evenElementsOfArray));


    }


}
