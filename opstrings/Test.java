package opstrings;

public class Test {

    public static void main(String[] args) {
        String str = "abcd\nefgh\nijkl\nmnop";
        System.out.println(str);

        System.out.println("\nVertical Mirrored");
        System.out.println(Opstrings.oper(Opstrings::vertMirror, str));

        System.out.println("\nHorizontal Mirrored");
        System.out.println(Opstrings.oper(Opstrings::horMirror, str));
    }
}
