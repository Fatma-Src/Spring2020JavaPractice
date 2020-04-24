package Day27_DateTime;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf) );

        /*
        create a date called birthDay: month/Days/year
                eX: 2020 04  23
                    Aprl/23/20
         */
        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("E MMM/dd/yy");
        LocalDate date2=LocalDate.of(1999,12,12);
        String str= date2.format(dtf2);
        System.out.println(str);

        LocalDate date3= LocalDate.now();
        System.out.println(date3.format(dtf2));






    }
}
