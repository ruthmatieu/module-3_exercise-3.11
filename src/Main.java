import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = reader.nextInt();

        System.out.print("Enter year: ");
        int year = reader.nextInt();

        reader.close();

        LocalDate date = LocalDate.of(year, month, 1);
        int days = date.lengthOfMonth();
        Month mon = date.getMonth();

        System.out.println(mon.toString() + " " + year + " had " + days + " days.");

    }
}