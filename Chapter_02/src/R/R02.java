package R;

public class R02 {
    public static void main(String[] args) {
        String withSpaces = "                   hello                               world          ";
        System.out.println(withSpaces.trim());

        System.out.println(withSpaces.replace(" ", ""));
    }
}
