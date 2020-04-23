package day12_JavaRecap;

import java.util.Scanner;

public class SalaryCalculator {
    /*


     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();//100000 enter

        input.nextLine();//enter

        System.out.println("Enter your full name ");
        String fullName = input.nextLine();

        System.out.println("Enter your company name ");
        String companyName = input.nextLine();

        System.out.println("Enter your SSN");
        long SSN = input.nextLong();//12345enter

        input.nextLine();//enter

        System.out.println("Enter Job Title: ");
        String jobtittle = input.nextLine();

        System.out.println("Full name is: "+ fullName);
        System.out.println("Job Tittle is: "+ jobtittle);
        System.out.println("Company name : "+  companyName);
        System.out.println("SSN:" + SSN);
        System.out.println("Salary is : $ " + salary);












    }











}
