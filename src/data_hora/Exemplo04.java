package data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Exemplo04 {

    public static void main(String[] args) {

        // Cálculos com date e hora

        LocalDate d04 = LocalDate.parse("2023-05-15");
        LocalDateTime d05 = LocalDateTime.parse("2023-05-15T12:46:45");
        Instant d06 = Instant.parse("2023-05-15T01:30:00Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nexWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nexWeekLocalDate = " + nexWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nexWeekLocalDateTime = d05.plusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nexWeekLocalDateTime = " + nexWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nexWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nexWeekInstant = " + nexWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);


        System.out.println("t1 dias = " +t1.toDays());
        System.out.println("t2 dias = " +t2.toDays());
        System.out.println("t3 dias = " +t3.toDays());

    }

}
