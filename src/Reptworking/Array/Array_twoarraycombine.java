package Reptworking.Array;

import java.util.Arrays;

public class Array_twoarraycombine {
    public static void main(String[] args) {

        int[] arr= {1,2,3};
        int[] arr1= {4,5,6,7};

        int[] newarr= new int[arr.length+arr1.length];

        for(int i=0; i<arr.length; i++){
            newarr[i]= arr[i];
        }
        for(int i= 0; i<arr1.length;i++){
            newarr[arr.length+i]= arr1[i];
        }

        System.out.println(Arrays.toString(newarr));



    }
}
