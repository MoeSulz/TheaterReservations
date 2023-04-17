import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        String fullName = input.nextLine();
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate datestr = LocalDate.parse(date, formatter);
        System.out.print("How many tickets would you like? ");
        int ticketAmount = input.nextInt();

        String[] lastFirst = fullName.split(" ");
        String firstname = lastFirst[0];
        String lastName = lastFirst[1];

        System.out.println(ticketAmount + " reserved for " + date + " under " + lastName + ", " + firstname);
    }
}
