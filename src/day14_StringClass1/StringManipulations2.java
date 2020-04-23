package day14_StringClass1;

public class StringManipulations2 {
    public static void main(String[] args) {
    String str = "";
    boolean bool1= str.isEmpty();//true
        /*
        we use this method , to check to user fill
        impotant or necesarry part.

         */
        String username = "";
        System.out.println(bool1);
        if(username.isEmpty()){
            System.out.println("enter your login ");
        }

        /*
        we use this method , to check to user fill
        impotant or necesarry part.


         */

        String z1 = " Tiger";
        String z2= new String ("Tiger");
        String z3 = " Tiger";
        String z4 ="tiger";
        //==
        System.out.println(z1==z2);//false
        System.out.println(z2==z3);//false
        System.out.println(z1==z3);//false

        //equals():
        System.out.println(z1.equals(z2));//true
        System.out.println(z2.equals(z3));//true
        System.out.println(z1.equals(z3));//true
        System.out.println(z3.equals(z4));//false

        String s1 = "Cat"; // String literal
        String s2 = new String("Cat");

        System.out.println(s1 == s2);  // false, different memory locations, different objects

        System.out.println(   s1.equals(s2)    ); // true

    }
}
