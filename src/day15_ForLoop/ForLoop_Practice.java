package day15_ForLoop;

public class ForLoop_Practice {
    public static void main(String[] args) {
       /*
       odd number between1-100 in a single line
       sepatied by a space
       odd number 1 3 5 7 9

        */
        String resultOdd ="";

        for(int number = 1; number<= 100; number+=2){
            System.out.print(number+" ");
            resultOdd+= resultOdd +"";
        }
        System.out.println(resultOdd);
        /*
        even number between 1-100
                 2 4 6 8 10....
         */

        String resultEven = "";
        for(int numberEven = 0 ; numberEven<=100; numberEven+=2){
            resultEven+=resultEven+" ";
        }
        System.out.println(resultEven);







    }
}
