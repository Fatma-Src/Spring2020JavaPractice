package day16_ForLoop;

public class Continue_Practice {
    // skip print Y,H,J,D  but backwards
    public static void main(String[] args) {
        for(char ch=  'Z' ; ch> 'A'; ch-- ){
            if (ch=='Y'|| ch=='H'|| ch == 'D'||ch=='D') {
                continue;
            }

            System.out.print(ch+" ");
        }
        System.out.println();
        for(int i =1;i<= 100;i++){
            if(i%3==0||i%5==0){// but it is not continue && logic
                continue;
            }
            System.out.print(i+" ");
        }










    }
}
