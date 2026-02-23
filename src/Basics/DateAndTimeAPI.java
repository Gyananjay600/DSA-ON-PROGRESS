package Basics;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeAPI {
    public static void main(String[] args) {


        LocalDate date = LocalDate.now(); // today's date
        LocalTime time = LocalTime.now(); // today's current time

        System.out.println("Date: " + date + " Time: " + time);
    }
}
