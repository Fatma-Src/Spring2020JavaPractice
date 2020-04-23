package day22_ArrayLoops;

import java.util.Arrays;

public class Multi_DArray {//this class explain how we print 2D array and elemnt and array

    public static void main(String[] args) {
        int [] arr= {1,2,3};
     // n dimesional array contains (n-1) dimensiola array
     // 2D array:

     int [][] arr2D = {{1,2,3},{4,5,6}};
     //                   0       1
     int[]arr1D = arr2D[0]; // {1,2,3}
        System.out.println(Arrays.toString(arr1D));
        System.out.println(Arrays.toString(arr2D[0]));

        System.out.println(arr2D[0][2]);// we can print only int
        System.out.println(Arrays.deepToString(arr2D));//can we print two dimensional array

        System.out.println(Arrays.toString(arr2D[1]));

        for (int eachElement1:arr2D[0]){
            System.out.println(eachElement1);

        }
        for(int i = 0; i< arr2D[0].length; i++){
            int num= arr2D[0] [i];
            System.out.println(num);
            //System.out.println(arr2D[0] [i]);
        }






    }
}
