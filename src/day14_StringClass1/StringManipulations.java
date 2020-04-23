package day14_StringClass1;

public class StringManipulations {
    public static void main(String[] args) {

     String str= "I Like to learn Java. I like to watch the movoe Jumaji";
     int a1= str.indexOf("J");
        System.out.println(a1);
        int a2 = str.indexOf("Jum");
        System.out.println(a2);

        int a3= str.indexOf(" I"+1);//second I index number we add 1 because it find " "
        System.out.println(a3);

        String s = " I like Java, and I like reading";
        int b1 = str.lastIndexOf("I");
        System.out.println(b1);

        int b2= s.lastIndexOf("l");
        System.out.println(b2);

        String z = "I like C#, C# is cool";
        int c1 = z.lastIndexOf("C");
        System.out.println(c1);

        String x = "I like Java, Java is fun, Java programming is fun";
        int d1= x.indexOf("Java is");// second J ndex number
        System.out.println(d1);
        int d2 =x.indexOf(", J")+2;
        System.out.println(d2);//second Java 's J
        int d3= x.lastIndexOf("J");//last J index number
        System.out.println(d3);

        int d4 = x.indexOf("Java p");//last J
        System.out.println(d4);


        char ch1 = x.charAt(26);
        System.out.println(ch1);







    }
}
