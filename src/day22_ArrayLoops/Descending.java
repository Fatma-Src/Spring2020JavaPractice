package day22_ArrayLoops;


import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        int [] arr= {10,78,2,-1,500,70};
        Arrays.sort(arr);//sort in ascending order


        int[]reverse= new int[arr.length];

        int j= arr.length -1;
        for(int i= 0; i<arr.length; i--){
            reverse [i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(reverse));

        //for each is good only if you are not thinking index number
    }
}
