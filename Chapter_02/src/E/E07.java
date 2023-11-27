package E;

public class E07 {

    public String replace(String string) {
        // stupid way
        StringBuilder result = new StringBuilder();

        char[] chars = string.toCharArray();

        for (char c : chars) {
            switch (c) {
                case 'i':
                    result.append('!');
                    break;
                case 's':
                    result.append('$');
                    break;
                default:
                    result.append(c);
            }
        }
        // return result.toString();

        // smarter.
        return string.replace(("i"), "!").replace("s", "$");

    }
}

class ReplaceTester {

    public static void main(String[] args) {

        E07 e07 = new E07();
        String result = e07.replace("Mississippi");
        String expected = "M!$$!$$!pp!";
        System.out.println(result);
        System.out.println("Expected: " + expected);
        System.out.println(result.equals(expected));

    }
}