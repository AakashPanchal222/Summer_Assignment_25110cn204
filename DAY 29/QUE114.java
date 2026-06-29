import java.util.Scanner;
//Array Operations

public class QUE114 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;
        //Choices..
        do {

            System.out.println("\n===== ARRAY MENU =====");
            System.out.println("1. Display Array");
            System.out.println("2. Find Sum");
            System.out.println("3. Find Largest");
            System.out.println("4. Search Element");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Array: ");

                    for (int num : arr) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;

                case 2:

                    int sum = 0;

                    for (int num : arr)
                        sum += num;

                    System.out.println("Sum = " + sum);
                    break;

                case 3:

                    int max = arr[0];

                    for (int num : arr) {
                        if (num > max)
                            max = num;
                    }

                    System.out.println("Largest = " + max);
                    break;

                case 4:

                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();

                    boolean found = false;

                    for (int num : arr) {

                        if (num == key) {
                            found = true;
                            break;
                        }
                    }

                    if (found)
                        System.out.println("Element Found.");
                    else
                        System.out.println("Element Not Found.");

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
    

