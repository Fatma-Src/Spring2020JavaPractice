package day34_CustomClass;

public class Carpet {


    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public double calsCost(){
        double total= (width+length)*unitPrice;
        if (isPersian){
            return total+200;

        }else {
            return total;
        }

       //return (isPersian)?  total+200 :total;

    }
     public void customOrder (double carpetWith, double carpetLength, double carpetUnitPrice,boolean carpetPerseian) {
        width=carpetWith;
        length= carpetLength;
        unitPrice=carpetUnitPrice;
        isPersian= carpetPerseian;

     }

     public String toString(){
        return "width $ "+width+
                "\nlength $"+length+
                "\nunit price $"+ unitPrice+
                "\n Total cost $ "+calsCost()



                ;

     }


   //(w+l)*unitprice







}
