package day24_Methods;

import java.util.Scanner;

public class BirthYear {
    public static void Age(int birthyear){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the current year");
        int currentYear= scan.nextInt();

        int age =currentYear-birthyear;
        if (age>0 && birthyear>1900) {
            System.out.println(age);
        }else {
            System.out.println("invalid birtyear");
        }
    }

    public static void main(String[] args) {
        int a =2002;
        Age(2002);
    }

    public static void printHello(){
        System.out.println("Hello");
    }
    public static void printCybertek(){
        System.out.println("Cybertek");
    }

    public  static void printHelloCybertek() {
        printHello();
        printCybertek();

    }




}
