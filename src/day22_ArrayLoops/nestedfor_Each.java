package day22_ArrayLoops;

public class nestedfor_Each {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        //            0,1,2
        for(int each : arr){
            System.out.print(each);
        }
        System.out.println("================================");

    int[][]arr2D = {{},{}};
        //           0   1


     /* for(int[] each1Darray : arr2D) {
          for(int eachElement: each1Darray){
              System.out.println(eachElement);
          }
   }*/
        System.out.println("=================================");

        char[][] ch2D= {{'A','B'},{'C','D','E'},{'F','J','H'}};
        for(char[]  each1DArray: ch2D){
            for(char eachElement: each1DArray){
                System.out.println(eachElement);
            }
        }//for  each we cannot  reverse , because it is start 0











    }

}

