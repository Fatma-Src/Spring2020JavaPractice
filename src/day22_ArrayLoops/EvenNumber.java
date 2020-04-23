package day22_ArrayLoops;

import java.util.Arrays;

public class EvenNumber {
    /*
    . create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to rpint out all the even numbers.
                MUst use continue statement

     */

    public static void main(String[] args) {

        int[] numbers = new int[200];//index:0-100,

        /*
         numbers[0] = 1;
        numbers[1] = 2;
        // ....
        numbers[99] = 100;

         */

        for (int i = 0; i <= numbers.length; i++) {
            numbers[i] = i + 1;//assing the 1 to 100
        }
        for (int each : numbers) {
            if (each % 2 != 0) {
                continue;
            }

            System.out.println(each + " ");//each represent each element in array
        }



        System.out.println(Arrays.toString(numbers));





    }


}
