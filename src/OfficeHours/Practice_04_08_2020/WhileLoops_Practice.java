package OfficeHours.Practice_04_08_2020;

public class WhileLoops_Practice {
    public static void main(String[] args) {

        int z= 0;
        while (z<5){

            z++;
            System.out.println(z); //1

            //z++; we put iterator so it start 0

        }
        System.out.println("==========================================");
        /*

       0-100 divide can be 15
         */

        int j= 0;
        while(j<=100){
            if(j%15==0) {
                System.out.print(j + " ");
            }
            j++;
        }






    }
}
