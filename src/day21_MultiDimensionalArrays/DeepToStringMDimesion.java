package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class DeepToStringMDimesion {
    public static void main(String[] args) {
        int  [] arr1D= {1,2,3};
        System.out.println(Arrays.toString (arr1D));//Array to string model only desig for onde dimension array

        int [][]arr2D= { { 1,2,3},{4,5,6}};


        System.out.println(Arrays.toString(arr2D));//give hastag number
        System.out.print(Arrays.deepToString(arr2D));

        System.out.println("=====================================");

        int [][][] arr3D= { {{1,2,3},{4,5,6}} ,{{8,7,9}}  };
                            //  0
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[0][1]));
        System.out.println(arr3D[1][2][3]);





    }
}
