package maxmultiple;

public class MaxMultiple {

    /**
     * Returns the maximum multiple of a divisor that is less than or equal to a bound.
     *
     * @param divisor The divisor to find the maximum multiple of
     * @param bound The upper bound to find the maximum multiple within
     * @return The maximum multiple of the divisor that is less than or equal to the bound
     */
    public static int maxMultiple(int divisor, int bound) {
        return bound - bound % divisor;
    }
}
