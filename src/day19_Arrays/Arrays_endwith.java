package day19_Arrays;

public class Arrays_endwith {
    public static void main(String[] args) {


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
