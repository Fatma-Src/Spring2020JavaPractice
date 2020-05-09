package day36_StaticBlock;

import day34_CustomClass.Tester;

public class staticBlock3 {
    static String name;
    static int num;
    static Tester tester1;


    static{// we can write more than one static blocks
        name="Muhtar";
        num=100;

        tester1=new Tester();
        tester1.setTesterInfo("Namik",123,"SDET",123000);
    }


    public static void main(String[] args) {
      /*  name="Muhtar";
        num=200;
        System.out.println(name);
        System.out.println(num);*/
    }
}
