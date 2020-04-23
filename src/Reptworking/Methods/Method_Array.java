package Reptworking.Methods;

import java.util.Scanner;

public class Method_Array {
    /*
    Create a method called plus_minus that gets an array of ints (int[]), it outputs how many negative , positive and zero numbers are in the array.

for example:

plus_minus (new int[]{1,2,55,-9,-2,0});

will output:
positives:3, negatives:2, zeros:1


}
     */

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }

    public static void plus_minus(int [] num){
        int positive=0;
        int negative=0;
        int zero=0;
        for(int i=0; i<=num.length-1;i++){

            if(num[i]>0){
             positive++;
            }else if( num[i]<0){
              negative++;
            }else{
                zero++;
            }
        }
        System.out.println("positive:"+positive);
        System.out.println("negative:"+ negative);
        System.out.println("zeros"+zero);



    }

}

