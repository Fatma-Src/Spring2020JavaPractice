package day19_Arrays;

public class Frequency {
    public static void main(String[] args) {

        String str= "AABCC";//A2B1C2
        String result="";//"A2B1C2

        String nonDup = "";//ABC




    for(int i =0; i<=str.length()-1;i++) {
        if (!nonDup.contains("" + str.charAt(i))) {
            nonDup += str.charAt(i);

        }


    }

        //System.out.println(nonDup);to [print


    //nonDup="ABC    str="AABCC   ===>result "A2B1C2


        for(int j = 0 ; j <= nonDup.length()-1; j++ ){
            char ch = nonDup.charAt(j);


            int count = 0;//purpose of total number of each character from str
                for(int i=0; i<=str.length()-1;i++) {
            if (str.charAt(i) == ch) {
                count++;
            }

        }
            result += "" + ch + count;//if we add on ly char+num it became a

        }

        System.out.println(result);












    }
}
