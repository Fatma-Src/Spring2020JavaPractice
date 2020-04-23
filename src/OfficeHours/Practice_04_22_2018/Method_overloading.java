package OfficeHours.Practice_04_22_2018;

public class Method_overloading {

    public static void main(String[] args) {

        method1();
    }
    public static void method1(){
        System.out.println("Hello world");
    }

    public static int method1(int a){
        System.out.println("Hello Cybertek");
        return 123;

    }
    public static void method1(int a, int b){
        System.out.println("hello b18");
    }

}
