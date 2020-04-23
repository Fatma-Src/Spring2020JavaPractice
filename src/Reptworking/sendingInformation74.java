package Reptworking;

import java.util.Scanner;

public class sendingInformation74 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender ;
        String phoneNumber;
        String messageBody;

       sender= message.substring(0,message.indexOf(","));
       phoneNumber= message.substring(message.indexOf(",")+1,message.lastIndexOf(","));
       messageBody= message.substring(message.lastIndexOf(",")+1);
        System.out.println("Sender: "+ sender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Message body: " +messageBody);











    }
}
