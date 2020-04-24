package Day25_MethodsRecap;

public class RemoveDuplicate_String {
    /*
find duplicate
     */
    public static void main(String[] args) {
        String str = "ABBBBAAABBC";
        String result2= RemoveDuplicates(str);
        System.out.println(result2);


    }

    public static String RemoveDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = str.charAt(i) + "";//A
            if (!result.contains(ch)) {
                result += ch;

            }

        }
        return result;
    }

}





