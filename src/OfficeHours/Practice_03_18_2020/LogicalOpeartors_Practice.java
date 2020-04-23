package OfficeHours.Practice_03_18_2020;

public class LogicalOpeartors_Practice {

    public static void main(String[] args) {
        //  ||  &&  !

        boolean r1 = "Muktar"== "bad guy"; // false
        System.out.println(r1);


        boolean r2 = "Muhtar" != " Good Guy";  //True
        System.out.println(r2);

        boolean r3= 10>=9;// true
        System.out.println(r3);

        boolean r4 = !false == !true;
        // true==false ==> false
        System.out.println(r4);

        // || or logic as long as one condition is true ==>
        boolean result1 = 9 != 8 || 9==8 ;
                            //true || false ==>true

        System.out.println(result1);

        boolean result2 = 'a' == 'A' || 'A' == 'b';
                    //false ||false ==> false
        System.out.println(result2);

        //  && logic as long as one condition is false it is false

        boolean result3 = 6>5 && 6<4 ; //false

        boolean result4 = !false != false && !true == false ;
                //        true  == false




    }
}
