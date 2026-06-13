package DAY13;
import java.util.Scanner;
//FINDING LARGEST AND SMALLEST ELEMENTS IN AN ARRAY..

public class QUE51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//TAKING LARGEST AND SMALLEST AS ZERO INDEX ELEMENT..
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {// FOR LARGEST..
                largest = arr[i];
            }

            if (arr[i] < smallest) {//FOR SMALLEST..
                smallest = arr[i];
            }
        }
// FOR PRINTING
        System.out.println("Largest element = " + largest);
        System.out.println("Smallest element = " + smallest);
        sc.close();
    }
}
