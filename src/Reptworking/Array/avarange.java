package Reptworking.Array;

import java.util.Scanner;

public class avarange {
    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            int k = 0;
            double total = 0;
            double avgTemp = 0;
            double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                    scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
            for (double  each: temps){
                total= total+each;
                k++;
                System.out.println(each);
            }

            avgTemp=total/k;
            System.out.println(avgTemp);


    }



}
