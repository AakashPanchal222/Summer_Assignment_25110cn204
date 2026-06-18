package DAY18;
import java.util.Scanner;
//Sort Array in Descending order

public class QUE72 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Descending Sort
        //So we swap whenever the left element is smaller than the right element.
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array in Descending Order:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
    

