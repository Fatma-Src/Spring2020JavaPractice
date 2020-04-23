package day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {


    public static void main(String[] args) {

        boolean coldWheather = true;
        if(coldWheather) {
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");

        }

        boolean coronaDetection = true;
            if ( coronaDetection) {
                System.out.println("Buy more tiolet paper");
                System.out.println("Buy more water");
                System.out.println("Stay at home");
                System.out.println("Do more java coding");

            }


        int a = 100;
        boolean evenNumber = a%2==0 ;// if the number can be divided by 2 without the reminder
        boolean oddnumber = a%2 != 0; // if the numebr can not be divided by 2 evently
          if(evenNumber) {

        System.out.println(a + " os even number");
          }
          if( oddnumber){// if(!evenNumber )
              System.out.println(a + "  is odd number");


          }

    }
}










