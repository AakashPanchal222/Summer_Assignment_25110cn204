//Ticket Booking System..
import java.util.Scanner;

public class QUE111 {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSeats = 10;

        int choice;

        do {

            System.out.println("\n===== Ticket Booking =====");
            System.out.println("1. Check Available Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Available Seats = " + totalSeats);
                    break;

                case 2:
                    if (totalSeats > 0) {
                        totalSeats--;
                        System.out.println("Ticket Booked Successfully.");
                    } else {
                        System.out.println("No Seats Available.");
                    }
                    break;

                case 3:
                    totalSeats++;
                    System.out.println("Ticket Cancelled.");
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);
        sc.close();
    }
}
    

