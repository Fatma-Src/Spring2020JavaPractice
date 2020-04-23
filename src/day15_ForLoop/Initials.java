package day15_ForLoop;

import java.util.Scanner;

public class Initials {
    /*
    input :
    cybertek
    batch18
    output:
    your initials is:CB
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
            String firstName= scan.next();
        System.out.println("Enter your second name");
            String lastName= scan.next();

        String initials2 = firstName.substring(0).toUpperCase() +  lastName.substring(0,1).toUpperCase();

             // initials= initials.toUpperCase();

        String initials = ""+ firstName.charAt(0)+lastName.charAt(0);
            //if we do not "" lest part become number so to make String we nee to ""
                initials=initials.toUpperCase();

        System.out.println(initials);
        System.out.println(initials2);









    }


}
