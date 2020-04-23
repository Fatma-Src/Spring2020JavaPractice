package day13_StringClass;

public class StringManipulation {
    public static void main(String[] args) {

       String str= "Cybertek";
       //           01234567


        char ch1= str.charAt(5);//t
        System.out.println(ch1=='A');
                    //    't'== 'A';

        System.out.println(ch1=='T');
                    // t is not T

        int totalLength = str.length();
        System.out.println(totalLength);

        System.out.println(totalLength>250);//false

        String str2= " Today is great day, Java is Fun";
                        // 012345
        int maxIndexNum = str2.length()-1;
        System.out.println(maxIndexNum);

         String s1 = "Cybertek";
                s1= s1.concat(" School");//"cybertek School  other way +=
         System.out.println(s1);

         String s2 = "Java";
                s2.concat(" is a programming language");///Java is a programming language
        System.out.println(s2.concat(" is a programming language"));
        System.out.println(s2);//java

        s2 = s2.concat(" is a programming language");
        System.out.println(s2);

        String name1 = "CYBERTEK";

        name1 =   name1.toLowerCase();

        System.out.println(name1);

        String name2 = "cybertek school";
        name2 = name2.toUpperCase();

        System.out.println(name2);


        String A1 = "        Today            is           a          great       day            ";
        A1 =   A1.trim();








    }

















}
