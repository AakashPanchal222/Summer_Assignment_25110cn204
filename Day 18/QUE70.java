package DAY18;
import java.util.Scanner;
//Selection sort..
/*Every round:
Find the smallest element.
Put it at the correct position. */

public class QUE70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Selection Sort
        for(int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for(int j = i + 1; j < n; j++) {/*Since index 0 is already being treated as the smallest candidate, there's no need to compare it with itself. */
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swapping array of i with minmum index array..
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("Sorted Array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
    

