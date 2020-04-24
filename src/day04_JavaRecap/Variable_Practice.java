package Day04_JavaRecap;

public class Variable_Practice {

    public static void main(String[] args) {
        //DataType variableName = Data
        byte num1= 127 ;
        short num2 = num1 ;// double>float> long>int> short>byte
       // byte num3 = num2; it gives errror
        int num4 = num2;
        // int is preferred by complier so we need to add L or l end of the data
        long num5 = 9999999999L;
        float num6 = 100L;
        System.out.println( num6);// run 100.0
        float num7 = 0.5f; // double is prefer in decimals number
        System.out.println(num7);//run 0.5

        double num8 = 0.5f;
        double num9 = 9999999L;
        double num10 = 100.5;
        System.out.println(num10);// run 100.5

        char ch = '$';// every single ch has a number
        System.out.println(ch); // $

        char ch2 = 2200;
        System.out.println(ch2);// it gives chacter

        int a1 = '8';//56
        System.out.println(a1);/* it is charcter so it gives number the number
        in ' ' they are char so it will be only between  0-9 */

        int a2 ='z';// int only accept number.122
        System.out.println(a2);//122

        double d1 = 'z'+'8';// it assumes 178 = 122+ 56

        char ch4 = 'z'+ '8';
        System.out.println(ch4);// run we got char one chatcter

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println( 9>10);//false
        System.out.println( 9>= 9 );// true
        System.out.println(9!= 10);// true
        System.out.println('a'== 'b');//false
        //System.out.println('a'== "a");
        /* preconditions of the comparasion operator
         both data must be matching
                */
        System.out.println('a'=='b'-1);
                     // ??  97== 98-1
                     //    97== 97

        System.out.println("Muhtar" ==" Good Guy");// false
                        // Bad guy == good guy
        System.out.println("Muhtar"== "muhtar ");//falsa case sensetive
        System.out.println("Muhtar"!=" Good Guy");//true




















    }











}
