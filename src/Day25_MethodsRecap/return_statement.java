package Day25_MethodsRecap;

public class return_statement {
    public static void main(String[] args) {

   /*
    if(10>9) {
        return;
    }
        System.out.println("Hello");

    */
  // method1();
       // System.out.println("Hello");// it can work because return is not effect it
    method2();
        System.out.println("Hello");//system.exit in method effect all system
    }
   public static void method1() {
       if (10 > 9) {
           return;
       }
       System.out.println("Hello Cybertek");// it is not work because of return
   }
   public static void method2(){
        if(10>9){
            System.exit(0);
        }
       System.out.println("Hello Cybertek");

    }
}
