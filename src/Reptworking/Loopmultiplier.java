package Reptworking;
import java.util.Scanner;
public class Loopmultiplier {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i= 1;
        int sum=1;

        for(i=1; i<=n; i++){

            sum=sum*i;
        }
        System.out.println(sum);








    }
}

