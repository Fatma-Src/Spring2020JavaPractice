package day36_StaticBlock;

public class StaticBlock {//initilize means assinging
    static{//the first compleier run static block it excutises this blosck, and run first and only one times
        System.out.println("Static block executed");
    }
    public static void main(String[] args) {
        System.out.println("Main Method executed");
        method1();

    }
    public static void method1(){//it is not executis when it call in main method
        System.out.println("Custom Method executed");
    }

}
