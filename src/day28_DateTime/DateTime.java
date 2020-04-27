package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {


    public static void main(String[] args) {

        LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt);

        LocalDateTime dt2= LocalDateTime.of(LocalDate.now(), LocalTime.now());

        //2020-03-20 11:25:30
        LocalDate date=LocalDate.of(2020,3,30);
        LocalTime time=LocalTime.of(11,25,30) ;
        LocalDateTime dt3= LocalDateTime.of(date,time);
        LocalDateTime dateTime2= LocalDateTime.of(2020,12,12,12,12);


        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("MM/dd/yy");//3/20/2020
        LocalDateTime dateTime3= LocalDateTime.of(2020,12,12,12,12);
        System.out.println(dateTime3.format(dtf));

    }
}