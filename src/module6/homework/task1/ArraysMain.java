package module6.homework.task1;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        int[] intArray = {-44, 75, 6, 8, -17, -25, 29, 68, 32, 10};

        System.out.println("The sum elements of intArray is: " + ArraysUtils.getSumOfElements(intArray));

        System.out.println("The minimum element of intArray is: " + ArraysUtils.getMinElement(intArray));

        System.out.println("The maximum element of intArray is: " + ArraysUtils.getMaxElement(intArray));

        System.out.println("The maximum positive element of intArray is: " + ArraysUtils.getMaxPositiveElement(intArray));

        System.out.println("The multiplication of elements of intArray is: " +
                ArraysUtils.getMiltiplicatoinOfElements(intArray));

        System.out.println("The modulus of elements of intArray is: " + ArraysUtils.getModulus(intArray));

        System.out.println("The second largest element of intArray is : " +
                ArraysUtils.getSecondLargestElement(intArray));

        int[] reverseintArray = ArraysUtils.reverse(intArray);
        System.out.println("Reverse array = " + Arrays.toString(reverseintArray));

        int[] evenElementsOfArray = ArraysUtils.findEvenElements(intArray);
        System.out.println("Even elements = " + Arrays.toString(evenElementsOfArray));


    }


}
