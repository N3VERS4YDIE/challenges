package maxproduct;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[][] tests = new int[][] {
            { 1, 2, 3 },
            { 9, 5, 10, 2, 24, -1, -48 },
            { -23, 4, -5, 99, -27, 329, -2, 7, -921 },
            { 6, 0, 7 },
        };

        for (int[] test : tests) {
            System.out.println(MaxProduct.adjacentElementsProduct(test) + " <- " + Arrays.toString(test));
        }
    }
}
