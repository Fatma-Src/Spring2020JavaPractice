package day20_ArrayContinue;

public class Max_min {
    /*
 1. write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
    2. write a program that can find the minimum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE

    */

    public static void main(String[] args) {
        int[]arr={10,6,4,5,6,7,100,9};
        int lastindex=arr.length-1;
        int max=arr[0];//assume that the fist index is max
        int min=arr[0];//assume that the fist index is min

        for(int i=0; i<=lastindex; i++){
            if(arr[i]>=max) {//array's index are compared with each other
                max = arr[i];//whichever is greater will be assigned to max
            }

            if (arr[i]<min){
                min=arr[i];
            }


        }

        System.out.println(max);
        System.out.println(min);




    }
}
