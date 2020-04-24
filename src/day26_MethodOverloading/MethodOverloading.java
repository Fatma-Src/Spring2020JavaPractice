package Day26_MethodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {
        sum(10,20);//int
        double num1= sum(2.5, 3.5);//output is double
        sum(2.5, 3);//output is double//3 ans 2.5 argumenta
        System.out.println(num1);
        double num2=sum(25L,30L);// double a yaptik sonuc double
        // 5,4,
        // double num3= sum(5,4);//void  method does not return ayn value

// 5, 4
        //double num3 =  sum(5,4);   // poid method does not return any value

        //40L, 50L
        sum((int)40L, (int)50L);


    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static double sum(double a, double b){// double is paramater
        return a+b ;
        //in method overloading, return type is not matterm paramter important

    }


}




