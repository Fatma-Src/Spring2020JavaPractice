package Reptworking.Methods;

public class Method_boolean { public static void main(String[]args){
    boolean test= true;
    System.out.println(validateTask(test,4,2));
}
    public static boolean validateTask(boolean notEmpty,int taskId,int currentId){
        if (notEmpty==true){
            if(taskId==currentId+1){
            notEmpty=true;
            }else if (taskId==currentId+1 ){
            notEmpty=false;
            }else {
            notEmpty=false;}
        }else {
            notEmpty = false;
        }

        return notEmpty;
    }
}





