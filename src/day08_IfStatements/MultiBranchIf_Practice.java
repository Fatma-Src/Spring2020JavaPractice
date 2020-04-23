package day08_IfStatements;

public class MultiBranchIf_Practice {



    public static void main(String[] args) {

        double score = 95.5;

        boolean AGrade  = score >=90 && score <=100;
        boolean BGrade = score>= 80 && score <90;
        boolean CGrade = score >=70 && score< 80;
        boolean DGrade = score>=60 && score <70;

        char grade = ' ';// we can use string grade = " Grades" before you should always initilized one values
        // no need to string because we need to only one charter
        if(AGrade){
            grade = 'A';
        } else if (BGrade){
            grade = 'B';
        } else if (CGrade){
            grade = 'C';
        } else if (DGrade){
           grade= 'D';
        }else grade = 'F';

        System.out.println("Score " + score + " is " + grade);

        char a= 87;
        int z= a;
        char x = a;
        double m = a;



        System.out.println(a);
        System.out.println(z);
        System.out.println(x);
        System.out.println(m);





    }





}
