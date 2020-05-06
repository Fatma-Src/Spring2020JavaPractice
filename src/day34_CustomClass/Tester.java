package day34_CustomClass;

public class Tester {

    /*
create a class called Testers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
create a class called Bank Of America:
			bank of America is planning to create thier thier automation team, there fore they are hiring three testers
			create a list called AutomationTeam and store three Testers in it
			write a program that can remove the tester if he/she is manual tester
			write a program that can calculate the total budget of the Automation team

     */

    String name;
    long employeeID;
    String JobTittle;
    double Salary;




    public void setTesterInfo(String name, long employeeID, String JobTittle, double Salary){
       this.name= name;
       this.employeeID= employeeID;
       this.JobTittle= JobTittle;
       this.Salary=Salary;

    }
    public String toString(){
        return "Name: "+ name+ ", job Title: "+ JobTittle+ ", employee ID: "+
                employeeID+ ", Salary: "+ Salary;
    }



}
