package day07_IfStatements;

public class MaxNumber {

    public static void main(String[] args) {
       /*
        write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)

        */
            double a = 100.5;
            double b = 200.5;
            double c = 300.5;

            boolean aGreater = a>b && a>c;// if a is  greater tham both b ans c , then a is maximum
            boolean bGreater = b>a && b>c;// if b is  greater tham both c ans b , then a is maximum
            boolean cGreater = c>a && c>b;// if c is grteater than both a and b then a is max.

            if (aGreater){
                System.out.println( a + "is greater number");
            }
            if(bGreater){
                System.out.println( b + " is greater number");
            }
            if(cGreater){
                System.out.println(c + "is greater number");
            }

            /* other solution is
            if(a>b && a>c){

             */





    }


}
