package day23_Methods;

public class Method_Practice {
    /*
step1: Hello Cybertek
step2: Hello World 5 times
step3: Hello Btach 18
step4: Hello World 5 times
step5: Helle Saim
step6: Hello World 5 times

     */
    public static void main(String[] args) {

        System.out.println("Hello Cybertek");
        printHello5();
        System.out.println("Hello Batch18");
        printHello5();
        System.out.println("Hello Saim");
        printHello5();


        System.out.println("===========================");

        evenNumber1_100();
        OddNumber1_100();// bu calismiyor


    }
    public static void printHello5(){
        for(int i=0; i<5; i++){
            System.out.println("Hello World");
        }
    }

    public static void evenNumber1_100(){
        for(int i = 1; i<=100; i++ ){
            if (i % 2 == 0) {

                System.out.print(i+" ");
            }
        }


    }


    public static void OddNumber1_100(){
        for( int j =1; j<=100; j++){
            if(j%2!=0){
                System.out.print(j+" ");
            }
        }
    }






}
