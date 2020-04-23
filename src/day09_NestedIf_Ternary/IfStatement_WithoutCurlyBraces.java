package day09_NestedIf_Ternary;

public class IfStatement_WithoutCurlyBraces {


    public static void main(String[] args) {
        int number = 100;

        if(number%2==0)
            System.out.println( " Even Number");
        else
            System.out.println("Odd Number");

        if( true){//If the block conating more than one statement we must give
            System.out.println( "Hello");
            System.out.println( "Hello");
            System.out.println( "Hello");
        }



        /* If den {} kaldirrisak ilkini if te dahil eder digerlerini
        dahil etmez ve her sefer yazar
         */



    }








}
