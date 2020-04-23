package day16_ForLoop;

public class BreakStatement {
    public static void main(String[] args) {
        for(int i= 1; i<=5;i++){//i:1,2,3,4,,5,
            if(i==3){
                break;
            }
            System.out.println("Hello World");
           /*
           if(i==3){
                break;
            }//now three times printing

            */

        }

        /*for(int i= 1; i<=5;){
            System.out.println("Hello World");
            break; if there is break only ine tiems write
if no break it continues forever
        }*/
        for(char i= 'a'; i<='z'; i++) {//i:1,2,3,4,5
            if (i == 'e') {
                break;
            }
            System.out.println(i);
        }


       for( int i=0;i<=20;i++){
           if(i%2!=0){
               continue;//skip all teh odd number
           }

           System.out.print(i+" ");
       }



    }
}
