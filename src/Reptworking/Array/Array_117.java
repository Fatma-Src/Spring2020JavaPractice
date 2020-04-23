package Reptworking.Array;

import java.util.*;

public class Array_117 {
    /*

    yanlids


     Given an array nums with 7 integers every element is
     repeated twice - except one. Find that element and print
     it to console.




     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int result =0;

        //TODO: write your code below
        for(int j= 0; j<nums.length; j++){
            int count= 0;
            for(int i=0; i<nums.length;i++){
                if (nums[i]==nums[j]){
                    count++;
                }
                if(count==1){
                    result=nums[j];

                }
            }


        }

        System.out.println(result);

    }
}