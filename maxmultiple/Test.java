package maxmultiple;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[][] tests = { { 2, 7 }, { 10, 50 }, { 37, 200 } };

        for (int[] test : tests) {
            System.out.println(MaxMultiple.maxMultiple(test[0], test[1]) + " <- " + Arrays.toString(test));
        }
    }
}
