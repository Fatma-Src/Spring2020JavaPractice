package day10_Switch_Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        byte a =4;
        /*float a1=4.5f;
          long a2 = 10l;
          double a3= 2.5d; Because old version java used this one
          boolean a4 =


         */


        switch (4){// in switch statemnet the complier test the cases firstly
            case 1:
                System.out.println("One");
                break;
            case 2:// case value must be unique
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:// case value must be unique
                System.out.println("Four");
                break;

            default:
                System.out.println("Invalid case");
                break;





        }




    }



}
