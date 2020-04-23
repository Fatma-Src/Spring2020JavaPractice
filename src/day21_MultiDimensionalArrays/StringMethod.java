package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {

        String name = "Java";  // 'J', 'a', 'v', 'a'

        char[] chars = name.toCharArray();  // 4

        System.out.println(chars[0]);  //'J'
        System.out.println(chars[3]); //'a'

        //  System.out.println(chars[4]);

        String str = "I like Java";

        String[] arr = str.split(" ");

        System.out.println( Arrays.toString(arr) );




        //call the sprint define sprint place like " "

      /*
      resesve sententce: day great is today

      String sentence = "Today is great day";

       */

        String sentence = "Today is great day";

        String[]words=sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String result="";

        for (int i = words.length-1;i>=0; i-- ){
             String eachWords= words[i];
             // System.out.print(eachWords+" ";
            result+= eachWords+ " ";

        }

        System.out.println(result);

        String str2 ="ABCDEFJ";//this is string array
        //[ "A", "B",.....]
        String [] arr2= str2.split("");
        char [] ch2 =str2.toCharArray();//['A','B','C'...]
        System.out.println(Arrays.toString(arr2));
        // this one solution, we can get array with the string






    }
}
