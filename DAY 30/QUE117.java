import java.util.Scanner;
//Student record sysytem using arrays ands strings.

public class QUE117 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        int[] marks = new int[5];

        System.out.println("Enter details of 5 students:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();// it cleans the keyboard buffer..
        }

        System.out.println("\nStudent Records");

        for (int i = 0; i < 5; i++) {
            System.out.println("Name: " + names[i] + "  Marks: " + marks[i]);
        }

        sc.close();
    }
}
    
    

