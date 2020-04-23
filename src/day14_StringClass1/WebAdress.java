package day14_StringClass1;

public class WebAdress {
    /*
    write a program that can validate if a web adres is valid
    valid asdess:
    must start with www.
    must with .com or edu. or net. or gov

     */
    public static void main(String[] args) {
        String website= "www.cybertek.Gov";
        website= website.toLowerCase();//so no need to case sensitive

        boolean validEnding= website.endsWith(".com")|| website.endsWith(".edu")|| website.endsWith(".gov");

        if(website.startsWith("www.")&& validEnding) {

            System.out.println("valid address");

        }else{
            System.out.println("invalid");
        }













    }
}
