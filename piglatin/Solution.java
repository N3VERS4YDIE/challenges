package piglatin;

public class Solution {

    public static String pigIt(String str) {
        StringBuilder words = new StringBuilder();

        for (String s : str.split(" ")) {
            words.append(swapFirstWithLast(s));
            if (Character.isLetterOrDigit(s.charAt(0))) {
                words.append("ay ");
            }
        }

        return words.toString().trim();
    }

    private static String swapFirstWithLast(String str) {
        if (str.length() < 2) {
            return str;
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            chars[i] = chars[i + 1];
        }
        chars[chars.length - 1] = str.charAt(0);

        return String.valueOf(chars);
    }
}
