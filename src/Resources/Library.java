package Resources;

import java.util.Arrays;

public class Library {
    /*
    sorting as a desending
     */

    public static int[] sortDesending(int[] arr) {
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length];

        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;

    }

    /*
    String Reverse
     */

    public static String Reverse(String str) {
        String Reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            Reverse += str.charAt(i);
        }

        return Reverse;
    }


/*
remove duplicate
 */


    public static String RemoveDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = str.charAt(i) + "";//A
            if (!result.contains(ch)) {
                result += ch;

            }

        }
        return result;
    }



/*

Frequency (Overloading: two method )
 */

    public static int Frequency(String str1, String str2) {
        int count = 0;
        while (str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");
            //we need to make we are not counting teh same index over again
            // you delete str2 into the str1 but count increase


        }
        return count;

    }
    public static int Frequency(String str,char ch) {
        char[] arr = str.toCharArray();//[A,A,A]

        int count = 0;
        for (char each : arr) {
            if (each == ch) {//  contains kullanamiyoruz cunky ch not string
                count++;}
        }

        return count;

    }





    /*
    Frequency of Chars of the string  into String
     */

    public static String FrequencyofChars(String str) {
        String NonDup = Library.RemoveDuplicates(str);
        String result = "";//contains frequency of char

        for (int i = 0; i < NonDup.length(); i++) {
            String ch = "" + NonDup.charAt(i);//"A"
            int count = Library.Frequency(str, ch);
            //System.out.print(ch+ count);
            result += ch + count;
        }

        return result;



    }








}