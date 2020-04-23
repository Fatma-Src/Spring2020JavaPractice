package Reptworking.Methods;



public class Method_tobe {
    public static void main(String[] args) {
        boolean x= false;
        boolean y= true;
        boolean result1=hamletQuote(x,y);
        System.out.println(result1);


    }
    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        // hamletQuote is ||
        boolean result= toBe || notToBe;
        return result;

    }
}
