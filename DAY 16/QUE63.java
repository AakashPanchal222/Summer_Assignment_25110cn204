package DAY16;
import java.util.Scanner;
//FINDING PAIR WITH GIVEN SUM..

public class QUE63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int sum = sc.nextInt();

        boolean found = false;

        // here we used two loops so that every element can shake hands with everey other element.
        /*2 talks to 4
        2 talks to 6
        2 talks to 8

        4 talks to 6
        4 talks to 8

        6 talks to 8 */
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair Found: " + arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No Pair Found");
        }
        sc.close();
    }
}

    
