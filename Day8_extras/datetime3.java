package Day8_extras;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class datetime3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Current date in dd/MM/yyyy: " + today.format(format1));
        
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Current date in yyyy-MM-dd: " + today.format(format2));
        
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Current date in EEE, MMM dd, yyyy: " + today.format(format3));
    }
}

