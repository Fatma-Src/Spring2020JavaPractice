package OfficeHours.Practice_03_25_2020;

public class NestedIf_practice2 {
    public static void main(String[] args) {
        /* for the loan
        if he/she has a job that pays>500000$===>might be eligible
        if he/she has good credit
        if job history is more than or equal 2
         */

        int salary = 45000;
        int creditscore= 750;
        byte jobHistory = 1;

        if (salary>50000){// might be eligible

            if(creditscore>650) {//might be eligible for loan
                System.out.println("You are gualified");

                if (jobHistory >= 2) {//eligible loan
                    System.out.println("You are gualified");
                } else {
                    System.out.println("You don't have enough job history. ");
                }
            }else {
                System.out.println("You don have good credit score");
            }



        }else {
            System.out.println("You need have a jobs that pays $500000");
        }










    }











}
