package day06_Shorthnd_LogicalOperators;

public class ShortHandOperator {

    public static void main(String[] args) {

            int x = 20;
            x += 10;  // x = x+ 10
        System.out.println(x);//30

         x += 60; // x = x + 60
        System.out.println(x);// 90

        String schoolname = " CyberTek";
         schoolname += 12345; // schoolname = schoolname + 12345

        System.out.println(schoolname);// CyberTek12345


        char ch1 = 'a';
            ch1 += 'b';
        System.out.println(ch1);//charcter

        int num = 'z';
        num += 'x';
        System.out.println(num);//242

        int A = 100;
             A -= 90;
        System.out.println(A);

        int B = 200;
            B -= A ;// B= B-A
        System.out.println(B);

        int a= 2;
        a*= 3;
        System.out.println(a);// 6

        int b = a*= 10;
        //b= 60
        System.out.println(b);//60
        System.out.println(a);//60
        int a1 = 100;
        int b1 = (a1 *=2)  +  ++ a;
        // b1 200 + 201 ==401
        System.out.println(b1);

        int x1 = 10;
        int y1 = x1 += 10*2 ;// x1 = x1 + 20
        // x1 += 20 . ++> 30
        System.out.println(x1);

        int q = 20;
         int p = q*=20* 3 ;
         // q * 60

        int num1 = 300;
        num1/=2; //num1= 150

        System.out.println(num1);
        int num2 = 400;
        num2 /= 20+10; // num2 = 400/30
        System.out.println(num2);

        int num3 = 300;
            num %= 10+ 20;// 300%30

        System.out.println(num);//0

        int n1 = 400;
            n1 %= 3*5;//400 %15
















    }















}
