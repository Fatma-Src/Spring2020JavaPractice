package OfficeHours.Practice_04_01_2020;

public class StringMethods {
    public static void main(String[] args) {

        //charAt ( indexNumber) : return the char then given index , cha  primiive
        //       leght 1234
        String str1 = "Java ";
        //       index 01234

        char ch1 = str1.charAt(3);
        System.out.println(ch1);

        char ch2 = str1.charAt(4);
        System.out.println(ch2);// print space


       // lenght (): return the total number of chars, int
        String str2 = "Cybertek School";
        int total = str2.length();
        System.out.println(total);
        int maxIndex= str2.length()-1;
        char ch3 = str2.charAt(maxIndex);
        System.out.println(ch3);



        // concat()  concatenation, return new String + also does concatenation

        String str3 ="Cybertek";
         str3= str3.concat(" School");// Cybertek School
        System.out.println(str3);
        String str4="Java ";
               str4= str4.concat(" is fun"); //Java is fun

        System.out.println(str4);

        //toLowerCase()  && to upperCase():change teh case of the srings to upper or lower

        //toLowerCase() & toUpperCase(): change the case of the strings to upper or lower  cases. returns new string

        String str5 = "CYBERTEK SCHOOL";
        str5 =    str5.toLowerCase(); // "cybertek school"

        System.out.println(str5);






        String str6= "muhtar";
        str6 = str6.toUpperCase();//Muhtar
        System.out.println(str6);


        //trim(): removes unused (white ) space from teh string, return new String

        String str7= "    Cybertek";
           str7= str7.trim();//"Cybertek;
        System.out.println(str7);
        System.out.println(str7.length());

        String str8 = "      ";
             str8 = str8.trim();
             System.out.println(str8.length());//0


        //substring(beginning index, ending index):ending index is always exculled
        // create substring starting from begining index till ending index
         String sentences1 = "I like Java";
                //            012345678910
        // last indev number= lenght -1
            String word1=  sentences1.substring(7,11);//Java
            //String word1 = sentences1.substring(7,sentences1.length())
            String word2 = sentences1.substring (2,5+1);
            String word3 = sentences1.substring (2,6)+ sentences1.substring(7,sentences1.length());


            System.out.println(word1);
            System.out.println(word2);




        //substring (begining index)creates the sub string from beginning index till the end of teh string.returns new string
        String sentence2 = "I like to learn Java";
        //                  01233...

        String r1 =sentence2.substring(10);//'learn Java
        System.out.println(r1);

        String r2 = "Java "; //JaVa
        String r3= r2.substring(0,2);//Ja
        String r4= r2.substring(2,3);//v
        r4= r4.toUpperCase(); //V
        String r5= r2.substring(3);//a

        String result = r3+r4+r5;//JaVa
        //replace( old str,newstr::replaces all teh matching ones, returns new string
            String str =  " I like C#,C# is cool ";
            str = str.replace("C#", "Java");

         //replaceFirst( old str, new str ): replace the first matching one , return new string
        String t1 = "Java is fun, Java is good";
            t1= t1.replaceFirst(", Java", "C#");
             System.out.println(t1);


//indexOF(str): retuen teh index of first matching character, as an int
        String y1= " Today is Wednesday";
        int a1= y1.indexOf("W");// the first w index number
        System.out.println(a1);
        int a2 = y1.indexOf("Wednesday");//first chacter of wednesday
        System.out.println(a1);
        System.out.println(a2);

//lastIndexOf(str):return the index of last matching character, as an int
        String y2= "Cybertek School, School";
        int a3 = y2.lastIndexOf("S"); // last S' index number
         System.out.println(a3);

















    }
}
