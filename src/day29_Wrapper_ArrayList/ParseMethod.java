package day29_Wrapper_ArrayList;

public class ParseMethod {
    public static void main(String[] args) {
        String str= "123";
        int a1=Integer.parseInt(str);//123

        System.out.println(str);//text
        //"123"+1==> 1231 string
        System.out.println(a1);//number
        //123+1=124 number
        byte b1=Byte.parseByte(str);//byte= 123
        System.out.println(b1+5);//128
        Integer I1 =(int)Byte.parseByte(str);//autoboxing

        // Integer  = (int)byte;
        // Integer = int;

        String str2 = "12.5";

        float f1 =  Float.parseFloat( str2 );   // float 12.5

        System.out.println(f1 + 1);  // 13.5

        double f2 =  Double.parseDouble(str2);   // double 12.5

        System.out.println( f2 + 1 );  // 13.5


        String str3 = "3147483647";

        long num1 = Long.parseLong(str3);   //long 3147483647L

        System.out.println(num1 + 2);

        Long num2 = Long.parseLong(str3);  // autoboxing

        System.out.println(num2 + 2);


        String result1= "Today is Mopnday";//not 'true or false ==> beavsue default value is false for boolean
        boolean r1=Boolean.parseBoolean(result1);
        System.out.println(r1);//false

        String result2= "True";// parse is ignore case method
        boolean r2=Boolean.parseBoolean(result1);
        System.out.println(r1);//true

        String result3= "FalSE";//false
        boolean r3=Boolean.parseBoolean(result2);
        System.out.println(r3);



    }
}

