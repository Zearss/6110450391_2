import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class JavaLocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime birthdayOfStudent = LocalDateTime.of(2000, 2, 25, 10, 11, 00, 50000);

        int sia = birthdayOfStudent.getDayOfMonth();

        System.out.println(sia);

    }

}
