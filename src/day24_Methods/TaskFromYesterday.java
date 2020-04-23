package day24_Methods;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class TaskFromYesterday {
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,3,2,1};
        MaxNumber(arr);//if the parameter is array, teh argument is array
        MaxNumber(arr);
        Descending(arr);
    }
    public static void MaxNumber(int[]array){
        Arrays.sort(array);//ascending order
        System.out.println("Maximum Number: "+ array[array.length-1]);
    }

    public static void MinNumber(int[]array){//there is paramater is int[]array
        Arrays.sort(array);
        System.out.println("Minumum Number: "+ array[0]);
    }

    public static void Descending(int[]array){
        Arrays.sort(array);//ascending method
        for(int i= array.length-1; i>=0; i--){//decending order
            System.out.print(array[i]+" ");
        }
        System.out.println();


    }
}
