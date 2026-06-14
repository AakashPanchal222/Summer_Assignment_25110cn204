package DAY14;
import java.util.Scanner;
//FREQUENCY OF ELEMENT IN AN ARRAY.

public class QUE54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element To  find Frequency: ");
        int num = sc.nextInt();

        int count = 0;

        // LOOP TO COUNT THE FREQUENCY OF THE ELEMENT IN THE ARRAY.
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                count++;
            }
        }

        System.out.println("Frequency of " + num + " = " + count);

        sc.close();
    }
}
    

