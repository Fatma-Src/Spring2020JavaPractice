package day11_Scanner;
//import Packagename.ClassName;
//import java.util.Scanner;

import java.util.Scanner;

public class salaryCalculator {
    /*write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax
                               */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");

        int salary = input.nextInt();

        System.out.println("Enter the State Tax rate: ");

        byte stateTax = input.nextByte();
        double stateTaxPercentage = stateTax/100.0;

        System.out.println(" Enter the Federal tax rate: ");
        byte federalTax = input.nextByte();
        double federalTaxPercentage = federalTax/100.0;//10/3=3   to exact number 10/3.0 or 10.0/3

        // totalTax= (federalTaxpercentage +stateTaxpercentage) *salary

        double totalTax =(federalTaxPercentage +stateTaxPercentage) *salary;
       //salaryAfterTax= salary - totalTAx
        double salaryAfterTax = salary -totalTax;
        System.out.println("Your salary after tax is : $"+ salaryAfterTax);
        System.out.println("Total Tax : "+ totalTax);


    }










}
