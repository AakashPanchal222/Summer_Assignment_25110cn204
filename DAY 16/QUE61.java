package DAY16;
import java.util.Scanner;
//FINDING MISSING NO. IN AN ARRAY..

public class QUE61 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array (n-1): ");
        // we assume that the array contains numbers from 1 to n+1, but one number is mising.so we take n-1.
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = (n + 1) * (n + 2) / 2;
         /*Sum of 1 to 5 = 15
           Array Sum = 11
           Missing Number = 15 - 11 = 4 */
        int arraySum = 0;

        for (int i = 0; i < n; i++) {
            arraySum += arr[i];
        }

        int missing = totalSum - arraySum;

        System.out.println("Missing Number = " + missing);
        sc.close();
    }
}
    

