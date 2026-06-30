import java.util.Scanner;
//Complet mini project( Student management system)..

public class QUE120 {
    

    static String[] names = new String[10];
    static int[] marks = new int[10];
    static int count = 0;

    static Scanner sc = new Scanner(System.in);

    public static void addStudent() {

        System.out.print("Enter Student Name: ");
        names[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();
        sc.nextLine();

        count++;

        System.out.println("Student Added Successfully.");
    }

    public static void displayStudents() {

        if (count == 0) {
            System.out.println("No records found.");
            return;
        }

        System.out.println("\nStudent Records");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + names[i] + " - " + marks[i]);
        }
    }

    public static void searchStudent() {

        System.out.print("Enter student name: ");
        String search = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (names[i].equalsIgnoreCase(search)) {

                System.out.println("Student Found");
                System.out.println("Marks = " + marks[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student Not Found.");
        }
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== Student Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
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
    

