package day13_StringClass;

public class StringManupulations3 {
    public static void main(String[] args) {

        String str = "I like Java programing";/*index method is only return
        the first matching chacters. */
        int  num1      =str.indexOf("J");
        System.out.println( num1);
        int num2 = str.indexOf("John");// J nin index numberini verir.

        String str2 = "Cybertek school is awesome";
        //             01234567

        int firstS =str2.indexOf("s");//9
        int secondS = str2.indexOf("is")+1;
        // to find s we add 1 beacsei str2.indexOf("is")
        System.out.println(firstS);
        System.out.println(secondS);

        int maxIndexnumber="Cybertek".length()-1;
        System.out.println(maxIndexnumber);

        String names= "Muhtar";
        int a1 = names.indexOf("Good Guy");
        System.out.println(a1);// if the value is not exist it gives negative

        String fullname = "Kuzzat Altay";
        String firstname= fullname.substring(0,fullname.indexOf(" ")) ;
        String lastname= fullname.substring(fullname.indexOf(" ")+1);
        //it works every name

        System.out.println(firstname);
        System.out.println(lastname);














    }



}
