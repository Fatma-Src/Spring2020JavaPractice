package day05_Unary_ShorthandOperators;

public class PostPre_Pratice {
    public static void main(String[] args) {

        int a = 50; //50
        a= --a + a++ +a-- + a ++;//197

         //49 + 49+  50+ 49
        System.out.println(a);

        int x = 4;
        int y = x*4-x++;
        // 4*4 -4=12

        int c = 1;
        c= -c--  + c++ / -c-- * --c;
        // -1 + (0) / (-1) * (-1)= 1
        System.out.println(c);










    }













}
