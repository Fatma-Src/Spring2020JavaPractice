package day09_NestedIf_Ternary;

public class NestedIf {

    public static void main(String[] args) {
        int age =17;
        boolean USCitezen = true;
       if(USCitezen) {
           if (age > 17) {
               System.out.println("You are eligibel to vote");
           } else {
               System.out.println(" You MUST be 18 or older to be able to vote");
           }
       }else {
           System.out.println("Only the US citizens are eligible to vote for ..");
       }


        System.out.println("===============================================================");

       int score = 99;
       String grade = "";
       if(score>=0 && score<=100){ // 0-100
           if(score >=90){
               grade = "A";
           }else if( score>=80){
              grade ="B";

           }else if (score>=70){
               grade = "C";
           }else if (score>=60){
               grade ="D";
           }else {
               grade = "F";
           }

       }else {// score is <0 or score >100
           grade = "Invalid";
       }
        System.out.println(grade);

       int score2=75;
       String grade2 = "" ;
       if(score2>=0 && score2<=100){
           grade2=(score >=90)?"A":( score>=80)?"B":( score>=70)?"C":( score>=60)?"D": "F";

       }else{
           grade = "invalid";
       }
        System.out.println(grade2);







    }










}
