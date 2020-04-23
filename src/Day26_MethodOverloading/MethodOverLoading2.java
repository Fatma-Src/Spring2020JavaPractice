package Day26_MethodOverloading;

import java.util.Arrays;

public class MethodOverLoading2 {
    /*
    first method= print the sum of two numbers
    second method= print the sum of three int numbers
    third method = print teh sum of four int nums

     */

    public static void main(String[] args) {
        //10,5
        sum2Numbers(10,5);
        //10,5,5
        sum3Numbers(10,5,5);
        //10,3,3,2
        sum4Numbers(10,3,3,2);

        double[] arr={10,2,3,4};//sort method is overloading, we can use char,string , int
        Arrays.sort(arr);

        System.out.println("==================================================");
        //2,4
        sum(2,4);
        //2,6,7
        sum(2,6,7);
        //20,10,10,2
        sum(20,10,10,2);

        int[]arr1={3,2,1};
        char[]arr2= { 'z','t'};
        double[]arr3={3,4,5,};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        // Array sort is overloading method so we can use same method name, different parameter



    }


    public static void sum2Numbers(int a, int b){
        System.out.println(a+b);
    }
    public static void sum3Numbers(int a, int b,int c) {
        System.out.println(a + b + c);
    }
    public static void sum4Numbers(int a, int b,int c, int d ) {
        System.out.println(a + b + c+d );
    }
//=====================================================================

    public static void sum( int a, int b){
        System.out.println(a+b);
    }
    public static void sum( int a, int b,int c) {
        System.out.println(a + b + c);
    }
    public static void sum( int a, int b,int c,int d){
        System.out.println(a + b + c+d );
    }



}
