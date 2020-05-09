package day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Developer;

public class HumanResources {

    static Developer dev1= new Developer();//you can use in static block
    static Developer dev2= new Developer();
    static Developer dev3= new Developer();
    static Developer dev4= new Developer();
    static Developer dev5= new Developer();
    // dev1.setInfo("Namik","Developer",120000,123); we can not complier error
    //inilitize more than one use static block
   static{// we inilizi setinfo in static block so we can use them in other class
       //we can inilize any satic variable in block
        // static Developer dev1;
        //for the instance var we can not use static block
       dev1.setInfo("Namik","Developer",120000,123);

   }



/*we can not use initlize in main methot to use other class
    public static void main(String[] args) {
        dev1.setInfo("Namik","Developer",120000,123);
    }
 */



}
