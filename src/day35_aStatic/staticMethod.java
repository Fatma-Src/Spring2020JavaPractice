package day35_aStatic;

public class staticMethod {
    int a =100;
    static int b=200;

    public static void main(String[] args) {
        // System.out.println(a);it give error because we did not have any object we

        staticMethod obj = new staticMethod();
        System.out.println(obj.a);//we  can only call with object

        System.out.println("================================================================");

        //for the static var.we use without object
        System.out.println(b);
        System.out.println(staticMethod.b);//static prefer to call teh class name
        System.out.println(obj.b);

    }
    public void method() {
        System.out.println(a);//it is only accept in instance method
        System.out.println(b);//static values acceot all static method and instance method  so it is globel
    }







    }






