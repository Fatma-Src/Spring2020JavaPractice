package day16_ForLoop;

public class Doplica {
    public static void main(String[] args) {
      String str= "abab";
      String result="";//ab we store expected result in it

        for(int i=0; i<=str.length()-1; i++) {//0,1,2,3,
            /*

             */
            if (result.contains("" + str.charAt(i))) {//if the string does not contains str.charAt(i),then we concate itto result , it it does we will
                continue;
            }
            result += str.charAt(i);
        }











    }
}
