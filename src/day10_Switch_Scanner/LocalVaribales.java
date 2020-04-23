package day10_Switch_Scanner;

public class LocalVaribales {


    public static void main(String[] args) {
        //declare variable: DataType and variableName;
        int a  =0; //this is local variable
        System.out.println(a);
        if(true){
            System.out.println(a);
            int b= 10;
        }

        //System.out.println(b);it gives error. because local variable
        // can not used outside the block

     switch (3){
         case 1:
             int c = 100;

         case 2 :
             //System.out.println(c);

     }



     }


    }











