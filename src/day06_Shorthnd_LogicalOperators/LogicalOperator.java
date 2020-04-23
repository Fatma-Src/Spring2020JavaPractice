package day06_Shorthnd_LogicalOperators;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

public class LogicalOperator {

    public static void main(String[] args) {

        boolean result1 = true;
        System.out.println(!result1);//false

        boolean result2 = !(10+15>15); //false

        System.out.println(result2);

        boolean result3 = !true== !false; // false ==true

        //&& and logic

        boolean R1 = " Corona Virus " != "End of the Life " && "Tulavate Paper" == "Cure";
                        //true && False ==> false
        boolean R2 = 10>15 && 15 < 13;
                    //false && false ==> false
        System.out.println(R1);
        System.out.println(R2);

        boolean R3 ='a' =='b'-1 && 'b'+ 1 =='c';
               // 97 ==98-1 && 98+1 ==99
        System.out.println(R3);


        //|| or logic
        boolean R4 = true != false || false == false;
                    // true || true ==> true
        System.out.println(R4);

        boolean R5 = true != false || !false == !true;
        //true ||false
        System.out.println(R5);// true

        boolean R6 = !!!!!!!false;// even !! it turns ownbut odd opposite expression
        System.out.println(R6);












    }





}
