package OfficeHours.Practice_03_25_2020;

public class IfElse_Practice {

    public static void main(String[] args) {
        int num = 100;

        if(num%2!=0){//odd condition
            System.out.println(num+" is odd number");

        }
        if(num%2==0) { //even condition
            System.out.println(num+" is even number");
        }
        // 100 % sure there is a two options
        if(num%21!= 0){
            System.out.println(num+" is odd number");
        }else {
            System.out.println(num+" is even number");
        }
        System.out.println("===========================================");

        boolean genderMale=true;
        if(genderMale){
            System.out.println("Gender is male");
        }else {
            System.out.println("Gender is female");
        }
        boolean usCitizen = true;
        int ageOfPerson = 30;

        if(usCitizen==true && ageOfPerson>=18){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }







    }














}
