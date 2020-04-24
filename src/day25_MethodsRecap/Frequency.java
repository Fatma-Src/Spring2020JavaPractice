package Day25_MethodsRecap;

public class Frequency {
    public static void main(String[] args) {

        String str1 = "javajavajava";
        String str2 = "java";

        int count = 0;
        while (str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");
            //we need to make we are not counting teh same index over again
            // you delete str2 into the str1 but count increase

        }
        System.out.println(count);

        String a = "AAABBBHHGSG";
        String b = "A";
        int num = Frequency(a, b);

        System.out.println(num);

    }

        public static int Frequency(String str1, String str2){
           int count=0;
            while (str1.contains(str2)) {
                count++;
                str1 = str1.replaceFirst(str2, "");
                //we need to make we are not counting teh same index over again
                // you delete str2 into the str1 but count increase


            }
        return count;

        }





}
