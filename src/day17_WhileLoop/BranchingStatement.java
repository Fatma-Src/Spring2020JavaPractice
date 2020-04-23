package day17_WhileLoop;

public class BranchingStatement {
    public static void main(String[] args) {
        //System.exit(0):

        for(int i= 0; i<5; i++){
            if(i%2!=0){
                break;// exit imnitry
                //continue; //skip that statemnet
            }//System.exit(0):stops teh entire program immediately
            System.out.println(i);
        }

        System.out.println("Test completed");


        if (10 < 9) {
            System.exit(0);

        }
        System.out.println("hello word");







    }
}
