import java.util.Arrays;
import java.util.ArrayList;

public class array {
    static void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {

        // 1. Creating an array and Initializing array elements
        // int[] marks = {80, 90, 75, 95};

        // int[] numbers = new int[3];

        // numbers[0] = 10;
        // numbers[1] = 20;
        // numbers[2] = 30;

        // 2. Important: Does Java pass arrays by reference?
        // Java is always pass-by-value.
        // printNumbers(marks);

        // Two-dimensional arrays
        // int[][] matrix = {
        // {10, 20, 30, 40}, (0,0),(0,1),(0,2),(0,3)
        // {40, 50, 60}, (1,0),(1,1),(1,2)
        // {70, 80, 90} (2,0),(2,1),(2,2)
        // };

        // int[][] data = {
        // {10, 20},
        // {30, 40, 50},
        // {60}
        // };

        // System.out.println(Arrays.toString(numbers));

        // If you want an array-like structure whose size can change dynamically, Java
        // provides ArrayList.
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        numbers.add(50); // Add
        numbers.remove(0); // Remove first element
        numbers.set(0, 100); // Modify element
        // System.out.println(Arrays.toString(numbers));
        // To print an ArrayList, pass it directly to System.out.println()—it already
        // has its own built-in .toString() method.

        System.out.println(numbers);
    }
}