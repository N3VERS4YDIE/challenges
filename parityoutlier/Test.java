package parityoutlier;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[][] tests = {
            { 2, 6, 8, -10, 3 },
            { 206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781 },
            { Integer.MAX_VALUE, 0, 1 },
        };

        for (int[] test : tests) {
            System.out.println(FindOutlier.find(test) + " <- " + Arrays.toString(test));
        }
    }
}
