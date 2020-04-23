package Reptworking.Array;

import java.util.Arrays;

public class Array_113 {
    public static void main(String[] args) {

        int[] arr = new int[80];
      for (int i=0; i<=79; i++){
          arr[i]=i+1;
      }

      int []reversedarr= new int[80];
      int j=arr.length-1;
      for(int i=0; i<=arr.length-1; i++){
          reversedarr[i]=arr[j];
          j--;
      }



        for (int each : reversedarr) {
            if (each>=20 && each % 2 == 0) {
                int nums=each;
                System.out.print(nums + " ");
            }
        }
    }
}
