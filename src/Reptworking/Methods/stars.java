package Reptworking.Methods;



public class stars {
    /*
Create a method printHollowRect that prints a 5 on
 5 hollow rectangle:


*****
*   *
*   *
*   *
*****

hint:you will need to use two nested for loops for that,
 and an if that checks if its the last or first iteration
 of the loop (so you will know whet to print "*" or " ")
}
     */

    public static void main(String[] args) {
        stars();



    }
   public static void stars(){
        for(int j=0; j<5;j++) {
            if (j == 0 || j == 4) {
                for (int i = 1; i <= 5; i++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.println("*   *");
            }

        }





   }







}
