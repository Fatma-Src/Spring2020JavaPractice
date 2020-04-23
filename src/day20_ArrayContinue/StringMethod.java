package day20_ArrayContinue;
import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {

        String name ="Fatma";

      char[] character  =name.toCharArray();
        System.out.println(Arrays.toString(character));

       String str1= "Cybertek School" ;
       String str2="School Cybertek";

       char ch1[]=str1.toCharArray();//[C,y b ,e, r, t, e,   k school]
        char ch2[]=str1.toCharArray();//

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch1));
        boolean equalStr = Arrays.equals(ch1,ch2);
        System.out.println(equalStr);








    }

}
