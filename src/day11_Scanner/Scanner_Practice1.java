package day11_Scanner;

import java.util.Scanner;

public class Scanner_Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        String fullName = firstName +" "+ lastName;

        System.out.println("Are you employeed?( true or False) ");
        boolean employeementStatus = input.nextBoolean();

        double salary =0;

        if ( employeementStatus==true){
            System.out.println("Enter your salary ; ");
            salary = input.nextDouble();
        }

        System.out.println("Full name is: "+ fullName);
        System.out.println("Employeed: "+ employeementStatus);
        System.out.println("Your Salary : "+ salary);











    }















}
