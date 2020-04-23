package day18_NestedLoop;

public class do_While_Practice {
    public static void main(String[] args) {
        /*
        print all even number 0- 100 in the same line speratied by a space
         */
        int num=0;


        do{
            if(num%2==0) {//num%2!=0 odd number

                System.out.println(num + " ");
            }

           num++;
        }while(num <= 100);

        System.out.println("========================================");

        int i= 1;//place of teh itiretor is important
        do{
            i++;//2,3,4,5,6,
            System.out.println(i);
            //i++; it start 1,2,3,4,5

        }while (i<=5);//loop excuted 5 times

        System.out.println("=============================================");


        int z= 1;

        do{

            System.out.println(z);
            if(z==3){
                break;
            }

            z++;
        }while (z<=5);

        System.out.println("===============================================");

        int y=1;
        do{
            System.out.println(y);
            if(y==3){
                y++;
                continue;}
                System.out.println(y);


            y++;

        }while(y<=5);


        System.out.println("=========================================");

        int t=1;

        do{

           if(t%2!=0){
                t++;
            continue;
        }
            System.out.println(t+"");
            t++;
        }while (t<= 100);




    }
}
