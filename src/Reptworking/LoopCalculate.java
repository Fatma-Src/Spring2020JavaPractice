package Reptworking;
import java.util.*;
class LoopCalculate{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=0;
        int sum =0;

        for(i=1; i<=n; i++){//i=1
            sum+=i;
        }
        System.out.println(sum);






    }
}