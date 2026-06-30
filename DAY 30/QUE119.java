import java.util.Scanner;
// Mini Employee Mnagment System..
public class   QUE119 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] id = new int[3];
        String[] name = new String[3];
        double[] salary = new double[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter Employee ID: ");
            id[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
        }

        System.out.println("\nEmployee Details");

        for (int i = 0; i < 3; i++) {

            System.out.println("ID : " + id[i]);
            System.out.println("Name : " + name[i]);
            System.out.println("Salary : " + salary[i]);
            System.out.println();
        }

        sc.close();
    }
}