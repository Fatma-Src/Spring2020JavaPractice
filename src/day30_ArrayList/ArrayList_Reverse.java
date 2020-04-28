package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Reverse {
    /*


     */
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        for(int i =1; i<6; i++){
            list.add(i);

        }
        System.out.println(list);
        ArrayList<Integer>reversedList= new ArrayList<>();

        for (int i=list.size()-1; i>=0; i--){
            int eachNum= list.get(i);
           // System.out.println(eachNum);
            reversedList.add(list.get(i));
        }


        System.out.println(reversedList);
    }
}
