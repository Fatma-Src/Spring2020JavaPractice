package Day25_MethodsRecap;

public class Return_method {
    public static void main(String[] args) {
        int maxnum= max(3,4);//
        //System.out.println(max(3,4));it works but we can not use again
        System.out.println(maxnum);
        int maxnum2=max2(3,4);
        System.out.println();
        System.out.println(max(3,4));

    }

    public static int max(int a, int b) {
        int max = 0;
        if (a >= b) {
            max = a;
        } else {
            max = b;
        }
        return max;

    }

    public static int max2(int a, int b){
        if(a>=b){
            return a;
        }
        return b;

    }

    /*

    CHeck how to apply driver task
    browserName=browserName.toLowerCase();//to  ignore case sensitivity

        if(browserName.equals("chrome")){
            return "Chrome Driver";
        }else if(browserName.equals("firefox")) {
            return "Chrome Driver";
        }else if(browserName.equals("safari")) {
            return "Safari Driver";
        }else if(browserName.equals("edge")) {
            return"Edge Driver";
        }else if(browserName.equals("opera")) {
          return "Opera Driver";
        }else{
           return "Invalid result";

        }
     */




}
