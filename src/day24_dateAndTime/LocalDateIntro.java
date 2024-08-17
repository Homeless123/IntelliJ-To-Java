package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birtDay = LocalDate.of(1995,01,24);
        System.out.println(birtDay);
        LocalDate myBirtDay = LocalDate.of(1993,11,19);

        System.out.println("---------------------");

        System.out.println(today.getYear() );
        System.out.println(today.getMonth() );
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfWeek());
        System.out.println(myBirtDay.getDayOfWeek());
        System.out.println(birtDay.getDayOfWeek());

        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfYear());

        System.out.println("-------------------------------");

        today=today.plusYears(1);
        System.out.println(today);
        System.out.println("---------------------------");

        LocalDate graduationDate = LocalDate.of(2025,6,4);
        graduationDate=graduationDate.plusYears(2);

        System.out.println(graduationDate);

        graduationDate=graduationDate.plusMonths(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusWeeks(7);
        System.out.println(graduationDate);

        graduationDate = graduationDate.plusDays(100);
        System.out.println(graduationDate);

        LocalDate yourBirthDay = LocalDate.of(1993,11,19);
        LocalDate yourBrotherBirthDay=yourBirthDay.minusYears(2).minusMonths(3);
        LocalDate ertuBirtDay = yourBirthDay.plusMonths(20).plusDays(5);


        System.out.println(yourBirthDay);
        System.out.println(yourBrotherBirthDay);
        System.out.println(ertuBirtDay);

        System.out.println("-------------------");

        LocalDate birtday1= LocalDate.of(1994,7,7);
        LocalDate birtday2= LocalDate.of(1995,6,7);
        LocalDate birtday3= LocalDate.of(1994,7,7);

        boolean r1 = birtday1.isEqual(birtday2);
        boolean r2 = birtday1.isEqual(birtday3);
        System.out.println(r1);
        System.out.println(r2);

        System.out.println("------------------------");

        LocalDate grad_date = LocalDate.of(2023,1,1);
        System.out.println(grad_date.isBefore(  LocalDate.of(2022,12,31)));
        System.out.println(grad_date.isAfter( LocalDate.of(2022,12,31)));

        System.out.println( LocalDate.of(2022,6,16).isLeapYear());


    }
}
