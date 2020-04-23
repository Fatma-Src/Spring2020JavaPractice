package day20_ArrayContinue;

import java.util.Arrays;


public class Array_Equal {
    public static void main(String[] args) {

        int[]arr1={1,2,3};
        int[]arr2={1,2,3};

        boolean result1 =Arrays.equals(arr1,arr2);
        System.out.println(result1);//true



        int[] arr3={3,2,1};
        int[]arr4={1,2,3};
        boolean result4= Arrays.equals(arr3,arr4);
        System.out.println(result4);// false

        int[] arr5={3,2,1};
        int[]arr6= {1,2,3};
        Arrays.sort(arr5);//[1,2,3]
        Arrays.sort(arr6); //[1,2,3]

        boolean result3= Arrays.equals(arr5,arr6);//true

        System.out.println(result3);








    }
}
