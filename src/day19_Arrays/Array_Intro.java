package day19_Arrays;

public class Array_Intro {

    public static void main(String[] args) {

        //int score = 90,20,30; we can not use this way it give error, it gives   error

        // variable DataType variable =Data


        /*
        Arrays
        declaration :
        Data Type[] variableName ={dat1, dat2, data3};
         70,75,85,90,95,100
         */

        int[] scores={70,75,85,90,95,100};
        //            0  1   2  3  4   5

        //retrive : variableName[index]
        int num1 = scores[2]; // 85int
        System.out.println(num1);
        int num2 = scores[5];//100, int
        System.out.println(num2);




    }
}
