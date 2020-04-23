package day22_ArrayLoops;

public class Java_Pyton {
    /*
write a program that can return the number of appearances
 of "java" and "python" anywhere in the sentence
 (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)

     */
    public static void main(String[] args) {
        String sentence = "I lile java and javascript python and pyyhon";
        sentence= sentence.toLowerCase();
        int countJava= 0; //2
        int countPhython=0;

        String []words= sentence.split(" ");//[ I, like, java,and ,javascirpt]

        for(String each:words){
            if(each.contains("java")){
                countJava++;
            }
            if(each.contains("python")){
                countPhython++;
            }


        }
        System.out.println(countJava);
        System.out.println(countPhython);
        System.out.println(countJava==countPhython);
    }
}
