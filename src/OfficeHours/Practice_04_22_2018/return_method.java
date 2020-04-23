package OfficeHours.Practice_04_22_2018;

public class return_method {
    public static void main(String[] args) {
      //int a= sum(10,20), it does not work because it is not give

    int num1=sum2(10,20); //return method
        System.out.println(num1);
        System.out.println("==========================================");
        String str="Cybertek";


        String result ="";
        for( int i =str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        System.out.println(result);
        String name ="Bank of Amerika";
        String name2=reverse(name);

        System.out.println(name2);

        System.out.println(name.equals(name2));//false  so it is not palagromi




    }
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static int sum2(int a, int b){
        int result= a+b;
// return a+b;
        return result;
    }

    public static String reverse(String str){
        String result ="";
        for( int i =str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
      return result;
    }







}
