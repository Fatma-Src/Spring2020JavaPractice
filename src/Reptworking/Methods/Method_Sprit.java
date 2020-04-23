package Reptworking.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Method_Sprit {
    /*
    The method person get a string with this format : "name,last name,age"
for example:

person("jon,doe,30");

the output is:

person name: jon last name: doe age: 30

hint: use the split method to split the string to a string array where there is a "," char
     */
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String s = inp.next();


        person(s) ;
    }

    public static void person(String info) {
        String [] arrinfo= info.split(",");
        System.out.println("person name: "+arrinfo[0]);
        System.out.println("last name: "+ arrinfo[1]);
        System.out.println("age: "+arrinfo[2]);





    }//end person

}

