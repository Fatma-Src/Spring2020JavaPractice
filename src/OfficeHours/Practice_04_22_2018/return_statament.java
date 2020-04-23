package OfficeHours.Practice_04_22_2018;

public class return_statament {
    public static void main(String[] args) {
    /*
        if(10>9){
            return;
        }
     */

        method1();

        System.out.println("Hello Batch 18");


    }


    public static void method1(){

        if(10>9){
            // return;
            System.exit(0);

        }

        System.out.println("Hello Cybertek");

    }



    public static void method2(){
        return; // it means you exxit the method , in void method of we use return it means exit
    }

    public static int method3(){
        return 123; //exit and give the value in data type of
    }
}
