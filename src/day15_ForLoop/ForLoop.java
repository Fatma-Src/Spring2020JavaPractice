package day15_ForLoop;

public class ForLoop {
    public static void main(String[] args) {

        /*System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");*/


      //  for(int i= 0; i < 5; i++){
         //   System.out.println("Hello World"+i);
        /* if we give no iterator it work infinity
        if we give i-- it gives infiniatly
        not to make logic error
        */

        for (int i = 1; i<=10; i+=2) {//i =1,3,5,7,9,  5 times
            //i+=2 : 1,3,5,7,9,
            // i++ :    1,2,3,4,5,6,7,8,9,10
            System.out.println("Hello World");
            System.out.println(i+ ":"+ (i*i));
        }














    }

}
