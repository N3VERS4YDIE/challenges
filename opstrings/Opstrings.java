package opstrings;

import java.util.function.UnaryOperator;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Opstrings {

    /**
     * Reverses the order of characters in each line of a given string, effectively
     * mirroring it vertically.
     */
    public static String vertMirror(String str) {
        String[] lines = str.split("\n");
        StringBuilder result = new StringBuilder();

        for (String line : lines) {
            result.append(new StringBuilder(line).reverse()).append("\n");
        }

        return result.toString().trim();
    }

    /**
     * Reverses the order of lines in a string, effectively mirroring it
     * horizontally.
     */
    public static String horMirror(String str) {
        String[] lines = str.split("\n");
        StringBuilder result = new StringBuilder();

        for (int i = lines.length - 1; i >= 0; i--) {
            result.append(lines[i]).append("\n");
        }

        return result.toString().trim();
    }

    public static String oper(UnaryOperator<String> operator, String str) {
        return operator.apply(str);
    }

    // Compact way using Stream API and Lambda expressions

    public static String vertMirrorC(String str) {
        return join(split(str).map(s -> new StringBuilder(s).reverse().toString()));
    }

    public static String horMirrorC(String str) {
        return join(split(str).sorted((a, b) -> -1));
    }

    /**
     * Splits a string into a stream of strings using the newline character as the
     * delimiter.
     */
    private static Stream<String> split(String str) {
        return Pattern.compile("\n").splitAsStream(str);
    }

    /**
     * Joins a stream of strings into a single string, separated by newlines.
     */
    private static String join(Stream<String> strm) {
        return strm.collect(Collectors.joining("\n"));
    }
}
