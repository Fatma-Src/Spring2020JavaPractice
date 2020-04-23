package Reptworking.Methods;

public class Method_merge {
    public static void main(String[] args) {
        String one = "fat";
        String two = "betul";




            System.out.println(mergeStrings(one,two));




    }
    public static String mergeStrings(String one,String two) {
        String mergelast = "";
        String merge = "";


        if (one.length() > two.length()) {

            for (int i = 0; i < two.length(); i++) {
                merge += "" + one.charAt(i) + two.charAt(i);
            }
            mergelast = merge + one.substring(two.length());
        } else {
            for (int i = 0; i < one.length(); i++) {
                merge += "" + one.charAt(i) + two.charAt(i);

            }
            mergelast = merge + two.substring(one.length());
        }
        return mergelast;

    }
    // String result = "";
    //    int length = 0;
    //       length= (one.length() > two.length())? one.length():two.length();
    //        for (int i = 0; i < length; i++) {
    //            if (i < one.length()) {
    //                result += one.charAt(i);
    //            }
    //            if (i < two.length()) {
    //                result += two.charAt(i);
    //            }
    //        }return result;



}
