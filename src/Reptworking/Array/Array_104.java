package Reptworking.Array;


import java.util.*;

public class Array_104 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        String newnum = "";
        for(int i= 0;  i<5; i++){
          newnum += ""+nums[i];
        }
        if(!newnum.contains("5")){
            System.out.println("false");
        }
        if(newnum.contains("55")){
            System.out.println("true");
        }
        if(newnum.contains("5") && !newnum.contains("55")){
            System.out.println("false");
        }








                }
        }































