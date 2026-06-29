import java.util.Scanner;
//String Operations..

public class QUE115 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int choice;

        do {

            System.out.println("\n===== STRING MENU =====");
            System.out.println("1. Length");
            System.out.println("2. Uppercase");
            System.out.println("3. Lowercase");
            System.out.println("4. Reverse");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Length = " + str.length());
                    break;

                case 2:

                    System.out.println(str.toUpperCase());// for upeer case
                    break;

                case 3:

                    System.out.println(str.toLowerCase());// or lower case
                    break;

                case 4:

                    String reverse = "";

                    for (int i = str.length() - 1; i >= 0; i--) {
                        reverse += str.charAt(i);
                    }

                    System.out.println("Reverse = " + reverse);
                    break;

                case 5:

                    System.out.println("Program Ended.");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}

