package day17_WhileLoop;

public class WhileLoopPractice2 {


    public static void main(String[] args) {

        for(int i= 0; i<=10;){
            if(i%2==0){
                System.out.println(i);
            }
        }

        System.out.println("===================================");

        int i=0;
        int sum = 0;

        while(i<=10){
            if(i%2==0){
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);

        System.out.println("==============================================");















    }
}
