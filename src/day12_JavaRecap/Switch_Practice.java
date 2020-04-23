package day12_JavaRecap;

public class Switch_Practice {

    public static void main(String[] args) {
        switch (3) {

            case 1:
                System.out.println("Case 1");
                // break; //exits switch statement
                break;
            case 2:
                System.out.println("Case 2");
                // break; //exits switch statement
            default:
                System.out.println("Invalid Case");
            break;

        }

        System.out.println("==============================================");

        int statusCode = 200;
        String result ="";

        switch (statusCode){
            case 200:
                result = "Ok";
                //System.out.println("Ok");
                break;
            case 201 :
                result ="Created";
                //System.out.println(" Created");
                break;
            case 202 :
                 result = "Accepted";
                //System.out.println("Accepted");
                break;
            default :
                result = " Invalid Status Code";
                //System.out.println("Invalid")
        }
        System.out.println(result);



    }

}

























