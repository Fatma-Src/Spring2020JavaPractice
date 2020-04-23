package Reptworking.Array;

import java.util.*;

class Array_107 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int count=0;
        //TODO: Write your code below
        for(int i= 0; i<5; i++){
            int k=nums[i];
            if(k%2==0){
                count++;
            }

        }
        System.out.println(count);

    }
}