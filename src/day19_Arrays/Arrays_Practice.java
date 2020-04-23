package day19_Arrays;

public class Arrays_Practice {
    public static void main(String[] args) {

        String[]Names = { "Nedime","Nurefsan", "Hacer", "Nurgul", "Ayse"};

       /* System.out.println( Names[2]);
        String s1=Names[2];
        System.out.println(s1);
        */

       for(int i =0; i<=5; i++){

         String friend= Names[i];
           System.out.println(friend);
       }


        String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};

        // print out all the users who regsitered with thier gmail

        //  max:  4

        for (int i = 0; i <= 3; i++) {
            String email = emails[i];
            if (email.endsWith("@gmail.com")) {
                System.out.println(email);
            }

        }








       }







    }
