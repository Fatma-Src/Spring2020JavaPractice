package day03_VariablesContinue;

public class VariablesContinue {

    /*  ...
        >: greater
		>=: greater or equal
		<: less
		<=: less or equal
		== : equal
		!= : not equal

    ...*/

    public static void main(String[] args) {

        boolean result1 = true;
        boolean result2 = false;
        boolean result3 = 10>9;

        System.out.println(result3); //run true
        System.out.println(true == false);
        System.out.println("Muhtar" == "Good Guy" );//False because if string
        System.out.println("Muhtar" != " Good Guy");// true
        boolean r1 = true != true;  // false
        System.out.println( r1 );  // false

        boolean r2 = "Batch17" == "Batch18"; // fasle
        char c1 ='A';
        System.out.println(c1);// run it print 8
        char c2 = 4500 ;
        System.out.println( c2);// run it write special character

        char ch3 = 25000;
        System.out.println(ch3);// run it write special character

        char ch4 = 100; // d
        System.out.println(ch4);// run it write special character

        char ch5 = 'D'; // 68
        System.out.println(ch5); //D

        int num1  = 'D'; // number,
        System.out.println(num1);// 68

        char a1 = 'z';
        // byte b1 = a1;  // char is larger than byte
        byte b1 = 'z';

        // short s1 = a1 ;  // char is larger than short
        int i1 = a1;  // int is larger than char
// have to be careful about assign the char into byte and short because char open larger than
// make sure that data type is and it range











    }

}
