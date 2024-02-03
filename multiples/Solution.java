package multiples;

public class Solution {

    public int solution(int limit) {
        final int numA = 3;
        final int numB = 5;

        if (limit < 0) {
            return 0;
        }

        int sum = 0;

        // Add multiples of 5 (if they aren't also multiples of 3)
        for (int i = numB; i < limit; i += numB) {
            if (i % numA != 0) {
                sum += i;
            }
        }

        // Add multiples of 3
        for (int i = numA; i < limit; i += numA) {
            sum += i;
        }

        return sum;
    }

    public int alternativeSolution(int number) {
        int sum = 0;

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum >= 0 ? sum : 0;
    }
}
