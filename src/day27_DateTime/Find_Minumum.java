package Day27_DateTime;

public class Find_Minumum {
    public static void main(String[] args) {

        int[]arr = {5,4,7,5,};

        int  min= arr[0];
        for(int each: arr){
            if(each<min){
                min=each;
            }
        }

        System.out.println(min);
        System.out.println("===============================================");

        int []arr2={78,100,-100};
        System.out.println(minimum(arr2));

        double [] arr3= { 55.,10.5,1.5};
        double num1=minimum(arr3);
        System.out.println(minimum(arr3));






    }

    public static int minimum (int[]arr){
        int  min= arr[0];
        for(int each: arr){
            if(each<min){
                min=each;
            }
        }
        return min;

    }
    public static double minimum(double[] arr){
        double  min= arr[0];
        for(double each: arr){
            if(each<min){
                min=each;
            }
        }
        return min;

    }




}
