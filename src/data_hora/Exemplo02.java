package data_hora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Exemplo02 {
    public static void main(String[] args){

        LocalDate d04 = LocalDate.parse("2023-05-15");
        LocalDateTime d05 = LocalDateTime.parse("2023-05-15T12:46:45");
        Instant d06 = Instant.parse("2023-05-15T12:46:45Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d04 = " +d04.format(fmt1));
        System.out.println("d04 = " +fmt1.format(d04));
        System.out.println("d05 = " +d05.format(fmt1));
        System.out.println("d05 = " +d05.format(fmt2));

        System.out.println("d06 = " +fmt3.format(d06));
    }
}
