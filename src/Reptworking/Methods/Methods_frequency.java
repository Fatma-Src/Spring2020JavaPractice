package Reptworking.Methods;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class Methods_frequency {
    public static void main(String[] args) {

            String[] some_array = {"a", "foo", "bar", "foo", "bla"};
            String some_string = "foo";

            int count = count_appearance(some_array, some_string);
        System.out.println(count);


    }
        public static int  count_appearance(String[] arr, String t)
        {
            int count=0;

            String nondop="";
            for(int i=0;i<arr.length;i++){
                String newword=arr[i];
                if(newword.equals(t)){
                    count++;
                }

            }
            return count;
        }



    }







