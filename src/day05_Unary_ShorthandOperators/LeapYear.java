package day05_Unary_ShorthandOperators;

public class LeapYear {

    /*
     create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020
        output:
            2020 is leap year: true
     */

    public static void main(String[] args) {

        short year = 2020;
        // leap year has to diveide 4 so  leap year: year%4= 0
        // if returns true ==> leapyear if false not leapyear
        boolean leapyear = year%4 == 0 ;
        System.out.println(year + " is leap year :"+ leapyear);













    }
















}
