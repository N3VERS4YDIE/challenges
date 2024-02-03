package maxproduct;

public class MaxProduct {

    /**
     * Returns the maximum product of adjacent elements in an integer array.
     *
     * @param arr integer array
     * @return maximum product of adjacent elements in the given array
     */
    public static int adjacentElementsProduct(int[] arr) {
        int max = arr[0] * arr[1];
        for (int i = 2; i < arr.length; i++) {
            max = Math.max(max, arr[i] * arr[i - 1]);
        }
        return max;
    }
}
