package day17_WhileLoop;

public class PalindromeTest {
    public static void main(String[] args) {
        String str="level" ;

        String reversedStr = "";//store reversed stirng

        int index= str.length()-1;//last index number

        while(index>=0){
        reversedStr+=str.charAt(index);
            index--;
        }
        System.out.println(reversedStr);

        boolean palindrome=reversedStr.equalsIgnoreCase(str);
        System.out.println(palindrome);






    }
}
