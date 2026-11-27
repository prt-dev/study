// Exercise 1: Find the largest number
// Exercise 2: Reverse an array

import java.util.Arrays;

public class array_problems {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        System.out.println(Arrays.toString(reverseArray(numbers)));
    }

    public static int[] reverseArray(int[] arr) {

        int arrL = arr.length;
        for (int i = 0; i < arrL - 1 - i; i++) {
            int tem = arr[i];
            arr[i] = arr[arrL - 1 - i];
            arr[arrL - 1 - i] = tem;

        }

        return arr;
    }
}
