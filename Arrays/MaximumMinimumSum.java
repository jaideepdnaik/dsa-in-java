//Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.


import java.util.Scanner;

public class MaximumMinimumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println(maxminSum(arr));
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(maxminSum(arr, n));
    }

    static int maxminSum(int[] array, int n) {

        int max = array[0];
        int min = array[0];

        //Check Maximum
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }


        //Check minimum
        for (int i = 0; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return max + min;
    }
}