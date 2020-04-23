package day17_WhileLoop;

public class Frequency {
    public static void main(String[] args) {

        String str = "Java is fun, Java is cool";//is fun is

        int count= 0;

        while(str.contains("Java")){
            count++;
            str=str.replaceFirst("Java","");//after counting the first java we need to remove
        }
        System.out.println(count);











    }
}
