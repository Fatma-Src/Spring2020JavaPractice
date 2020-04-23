package Day25_MethodsRecap;

import Resources.Library;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "AABBCC";//A2B2C2
        String NonDup = Library.RemoveDuplicates(str);

        String result = "";
        for (int i = 0; i < NonDup.length(); i++) {

            String ch = "" + NonDup.charAt(i);//"A"
            int count = Library.Frequency(str, ch);
            //System.out.print(ch+ count);
            result += ch + count;
        }
        System.out.println(result);
    }

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
