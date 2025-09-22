package Day8_extras;
import java.time.LocalDate;
import java.util.Scanner;

public class datetime4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first date (yyyy-MM-dd): ");
        String input1 = sc.nextLine();
        System.out.print("Enter second date (yyyy-MM-dd): ");
        String input2 = sc.nextLine();

        LocalDate date1 = LocalDate.parse(input1);
        LocalDate date2 = LocalDate.parse(input2);
        
        if (date1.isBefore(date2)) {
            System.out.println("First date (" + date1 + ") is BEFORE second date (" + date2 + ")");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date (" + date1 + ") is AFTER second date (" + date2 + ")");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the SAME: " + date1);
        }
        sc.close();
    }
}
