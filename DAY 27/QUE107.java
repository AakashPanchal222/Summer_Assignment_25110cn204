import java.util.Scanner;
//Salary Management System..
public class QUE107 {
    
    static int[] empId = new int[100];
    static String[] empName = new String[100];
    static double[] basic = new double[100];
    static int count = 0;

    static double calcHRA(double b)  { return 0.20 * b; }
    static double calcDA(double b)   { return 0.50 * b; }
    static double calcPF(double b)   { return 0.12 * b; }
    static double calcNet(double b)  { return b + calcHRA(b) + calcDA(b) - calcPF(b); }

    public static void addEmployee(Scanner sc) {
        System.out.print("Enter ID: ");
        empId[count] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        empName[count] = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basic[count] = sc.nextDouble();
        count++;
        System.out.println("Employee added!");
    }

    public static void generateSlip(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (empId[i] == id) {
                double b = basic[i];
                System.out.println("\n===== Salary Slip =====");
                System.out.println("Name       : " + empName[i]);
                System.out.println("Basic      : " + b);
                System.out.println("HRA (20%)  : " + calcHRA(b));
                System.out.println("DA  (50%)  : " + calcDA(b));
                System.out.println("PF  (12%)  : " + calcPF(b));
                System.out.println("Net Salary : " + calcNet(b));
                System.out.println("=======================");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void displayAll() {
        System.out.println("\nID\tName\t\tBasic\t\tNet Salary");
        for (int i = 0; i < count; i++)
            System.out.println(empId[i] + "\t" + empName[i] + "\t\t" + basic[i] + "\t\t" + calcNet(basic[i]));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Salary Management System ---");
            System.out.println("1. Add Employee  2. Generate Slip  3. Display All  4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: addEmployee(sc); break;
                case 2: generateSlip(sc); break;
                case 3: displayAll(); break;
                case 4: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
}

