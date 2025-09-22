package Day8_extras;
import java.util.Scanner;
import java.time.*;

public class datetime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);
        System.out.println("Original Date: " + date);

        LocalDate added = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, 2 years: " + added);

        LocalDate finalDate = added.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate);

        sc.close();
    }
}