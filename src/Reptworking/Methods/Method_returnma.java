package Reptworking.Methods;

public class Method_returnma {
    /*
    max function gets two ints, x and y.
x is the test case, max is what we test against.

if  x is bigger then max return max
in any other case return x.

for example:

max(1,10)
returns 1

max(11,5)
returns 5
     */
    public static int max(int x,int  y){
        int max=x;
        int result=y;

        if(x>y){
           max=x;
          result= y;
        }else {
            max=y;
            result= x;

        }
    return result;
    }

    public static void main(String[] args) {
        System.out.println("returns " + max(1, 10));
    }



}
