package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Method {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(5);//0
        list1.add(7);//2
        list1.add(8);//3

        list1.add(1,6);//1
        //{5,6,7,8}
        //list1.add(7,10); out of boundry
        list1.set(3,9);
        System.out.println(list1);

        int[] arr= {1,2,3,4};// {1,2,3,4,5}

        arr[3]=5;










    }
}
