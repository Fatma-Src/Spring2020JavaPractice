package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {
    public static void main(String[] args) {
        // Carpet carpet= new Carpet();// it is use only one

       Carpet[]carpets={ new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};
        System.out.println(carpets[0]);
        /* if we are define method of string to stirng code gives
        hash code,so we write method in carpet class
        After we write method string to srtirg we have 0.0 because is it defaut value of double
         */

        carpets[0].customOrder(7,8.5,20,true);
        carpets[1].customOrder(10,15,30,false);
        carpets[2].customOrder(9,20,15,true);
        carpets[3].customOrder(20,18,25,false);
        carpets[4].customOrder(35,45,35,false);

        System.out.println(carpets[2]);

    ArrayList<Carpet> persianCarpets= new ArrayList<>();

    for(Carpet eachCarpet : carpets){
        if(eachCarpet.isPersian){//call boolean
             persianCarpets.add(eachCarpet);
        }
    }

        System.out.println("there are " + persianCarpets.size()+ "persian carpets");
        System.out.println(persianCarpets.get(1).calsCost());// total price of
        System.out.println(persianCarpets.get(0).calsCost());// tatal price of


        ArrayList<Carpet> regularCarpets= new ArrayList<>(Arrays.asList());// we but all list then remove persial
        regularCarpets.removeAll(persianCarpets);


        System.out.println("There are " + regularCarpets.size()+ " regular carpets.");


        for(int i = 0; i< regularCarpets.size(); i++){
            System.out.println( regularCarpets.get(i).calsCost()  );
        }





    }
}
