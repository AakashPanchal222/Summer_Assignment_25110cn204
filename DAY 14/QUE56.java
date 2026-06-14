package DAY14;
import java.util.Scanner;
// TO FIND DUPLICATE OF AN ARRAY.

public class QUE56 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate Elements:");

        for (int i = 0; i < n; i++) {
            boolean isDuplicatePrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isDuplicatePrinted = true;
                    break;
                }
            }

            if (isDuplicatePrinted) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}