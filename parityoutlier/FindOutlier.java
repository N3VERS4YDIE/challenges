package parityoutlier;

public class FindOutlier {

    static final class OutlierAusenceException extends RuntimeException {

        public OutlierAusenceException() {
            super("No utlier found");
        }
    }

    static int find(int[] integers) {
        if (integers.length < 3) {
            throw new OutlierAusenceException();
        }

        byte evens = 0;

        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                evens++;
            }
        }

        for (int integer : integers) {
            if (evens > 1 && integer % 2 != 0 || evens < 2 && integer % 2 == 0) {
                return integer;
            }
        }

        throw new OutlierAusenceException();
    }
}
