import java.util.Scanner;
//Student record management system

public class QUE105 {
    static int[] rollNo = new int[100];
    static String[] names = new String[100];
    static float[] marks = new float[100];
    static int count = 0;

    public static void addStudent(Scanner sc) {
        System.out.print("Enter Roll No: ");
        rollNo[count] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        names[count] = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks[count] = sc.nextFloat();
        count++;
        System.out.println("Student added successfully!");
    }

    public static void displayAll() {
        if (count == 0) { System.out.println("No records found."); return; }
        System.out.println("\nRoll No\tName\t\tMarks");
        for (int i = 0; i < count; i++)
            System.out.println(rollNo[i] + "\t" + names[i] + "\t\t" + marks[i]);
    }

    public static void searchStudent(Scanner sc) {
        System.out.print("Enter Roll No to search: ");
        int r = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (rollNo[i] == r) {
                System.out.println("Found: " + names[i] + ", Marks: " + marks[i]);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void deleteStudent(Scanner sc) {
        System.out.print("Enter Roll No to delete: ");
        int r = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (rollNo[i] == r) {
                for (int j = i; j < count - 1; j++) {
                    rollNo[j] = rollNo[j+1];
                    names[j] = names[j+1];
                    marks[j] = marks[j+1];
                }
                count--;
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Add  2. Display  3. Search  4. Delete  5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: addStudent(sc); break;
                case 2: displayAll(); break;
                case 3: searchStudent(sc); break;
                case 4: deleteStudent(sc); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}

