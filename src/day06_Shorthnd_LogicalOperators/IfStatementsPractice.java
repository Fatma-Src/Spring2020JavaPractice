package day06_Shorthnd_LogicalOperators;

public class IfStatementsPractice {
    public static void main(String[] args) {
        int a= 100;
        int b = 200;

        if (a>b) {

            System.out.println(a + " is greater than " + b);

        }
        if( b>a){
            System.out.println(b +" is greater tahn  "  + a );
        }
        if(a==b){
            System.out.println(a+ " is equal to " + b );
        }

        System.out.println("==================================================");

        int x = 200;
        int y = 300;
        boolean xGreater = x>y;
        boolean yGreater = y>x;
        if(xGreater){
            System.out.println(x +  " is greater than  "  + y );
        }
        if(yGreater){
            System.out.println(y +  " is greater than  "  + x );
        }
        if(xGreater==false && yGreater==false){//if(!xGreater && !yGreater ) or (xGreater ==yGreater)
            System.out.println(x + "is equal to y " + y);
        }






    }









}
