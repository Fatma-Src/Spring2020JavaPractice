package day09_NestedIf_Ternary;

public class AgeGroup_NestedIf {
    /*
    write a program that can define the age groups of a person
    age groups are:
    teenager(<21)
    Adult >= 21&& <55
    Senior (>=55)
    age cannot be negative  or greater  than 150
     */
    public static void main(String[] args) {

        int age= 27;
        String ageGroup ="" ;

        if (age>0 && age<150){
            if(age<21){
                ageGroup= "Teenager";
            }else if (age<55){
                ageGroup = "Adult";
            }else {
                ageGroup ="Senior";
            }

        }else{
            ageGroup = "Invalid Entry";
        }


        System.out.println(ageGroup);
        System.out.println("===========================================================");
         int age2 = 45;
         String ageGroup2 ="";
         if (age>0&&age <150) {
             ageGroup2= (age<21)?"Teenager":(age<55)?"Adult":"Senior";
        }else {
           ageGroup2 = "invalid entery";
        }
        System.out.println(ageGroup2);



    }











}
