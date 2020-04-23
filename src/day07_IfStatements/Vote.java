package day07_IfStatements;

public class Vote {
    public static void main(String[] args) {

    /*
    write a java program that can identify if a person is eligible to vote for Donald Trump
     */

    int age = 18;
    boolean UScitizen = true;
    boolean likeDonald = true;

    boolean eligible = age>= 18 && UScitizen ==true;
    if(eligible){
        System.out.println("You are eligible to vote");
    }
    if(!eligible){// !eligible ==true or eligible != false
        System.out.println(" you are not eligible");
    }









    }










}
