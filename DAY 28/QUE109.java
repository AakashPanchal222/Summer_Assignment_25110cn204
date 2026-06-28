
import java.util.Scanner;
//Library Managnement System


public class QUE109 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] books = {
                "Java",
                "Python",
                "C Programming",
                "HTML",
                "Data Structures"
        };

        boolean[] issued = new boolean[5];

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nBooks Available:");

                    for (int i = 0; i < books.length; i++) {
                        if (issued[i])
                            System.out.println((i + 1) + ". " + books[i] + " (Issued)");
                        else
                            System.out.println((i + 1) + ". " + books[i]);
                    }
                    break;

                case 2:
                    System.out.print("Enter Book Number: ");
                    int issue = sc.nextInt();

                    if (!issued[issue - 1]) {
                        issued[issue - 1] = true;
                        System.out.println("Book Issued Successfully.");
                    } else {
                        System.out.println("Book Already Issued.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Number: ");
                    int ret = sc.nextInt();

                    if (issued[ret - 1]) {
                        issued[ret - 1] = false;
                        System.out.println("Book Returned.");
                    } else {
                        System.out.println("Book was not issued.");
                    }
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
