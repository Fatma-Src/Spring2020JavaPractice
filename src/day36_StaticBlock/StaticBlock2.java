package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock2 {
    static int a;
    static int b;
    int c;
    static Tester tester1 = new Tester();

    static {//to use variable in other class we need to initlize in static block
        a=100;
        b=200;
        //c=300 ; //static only accepts static

        if(100>200) {
            a = 100;
            ;
        }

        tester1.setTesterInfo("Jean", 1233,"SDET",122000);


    }

    public static void main(String[] args) {//if we initize value of object we can only use in this class
       // tester1.setTesterInfo("Jean", 1233,"SDET",122000);
        System.out.println(tester1);
    }


}
