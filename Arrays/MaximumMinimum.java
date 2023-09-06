public class MaximumMinimum {
    public static void main(String[] args) {
        int[] arr = {22, 14, 8, 17, 35, 3};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    static int max(int[] array) {
        int max = array[0];
        //Check Maximum
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    static int min(int[] array) {
        int min = array[0];
        //Check minimum
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
