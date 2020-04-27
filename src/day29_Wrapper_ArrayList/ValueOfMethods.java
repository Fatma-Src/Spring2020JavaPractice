package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class ValueOfMethods {
    public static void main(String[] args) {
        String str= "123";
        Integer a = Integer.valueOf(str);
        System.out.println(a);

    double b= Integer.valueOf(str);//unboixng
        // doubke =integr\

       String str2="15.5" ;

        double d1= Double.parseDouble(str2);
        //double=double
        double d2= Double.valueOf(str2);
        //double=Double//unboxing
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1==d2);
        System.out.println("========================================");
        int z1=2000;
        Short sh1 =3000;// does not accept any other primitive except for long
        /*


         */

        String b1="true";
        Boolean b2=Boolean.valueOf(b1);
        Boolean b3=Boolean.parseBoolean(b1);
        boolean b4= Boolean.valueOf(b1);//unboxing
        Boolean B4=b4;//autoboxing

        //FALSe
        String c1="FALSe";
        Boolean C1= Boolean.valueOf(c1);
        boolean c2= Boolean.parseBoolean(c1);//unboxing
        boolean c3=C1; //unboxing
        Boolean c5= Boolean.parseBoolean(c1);
        //10000000000000.5
       String f1= "10000000.5";
        float f2=Float.parseFloat(f1);
        Float F1= Float.parseFloat(f1);
        Float F2= Float.valueOf(str);
        float f3= Float.parseFloat(f1);
        float f4=Float.valueOf(str);
        //float f5 =1000000.5;we neeed casting

        float f5 =(float)1000000.5;//because complier assume it is double

    // short "123456

        System.out.println("==========================================");
    int maxNum=Integer.MAX_VALUE;
        System.out.println(maxNum);
     double maxNum2=Double.MAX_VALUE;
        System.out.println(maxNum2);
     int minNum3=Integer.MIN_VALUE;
        System.out.println(minNum3);
      byte minNum4=Byte.MIN_VALUE;
        System.out.println(minNum4);

        System.out.println("============================================");
      boolean [] arr= new boolean[3] ;
        System.out.println(Arrays.toString(arr));

       Integer[]arr2= new Integer[3];
        System.out.println(Arrays.toString(arr2));

    }
}
