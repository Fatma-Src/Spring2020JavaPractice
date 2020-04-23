package OfficeHours.Practice_04_22_2018;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class void_Method {
    /*
    declare: Access-modifier    specifier     return-Type    methodName(paramater)
                public           static      void/dataType
                statemnet

    */


    public static void main(String[] args) {
        print();

        System.out.println("=======================================");
        boolean USCitizen=true;
        int age= 21;
        Vote(age,USCitizen);

    }

    public static void print(){
        for( int i= 0; i<=5; i++) {
            System.out.println("Hello Batch18");
        }
    }

//write afunction that can identify if a person is eligible to vote
    // must know age, USCitizezn
    public static void Vote(int age, boolean USCitizen){
         boolean eligibletoVote = age>18 && USCitizen==true;
        if(eligibletoVote==true){
            System.out.println("you are eligible to vote");
        }else{
            System.out.println("you ar enot eligible to vote yet");
        }


    }






}
