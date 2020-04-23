package day22_ArrayLoops;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[]arr= {1,2,3,4,5};

        System.out.println(Arrays.toString(arr));

        for(int i= arr.length-1;i>=0;i--){
            int eachNum = arr[i];
            System.out.print(eachNum);
        }
        System.out.println("========================================");

        int[]reverse= new int[arr.length];//reverse array has to be same size
        //                                  {0,0,0,0,0,0}

            int j= arr.length-1;//it has to be last index number
            for(int i =0; i<arr.length;i++) {
                reverse[i] = arr[j];
                j--;
            }
        System.out.println(Arrays.toString(reverse));

    //((length-1)-i) instead of j




    }
}
