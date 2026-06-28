import java.util.Scanner;
//Contact management system..

public class QUE112 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        String[] numbers = new String[5];

        int count = 0;

        int choice;

        do {

            System.out.println("\n===== Contact Menu =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    if (count < 5) {

                        System.out.print("Enter Name: ");
                        names[count] = sc.nextLine();

                        System.out.print("Enter Number: ");
                        numbers[count] = sc.nextLine();

                        count++;

                        System.out.println("Contact Added.");
                    } else {
                        System.out.println("Contact List Full.");
                    }

                    break;

                case 2:

                    System.out.println("\nContacts:");

                    for (int i = 0; i < count; i++) {
                        System.out.println(names[i] + " - " + numbers[i]);
                    }

                    break;

                case 3:

                    System.out.print("Enter Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (names[i].equalsIgnoreCase(search)) {

                            System.out.println("Number = " + numbers[i]);

                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Contact Not Found.");

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
    

