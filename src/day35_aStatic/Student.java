package day35_aStatic;

public class Student {//for Cybertek Student

/*

 */


    String name;
    int id;
    double gpa;

    static String school="Cybertek";

    public void setInfo(String name,int id, double gpa) {//if we are using any instance,the
        this.name = name;
        this.id = id;
        this.gpa = gpa;

    }
    public static void printSchoolName() {
        System.out.println("School Name is : " + school);
    }
    public String toString (){
        return "Name:  "+name+"School Name:"+ school;



    }


}
