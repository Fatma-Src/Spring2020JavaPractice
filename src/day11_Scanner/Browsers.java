package day11_Scanner;
/*
write a program that can display the selected browser
                        1. declear a String variable called browserName
                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this tas
 */

public class Browsers {
    public static void main(String[] args) {
        String browerName ="Chrome";

        switch(browerName){

            case "chrome":
            case "Chrome":
                System.out.println("Chrome is opening...");
                break;
            case "firefox":
            case "Firefox":
                System.out.println("Firefox is opening...");
                break;
            case "safari":
            case "Safari":
                System.out.println("Safari is opening...");
                break;
            case "opera":
            case "Opera":
                System.out.println("Opera is opening...");
                break;
            default :
                System.out.println("invalid Browser Name ");

            //we can use break every where with the break

        }












    }














}