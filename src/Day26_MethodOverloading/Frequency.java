package Day26_MethodOverloading;

public class Frequency {
    /*
    1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
     */

    public static void main(String[] args) {
        String str = "ABA";
        char ch1 = 'A';
        char[] arr = str.toCharArray();//[A,A,A];


        int count = 0;
        for (char each : arr) {
            if (each == ch1){//  contains kullanamiyoruz cunky ch not string
            count++;}
        }
        System.out.println("A"+count);

        String str2 ="ABcdBB";
        char  ch2= 'B';
        int num2=frequency(str2,ch2);
        System.out.println("B"+num2);

    }




    public static int frequency(String str,char ch) {
        char[] arr = str.toCharArray();//[A,A,A]

        int count = 0;
        for (char each : arr) {
            if (each == ch) {//  contains kullanamiyoruz cunky ch not string
            count++;}
        }

        return count;

    }











}
