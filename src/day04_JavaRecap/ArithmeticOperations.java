package Day04_JavaRecap;

public class ArithmeticOperations {


    public static void main(String[] args) {


        int a = 10/3; ///run 3
        System.out.println(a);

        // 10/4 ==>2.5
        System.out.println(10/4);//2

        double d = 10/4 ;
        //double d = 2.0
        System.out.println(d);//2.0

        System.out.println(10.0/4);// run 2.5
        System.out.println(10/4.0);// 2.5
        System.out.println(10.0/4.0);//2.5
        //10/4 =2.5
        float f1 = 10/4;
        //float f1=2;
        System.out.println(f1);//2.0

        boolean evennumber = 25%2 ==0;
        // if 25 /2 has a reminder of zero, the it s even number
        System.out.println(evennumber);//false

        boolean oddNumber = 22 % 2 != 0;  // odd num
        //          0 != 0 ==> false

        System.out.println(oddNumber);

        System.out.println( 10 % 2 == 0 );  // 10 is even number
        System.out.println( 11 % 2 != 0 );  // 11 is odd number

        System.out.println("10 is even number: " + ( 10 % 2 == 0 ) );
        System.out.println( "11 is even number: " + ( 11 % 2 == 0 ));

        System.out.println("25 is odd number: " + (25 % 2 != 0) );

        System.out.println("25 is even number: "+ (25 % 2 == 0) );
        System.out.println("25 is even number: "+ !(25 % 2 != 0) );









    }



}
