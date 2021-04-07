import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {

    @Test
    void dates() {
        LocalDate localDate = LocalDate.parse("07.04.2021", DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        assertEquals(DayOfWeek.WEDNESDAY, localDate.getDayOfWeek());
    }

    @Test
    void second() {
        LocalDate localDate = LocalDate.parse("07.04.2021", DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        assertEquals(DayOfWeek.WEDNESDAY, localDate.getDayOfWeek());
    }
}
