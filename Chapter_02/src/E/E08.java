package E;

import java.util.ArrayList;

public class E08 {

    public static void main(String[] args) {
        String input = "Hello, World!";

        ArrayList<Integer> eIdx = new ArrayList<>();
        ArrayList<Integer> oIdx = new ArrayList<>();

        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'e':
                    eIdx.add(i);
                    break;
                case 'o':
                    oIdx.add(i);
                    break;
                default:
                    continue;
            }
        }

        for (int i : eIdx) {
            chars[i] = 'o';
        }
        System.out.println(chars);
        for (int i : oIdx) {
            chars[i] = 'e';
        }
        System.out.println(chars);

        char[] chars2 = input.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            switch (chars2[i]) {
                case 'e':
                    chars2[i] = 'o';
                    break;
                case 'o':
                    chars2[i] = 'e';
                    break;
                default:
                    continue;
            }
        }

        System.out.println(chars2);
    }

}
