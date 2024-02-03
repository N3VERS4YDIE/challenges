package piglatin;

public class Test {

    public static void main(String[] args) {
        String[] tests = { "Pig latin is cool", "Hello world !" };

        for (String test : tests) {
            System.out.println(Solution.pigIt(test));
        }
    }
}
