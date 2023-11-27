package E;

public class E01 {
   public static void main(String[] args) {
      String m = "Mississippi";
      String replaceI = m.replace("i", "ii"); // return new String
      String replaceSS = replaceI.replace("ss", "s"); // return new String
      System.out.println(replaceI + " " + replaceI.length());
      System.out.println(replaceSS + " " + replaceSS.length());
   }

}