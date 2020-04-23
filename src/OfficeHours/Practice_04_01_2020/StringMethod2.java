package OfficeHours.Practice_04_01_2020;

public class StringMethod2 {
    public static void main(String[] args) {
        //isEmpty():checks if the String is empty , T||F returns boolean
        String str1 = "   ";

        boolean r1=  str1.isEmpty();//false

        boolean r2=  !str1.isEmpty();//true
        // we have space as a charter
         System.out.println(r1); //false
        System.out.println(r2);//true

        // equals(str): checks if the two strong of text are equal or not , returns boolena
        //== is care location but equal is not
        //equalsIgnoreCase(str): checks if the two strong of texts are equal or not (without case sensitivity), returns boolean
        String s1= "cat";
        String s2 = new String ("cat");
        String s3 = "Cat";
        System.out.println(s1==s2);// false
        System.out.println(s1.equals(s2));//true
        System.out.println(s3.equalsIgnoreCase(s1));// true , ignore teh case sensitivity
        // Java is case sensitive

        System.out.println("=================================");
        //contains(str): check if teh str is includedn in teh string, return boolean

            String sentence= " I like to learn Java";
        System.out.println(sentence.contains("Java"));//true
        String sentence2 ="Top 3 viruses are 1. Corona.2. Hanta , 3. Ebola";
        System.out.println(sentence2.contains("Java"));//false

        System.out.println("=================================");
        //startsWith(str):cheks if teh string started with given str
        //endsWith(str) : cheks if teh string started with given str
            String webAddress= "www.amazon.com";
        System.out.println(webAddress.startsWith("www"));//true
        System.out.println(webAddress.startsWith("wwww"));//false

        String gmail= "CybertekSchool@gmail.com";
        System.out.println(gmail.endsWith("@gmail.com"));//true
        System.out.println(gmail.endsWith("@hotmail.com"));//false



    }



}
