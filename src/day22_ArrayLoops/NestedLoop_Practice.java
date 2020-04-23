package day22_ArrayLoops;

public class NestedLoop_Practice {

    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3},
                {4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21}
                                                    };


        // 1.print all even numbers in a same line
        //2. count odd number ==> return teh total odd number
        for (int k = 0; k < numbers.length; k++){
            for (int i = 0; i < numbers[k].length; i++) {
                if (numbers[k][i] % 2 == 0) {
                    System.out.print(numbers[k][i] + " ");
                }
            }

        }


         int countOdd = 0;

        for(int j = 0; j < numbers.length; j++) { // j: index num of 1D arrays

            for (int i = 0; i < numbers[j].length; i++) { // i: index num of elements in 1Darray
                int num = numbers[j][i];
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                } else {
                    countOdd++;
                }

            }

        }


    }





}
