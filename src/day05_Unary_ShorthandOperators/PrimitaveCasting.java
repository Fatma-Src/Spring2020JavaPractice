package day05_Unary_ShorthandOperators;

public class PrimitaveCasting {

    public static void main(String[] args) {
       int a = 10;
       long b = a;//implicit casting is done automatically
        //b= 10L
       //  int c = b; bi is still long datatype

        long a1 = 100;
        long b1 = (long)a1; // manually doing the impicit casting
        // Explicit casting
        int Inum =100;
        byte Bnum = (byte)Inum;

        short Snum = (byte)Inum;

        double Dnum = 5.5;
       // float Fnum = ( float) Dnum;  5.5.


        float Fnum = (int)Dnum;
        // Fnum = 5.0
        System.out.println(Fnum);
        double D1 = 10.5;
        long L1 = (int)D1;
        System.out.println(L1);

        char ch2 = 23456;
        System.out.println(ch2);
        double db11 = ch2; //implicat casting automatyl
        System.out.println(db11);

        int z1 = 10;
        double t11 = z1;
        short y1 = (short)t11;






    }








}
