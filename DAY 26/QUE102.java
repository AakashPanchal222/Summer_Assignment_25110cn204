import java.util.Scanner;
//Voting Eligibility System.
public class QUE102 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        //Main Loop..
        if (age >= 18) {
            System.out.println(name + ", you are eligible to vote.");
        } else {
            System.out.println(name + ", you are NOT eligible to vote.");
            System.out.println("You need " + (18 - age) + " more years.");
        }

        sc.close();
    }
}
    

