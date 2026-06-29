import java.util.Scanner;
//Inventory M1angement System..

public class QUE116 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] itemName = new String[10];
        int[] quantity = new int[10];

        int count = 0;
        int choice;

        do {

            System.out.println("\n===== INVENTORY MENU =====");
            System.out.println("1. Add Item");
            System.out.println("2. Display Items");
            System.out.println("3. Search Item");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    if (count < 10) {

                        System.out.print("Enter Item Name: ");
                        itemName[count] = sc.nextLine();

                        System.out.print("Enter Quantity: ");
                        quantity[count] = sc.nextInt();

                        count++;

                        System.out.println("Item Added.");
                    } else {
                        System.out.println("Inventory Full.");
                    }

                    break;

                case 2:

                    System.out.println("\nInventory List:");

                    for (int i = 0; i < count; i++) {

                        System.out.println(itemName[i] + " - " + quantity[i]);
                    }

                    break;

                case 3:

                    System.out.print("Enter Item Name: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (itemName[i].equalsIgnoreCase(search)) {

                            System.out.println("Quantity = " + quantity[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Item Not Found.");

                    break;

                case 4:

                    System.out.println("Program Closed.");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
