package day35_aStatic;



public class staticVariables1 {

    int insVariable;    // every single object of the class has its own copy of instances
    static int staticVariable;   // there is only one copy of static shared by all objects

    public static void main(String[] args) {

        staticVariables1 obj1 = new staticVariables1();
        obj1.insVariable = 300;
        obj1.staticVariable = 400;

        staticVariables1 obj2 = new staticVariables1();


        System.out.println(obj1.insVariable); // 300
        System.out.println(obj2.insVariable);   //0

        System.out.println();

        System.out.println(obj1.staticVariable);  // 400
        System.out.println(obj2.staticVariable);

        System.out.println();
        System.out.println(staticVariables1.staticVariable);//static cane be called though name
        ///System.out.println(staticVariables1.insVariable);it gives error,



    }
}
