package Day25_MethodsRecap;

public class Warmup {
    /*
    remove duplicate
     */
    public static void main(String[] args) {
        String str= "ABAB";
        String result="";//AB

    for(int i =0; i<str.length(); i++){
        String ch=str.charAt(i) +"";//A
        if(!result.contains(ch)){
            result+=ch;
        }
    // char ch= str.charAt(i)

    }
        System.out.println(result);


    }
}
