package OfficeHours.Practice_03_18_2020;

public class UniaryOperators_Practice {

    public static void main(String[] args) {
        //post ; first passae the vale tah increase

        int a= 20;
        System.out.println(a++);//20
        System.out.println(a); //21


        int b = 30;
        int c = b--;///c= 30 b= 29

        System.out.println(b);
        System.out.println(c);

        int d = 40;
        int e = d++;
        System.out.println(d);//
        System.out.println(e);//

        int x= 200;
        System.out.println(--x);//199
        System.out.println(x);//199

        int z=100;
        z= z++ + --z - z-- + ++z;
        //z=100 + 100 - 100+ 100
        System.out.println(z);

        int u= 900;//
        int r= - ++u + ++u + -u++;
        //r = -901 + 902 + -902

        System.out.println(r);
        System.out.println(u);






    }






}
