package OfficeHours.Practice_04_08_2020;

public class Loop {
    public static void main(String[] args) {






        for(int i=1; i<=5; i+=2) {//i++:1,2,3,4,5
            //i+=:1,3,5
            System.out.println("Hello World" + i);
        }





        System.out.println("============================================");
        for(int j = 1; j<=5; j++) {
            System.out.println(j);//2
        }

        System.out.println("===========================================");

        for(int j = 1; j<=5; ) {
            j++;
            System.out.println(j);//2,3,4,5,6
        }
        System.out.println("==========================================");

        for(int j = 1; j<=5; ) {

            System.out.println(j);//2,3,4,5,6
            j++;
        }











    }
}
