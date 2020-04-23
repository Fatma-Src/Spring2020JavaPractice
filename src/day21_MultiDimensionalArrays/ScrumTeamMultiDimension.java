package day21_MultiDimensionalArrays;

public class ScrumTeamMultiDimension {
    public static void main(String[] args) {
        String [] DevTeam= {"Zeynep", "Haider","Jpovid","Muhtar"};
        String [] Testers={"Rahman", "Aisan ", "Osman", "Ali"};
        String [] PO={"Barzy", "Donald"};
        String [] TestersTeam2={"Ayse","Melike","Ali"};





         String [][]ScrumTeam={DevTeam, Testers, PO};
         //                       0        1      2

       ScrumTeam[0] [3]  = "Jean";
       ScrumTeam[1]= TestersTeam2;
        System.out.println( ScrumTeam[0] [3]);

       String info= ScrumTeam[1][2];
        System.out.println(info);
        System.out.println("===================================");

       for ( String eachEmplyee:ScrumTeam[0]){
           System.out.println(eachEmplyee);

       }
        System.out.println("==================================");
        System.out.println(ScrumTeam[2][1]);

        //replace team








    }
}
