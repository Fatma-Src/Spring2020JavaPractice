package day03_VariablesContinue;

public class SalaryCalculator {
/*  ......

Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
			ex:
				if:
					rate = 55;
					stateTax = 0.04;
					federalTax =0.22;
					weeklyHours = 40;
				then output will be:
					your salary is: 105600 USD
					your total tax is: 27456 USD
					your income after tax is: 78144 USD
				if:
					rate = 45.25;
					stateTax =0.045;
					federalTax = 0.25;
					weeklyHours = 45;
				then output will be:
					your salary is: 91260 USD
					your total tax is: 26921.7
					your income after tax: 64338.3 USD


 */

    public static void main(String[] args) {
//declare the variable    DataType   VariableName = Data

        double HourlyRate = 65;
        double stateTaxRate = 0.04;
        double federalTaxRate  =0.22;
        byte WeeklyHours = 40;
        byte TotalWeeks = 52;

        // salary = hourlyRate * weeklyHours* 4* 12   because 12 months but we assume 52 weeks
        double salary =HourlyRate * WeeklyHours * TotalWeeks;
        // total salary before the tax gross income

        // State tax = total salary * state tax
        double stateTax  = salary * stateTaxRate ;
        // federal tax = salary * federal tax
        double federalTax = salary * federalTaxRate ;
        //salary Afte Tax = salary - ( state tax + federal tax)
        // if you want you can declare total Tax and change it .in this example we learn how we use () in math
        double salaryAfterTax = salary - ( stateTax + federalTax);


        System.out.println(" Your Salary is : " + salary); //concatenation
        System.out.println("State Tax is : " + stateTax); //concatenation
        System.out.println(" Federal Tax is: " + federalTax);//concatenation
        System.out.println(" Total Tax is: " + (stateTax +federalTax));
        System.out.println("Salary after tax is : $" + salaryAfterTax);



        /*

        System.out.println("9" + 3 );//concatenation 93
        System.out.println(9+"3"); // concatenation 93
        System.out.println(9+3); // addition 12

         */




















    }



















}
