package removeduplicatewords;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RemoveDuplicateWords {

    public static String removeDuplicateWords(String str) {
        LinkedHashSet<String> result = new LinkedHashSet<>();
        Collections.addAll(result, str.split(" "));
        return String.join(" ", result);
    }

    // alternative solution
    public static String removeDuplicateWords2(String str) {
        return Pattern.compile(" ").splitAsStream(str).distinct().collect(Collectors.joining(" "));
    }
}
