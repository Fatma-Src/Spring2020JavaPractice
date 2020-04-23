package day22_ArrayLoops;

public class Count_Odd_Even {
    public static void main(String[] args) {

        int []arr={1,2,3,4,5,6,7,8,9,10,11};

        int countOddNumbers=0;
        int countEvenNumber= 0;

        for(int each: arr){//this part confuse try again
            if(each % 2 ==0){
                countEvenNumber++;
                continue;
            }

            countOddNumbers++;





           /* if(each%2!=0){
                countOddNumbers++;
            }else{
                countEvenNumber++;
            }*/
        }

        System.out.println("Odd Number "+countOddNumbers);
        System.out.println("Even Number "+ countEvenNumber);
    }
}
