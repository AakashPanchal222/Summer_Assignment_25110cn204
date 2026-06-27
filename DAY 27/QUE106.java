import java.util.Scanner;
//Employee Management System..
public class QUE106 {
    
    static int[] empId = new int[100];
    static String[] empName = new String[100];
    static String[] dept = new String[100];
    static double[] salary = new double[100];
    static int count = 0;

    //we make functions for diffrent sepcifications 
    public static void addEmployee(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        empId[count] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        empName[count] = sc.nextLine();
        System.out.print("Enter Department: ");
        dept[count] = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary[count] = sc.nextDouble();
        count++;
        System.out.println("Employee added!");
    }

    public static void displayAll() {
        if (count == 0) { System.out.println("No records."); return; }
        System.out.println("\nID\tName\t\tDept\t\tSalary");
        for (int i = 0; i < count; i++)
            System.out.println(empId[i] + "\t" + empName[i] + "\t\t" + dept[i] + "\t\t" + salary[i]);
    }

    public static void searchEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (empId[i] == id) {
                System.out.println("Name: " + empName[i] + ", Dept: " + dept[i] + ", Salary: " + salary[i]);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void updateSalary(Scanner sc) {
        System.out.print("Enter Employee ID to update salary: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (empId[i] == id) {
                System.out.print("Enter new salary: ");
                salary[i] = sc.nextDouble();
                System.out.println("Salary updated.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    //MAIN FUNCTION..
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add  2. Display  3. Search  4. Update Salary  5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: addEmployee(sc); break;
                case 2: displayAll(); break;
                case 3: searchEmployee(sc); break;
                case 4: updateSalary(sc); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}
    

