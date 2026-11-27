import java.util.Arrays;

public class array_loop {
    public static void main(String[] args) {
        int[] arr1 = new int[3]; // [1,2,3]
        int[][] arr = new int[3][3];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; i++) {
                arr[i][j] = i + j + 1;
            }
        }

        // arr1[0] = 1;
        // arr1[1] = 2;
        // arr1[2] = 3;

        // arr[0][0] = 1;
        // arr[0][1] = 2;
        // arr[0][2] = 3;
        // arr[1][0] = 4;
        // arr[1][1] = 5;
        // arr[1][2] = 6;
        // arr[2][0] = 7;
        // arr[2][1] = 8;
        // arr[2][2] = 9;

        System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.deepToString(arr));
    }
}