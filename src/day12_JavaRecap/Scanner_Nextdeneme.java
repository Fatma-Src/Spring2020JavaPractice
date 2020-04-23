package day12_JavaRecap;
//import PackageName.className;

import java.util.Scanner;

public class Scanner_Nextdeneme {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       // String str = scan.next();
       //  System.out.println(str);if noting enter nothing
        // next() only takes first word
        //7921 JonesBranch Dr, McLean VA, 22034
        String fullAdress ="";

        //7921 Jones
        System.out.println("Enter the number of building: ");
        short Bnumber = scan.nextShort();
        fullAdress +=Bnumber+" ";//fullAdress= fullAddress+Bnumber

        System.out.println("Enter the Street Name: ");
        String StName = scan.next();
        fullAdress+=StName+ " ";

        System.out.println("Enter type of the street: ");
        String Typestreet = scan.next();
        fullAdress +=Typestreet+", ";

        System.out.println("Enter your city: ");
        String City = scan.next();
        fullAdress += City + ", ";

        System.out.println("Enter your state :");
        String StateCode = scan.next();
        fullAdress += StateCode +", ";

        System.out.println("Enter zipcode ; ");
        short Zipcode = scan.nextShort();
        fullAdress+= Zipcode;

        System.out.println(fullAdress);













    }



















}
