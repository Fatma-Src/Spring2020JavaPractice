package day18_NestedLoop;

public class DivideNumber {
    public static void main(String[] args) {
        /*
1. write a program that can divide two numbers.(Assume that first number is greater than second
			NOTE: DO NOT USE division, multiplication, or module operators

            10/3==>3 with a remainder of 1
            10-3-3-3=1


         */

            int a= 10;
            int b = 3;
            int count= 0;


            if(b==0){
                System. out.println("divisor cannot be zero");
                System.exit(0);
            }

            while (a>=b){
                a-=b;
                count++;


            }
        if (a==0) {
            System.out.println("The result is "+ count);
        }else {
            System.out.println("The result is "+ count+ "with a reminder of " +a);
        }








    }
}
