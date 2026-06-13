package DAY13;
import java.util.Scanner;
//Count Even and Odd Elements..

public class QUE52 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];//for array size

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
// TAKING TWO VARIABLES TO COUNT EVEN AND ODD ELEMENTS..
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;//FOR EVEN COUNT..
            } else {
                oddCount++;//FOR ODD COUNT..
            }
        }
// FOR PRINTING...
        System.out.println("Even elements = " + evenCount);
        System.out.println("Odd elements = " + oddCount);
        sc.close();
    }
}

    

