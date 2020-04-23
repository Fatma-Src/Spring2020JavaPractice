package day14_StringClass1;

public class practice {

    public static void main(String[] args) {

        String gmail = "Cybertekschool@gmail.com";

        String userinoutGmail = "Cybertek@gmail.com";

        //boolean result = gmail.equals(userinoutGmail); //false
        boolean result = gmail.equals(userinoutGmail); //true

        if (result) {
            System.out.println("log in");
        }

        /*8 valid password must contain a speicla char
        such as (!.....$)
        valid pasword should not contaons space
         */

        String Password = " mmasd1235";

        if (Password.contains(" ")) {
        System.out.println("Password cannot have a space in it");
    }else {
            System.out.println("valid password");
        }

        System.out.println("=============================");
        /* everywebsites has "www." a
        t the beginning of teh web adress
         */

        String webAdress = "amazwww.on.com";
        webAdress= webAdress.toLowerCase();//because Java case sensitive
        if (webAdress.startsWith ("www.")){
            //fasle if we use contain method it give logic error
            System.out.println("valid");
        }

        /*
        every single gmail adress ends eith @gamil.com

         */

        String email= "CybertekSchool@yahoo.com";
        if( email.endsWith("@gmail.com")){
            System.out.println(" valid gmail");
        }else{
            System.out.println("Invalid gmail");
        }



















    }
}
