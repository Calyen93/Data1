import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        String input = "2002-03-01T13:00:00Z";

        OffsetDateTime offsetDateTime = OffsetDateTime.parse(input);

        String fullFormat = DateTimeFormatter
                .ofLocalizedDate(FormatStyle.FULL)
                .format(offsetDateTime);

        String mediumFormat = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.MEDIUM)
                .format(offsetDateTime);

        String shortFormat = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT)
                .format(offsetDateTime);

        System.out.println("FULL: " + fullFormat);
        System.out.println("MEDIUM: " + mediumFormat);
        System.out.println("SHORT: " + shortFormat);
    }
}