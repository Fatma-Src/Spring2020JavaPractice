package day07_IfStatements;

public class MinNumber {
    public static void main(String[] args) {

        /*
        write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)

         */

        double a = 100;
        double b = 200;
        double c = 400;

        boolean aMinNumber = a<b && a<c; // a is min number, if a is less than b AND c
        boolean bMinNumber = b<a && b<c; // b is min number, if b is less than b AND c
        boolean cMinNumber = c<a && c<b; // c is min number if c is less than a AND B

        if(aMinNumber){
            System.out.println(a + " is the minimum number");
        }
        if(bMinNumber){
            System.out.println(b +" is the minimum number");
        }
        if(cMinNumber){
            System.out.println(c +" is the minimum number");

        }








    }








}
