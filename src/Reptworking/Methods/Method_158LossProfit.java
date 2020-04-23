package Reptworking.Methods;

import java.util.Scanner;

public class Method_158LossProfit {
    private Scanner input;

    /*
    c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
    it returns a string value that can be "profit","loss","no loss"
    
    for example:
    c_profis(100,1500)
    returns : "profit"
    
    c_profis(20,5)
    returns : "loss"
    
    c_profis(100,100)
    returns : "no loss"
    
         */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1=input.nextInt();
        int n2= input.nextInt();
        System.out.println(c_profits(n1,n2));
    }
    public static String c_profits (int buyPrice,int sellPrice){
        String result="";
        if(buyPrice<sellPrice){
            result= "profit";
        } else if (buyPrice > sellPrice) {
            result="loss";
        }else{
            result="no loss";
        }
        return result;



    }




}
