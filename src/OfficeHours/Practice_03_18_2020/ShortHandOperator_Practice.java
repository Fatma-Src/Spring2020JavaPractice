package OfficeHours.Practice_03_18_2020;

public class ShortHandOperator_Practice {

    public static void main(String[] args) {
        // += :addition

        int a = 100;
       // a= a+200;
        a+=200;
        System.out.println(a);// a=300

        a+=200*3;//900
        System.out.println(a);

        // -= subtraction assigmnet
        // a=a-400;
        a-=400;//a=500
        System.out.println(a);


        int b=300;
        b-=3*40;//b-=120;==>180;
        System.out.println(b);


        //*= multiplication assignment
        int x=5;
        // x=x*3; //15
        x*=3;
        System.out.println(x);//15
        x*=2+1;
        System.out.println(x);// x=x*3 ==>45

        //  /= division assignment
        int n = 900;
        //n =n/3
        n/=3;//300
        System.out.println(n);//300


        n/= 3*5;
        System.out.println(n);// n/15= 20

        // %=  reminder assigment

        int m = 10;
        //m=m%3;//1
        m %= 3; //m=1
        System.out.println(m);

        int y=300;
        y %=3*5;//0  y=y%15
        System.out.println(y);

        int t = 400;
        t %=10*2; // t=400%20=0
        System.out.println(t);



















    }










}
