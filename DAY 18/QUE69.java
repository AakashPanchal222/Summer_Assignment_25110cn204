package DAY18;
import java.util.Scanner;
//Bubble Sort..
//Bigger no. comes after the end in every round of array traversing..

public class QUE69 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble Sort: here we swap two elements after comaparing there values
        // Bigger value moves to right
        for(int i = 0; i < n - 1; i++) {//1st loop = no. of rounds
            for(int j = 0; j < n - 1 - i; j++) {// 2nd loop for comparing two elements.
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];//swapping
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
    

