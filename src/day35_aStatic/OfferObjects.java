package day35_aStatic;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {
    public static void main(String[] args) {

        Offer offer1= new Offer();
        //we initilize information with setinfo method
        offer1.setInfo("VA","BOA", 100000,true );

       // System.out.println(offer1);//we need define to toString Method

        Offer offer2= new Offer();
        offer2.setInfo("KY","CapitalOne",120000,false );

        Offer offer3= new Offer();
        offer3.setInfo("MD","Chase",95000,true);

        Offer offer4= new Offer();
        offer4.setInfo("CA","FB", 140000,false);

        Offer[] offer= {offer1,offer2,offer3,offer4};

        String myLocation="VA" ;

        ArrayList<Offer>Accept= new ArrayList<>(Arrays.asList(offer));

        System.out.println(Accept.size());//4
        // to print we need loop
        //Accept.removeIf(p->p.salary<100000.0);// you can give any name p or each
        Accept.removeIf(each->each.salary<100000 || each.isFullTime==false || each.location.equals(myLocation) );// we remove the offer  if it si lessthan 100000 or part time
        /*
        Accept.removeIf(each->each.salary<100_000);
        Accept.removeIf(each->!each.isFullTime);each.isFullTime==false because it is boolean
        Accept.removeIf(each->!each.Location.equals(mylocation));
         */
        for(Offer eachoffer:Accept){
            System.out.println(eachoffer);
        }




    }
}
