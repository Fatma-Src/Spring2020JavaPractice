package Day27_DateTime;

public class unique_Arrays {

/*
write a method that can print out the unique elements from an int array
					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9
 */

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3};
        //

        for (int each2 : arr) {
            int count = 0;
            for (int each : arr) {
                if (each == each2) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each2);
            }
        }
        System.out.println("=========================================");
        int []arr1= { 2,3,45,5,56,11};
        UniqueElement(arr1);
    }
    public static void UniqueElement(int[]arr){

        for (int each2 : arr) {
            int count = 0;
            for (int each : arr) {
                if (each == each2) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each2);
            }
        }


    }
    public static void UniqueElement(double[]arr){

        for (double each2 : arr) {
            int count = 0;
            for (double each : arr) {
                if (each == each2) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each2);
            }
        }


    }
}



