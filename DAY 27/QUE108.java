import java.util.Scanner;
//Marksheet Generation System..
public class QUE108 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        String[] subjects = new String[n];
        sc.nextLine();
        int total = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Subject " + (i+1) + " name: ");
            subjects[i] = sc.nextLine();
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
            total += marks[i];
        }
        double avg = (double) total / n;
        String grade;
        if (avg >= 90) grade = "A+";
        else if (avg >= 75) grade = "A";
        else if (avg >= 60) grade = "B";
        else if (avg >= 45) grade = "C";
        else grade = "F";

        String result = (avg >= 45) ? "PASS" : "FAIL";

        System.out.println("\n========== MARKSHEET ==========");
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + roll);
        System.out.println("--------------------------------");
        for (int i = 0; i < n; i++)
            System.out.println(subjects[i] + "\t: " + marks[i]);
        System.out.println("--------------------------------");
        System.out.println("Total   : " + total);
        System.out.printf("Average : %.2f%n", avg);
        System.out.println("Grade   : " + grade);
        System.out.println("Result  : " + result);
        System.out.println("================================");
        sc.close();
    }
}
    

