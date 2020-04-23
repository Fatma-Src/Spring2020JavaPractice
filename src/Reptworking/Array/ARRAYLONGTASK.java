package Reptworking.Array;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ARRAYLONGTASK {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int num = input.nextInt();

        int attemps = 0;
        while (num > 7 || num < 1) {
            System.out.println("Invalid number.Can you enter valid number?");
            num = input.nextInt();
            attemps++;
            if (attemps == 3 && num > 7 || num < 1) {
                System.out.println("You try 3 attems. invalid entery ");
                System.exit(0);
            }

        }
        if(num<=7||num<=1){
        String result = days[num - 1];
        System.out.println(result);}

        System.out.println("Do you want another number?");
        String answer= input.next();
        if( answer.equalsIgnoreCase("yes")){
            System.out.println("pls enter number");
            num = input.nextInt();
            String result1 = days[num - 1];
            System.out.println(result1);
        }else{
            System.out.println("Thank you ");
        }


    }



}
