import java.util.Arrays;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] array = {5, 4, -1, 7, 8};
        System.out.println(maximumSubarraySum(array));


//        int[] subArray = Arrays.copyOfRange(array, 1, 5);
//        System.out.println(Arrays.toString(subArray));
//
//
//        int startIndex = 1;
//        int endIndex = 6;
//        int subArrayLength = endIndex - startIndex + 1;
//
//        int[] newSubArray = new int[subArrayLength];
//
//        for (int i = startIndex; i <= endIndex; i++) {
//            newSubArray[i - startIndex] = array[i];
//        }
//
//        System.out.println(Arrays.toString(newSubArray));
    }

    static int maximumSubarraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
