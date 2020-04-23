package Reptworking.Array;

public class Print_even_from_80to20_Loop113 {
    /*
   Write a for loop that prints all the even integers from 80 through 20 inclusive, separated by spaces.

MUST USE FOR EACH LOOP
     */
    public static void main(String[] args) {

     int[] arr= new int[80];
        for(int i=0; i<80; i++) {
            arr[i] = i + 1;

        }


        for(int each:arr){
            if(each>=20 && each%2==0){
                System.out.print(each+" ");
            }
        }




    }
}
